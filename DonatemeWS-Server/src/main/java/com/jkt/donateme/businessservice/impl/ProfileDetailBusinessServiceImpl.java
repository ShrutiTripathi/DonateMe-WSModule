package com.jkt.donateme.businessservice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jkt.donateme.ProfileDetailFields;
import com.jkt.donateme.businessservice.ProfileDetailBusinessService;
import com.jkt.donateme.dataservice.ProfileDetailDataService;

@Service("profileDetailBusinessService")
public class ProfileDetailBusinessServiceImpl implements
		ProfileDetailBusinessService {

	@Autowired
	ProfileDetailDataService profileDetailDataService;

	/**
	 * Saving Patient SignUp Fields through data service layer
	 */
	public Boolean saveSignUpInfo(final ProfileDetailFields profileDetailFields) {
		return profileDetailDataService.saveSignUpInfo(profileDetailFields);
	}

	
}
