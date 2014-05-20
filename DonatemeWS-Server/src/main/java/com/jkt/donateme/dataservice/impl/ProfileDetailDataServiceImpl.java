package com.jkt.donateme.dataservice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.jkt.donateme.ProfileDetailFields;
import com.jkt.donateme.dataservice.ProfileDetailDataService;

@Service("profileDetailDataService")

public class ProfileDetailDataServiceImpl implements ProfileDetailDataService {

	@Autowired
	private MongoTemplate mongoTemplate;

	/**
	 * Getting response in return from the web service as Status Codes.
	 */
	@Override
	public Boolean saveSignUpInfo(final ProfileDetailFields profileDetailFields) {
		
				mongoTemplate.save(profileDetailFields, "profileDetails");
				return true;

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

	/*@Override
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
	}*/
}
