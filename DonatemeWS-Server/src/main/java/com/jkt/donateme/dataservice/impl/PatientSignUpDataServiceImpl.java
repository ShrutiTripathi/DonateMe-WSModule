package com.jkt.donateme.dataservice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.jkt.donateme.RegistrationForm;
import com.jkt.donateme.dataservice.PatientSignUpDataService;

@Service("patientSignUpDataService")
public class PatientSignUpDataServiceImpl implements PatientSignUpDataService {

	@Autowired
	private MongoTemplate mongoTemplate;

	/**
	 * Getting response in return from the web service as Status Codes.
	 */
	@Override
	public Boolean saveSignUpInfo(final RegistrationForm signUpFields) {
		Boolean isSave = false;
		try {
			if (!findEmailID(signUpFields.getEmail())) {

				mongoTemplate.save(signUpFields, "patient");
				isSave = true;

			}

		} catch (Exception e) {

		}
		return isSave;

	}

	/**
	 * Getter for MongoTemplate
	 * 
	 * @return mongoTemplate
	 */
	public MongoTemplate getMongoTemplate() {
		return mongoTemplate;
	}

	/**
	 * Setter for MongoTemplate
	 * 
	 * @param mongoTemplate
	 */
	public void setMongoTemplate(final MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	@Override
	public boolean findEmailID(String emailID) {
		boolean isExist = false;
		Query query = new Query();
		query.addCriteria(Criteria.where("email").is(emailID));

		RegistrationForm form = mongoTemplate.findOne(query,
				RegistrationForm.class, "patient");

		if (form != null) {

			isExist = true;
		}
		return isExist;
	}
}
