package com.jkt.donateme.businessservice;

import com.jkt.donateme.RegistrationForm;

public interface PatientSignUpBusinessService {
	
	Boolean saveSignUpInfo(final RegistrationForm signUpFields);

}
