package com.jkt.donateme.dataservice;

import com.jkt.donateme.RegistrationForm;

public interface PatientSignUpDataService {

	Boolean saveSignUpInfo(final RegistrationForm signUpFields);
	
	boolean findEmailID(String emailID);
}


