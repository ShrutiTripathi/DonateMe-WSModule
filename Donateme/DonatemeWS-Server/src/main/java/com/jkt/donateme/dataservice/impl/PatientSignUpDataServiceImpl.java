package com.jkt.donateme.dataservice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import com.jkt.donateme.RegistrationForm;
import com.jkt.donateme.dataservice.PatientSignUpDataService;

@Service("patientSignUpDataService")
public class PatientSignUpDataServiceImpl implements PatientSignUpDataService {

	@Autowired
	private MongoTemplate mongoTemplate;

	/**
	 * Getting response in return from the webservice as Status Codes.
	 */
	@Override
	public RegistrationForm saveSignUpInfo(final RegistrationForm signUpFields) {
		mongoTemplate.save(signUpFields, "patient");
		return signUpFields;

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
}
