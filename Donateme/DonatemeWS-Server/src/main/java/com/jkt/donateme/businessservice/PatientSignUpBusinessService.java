package com.jkt.donateme.businessservice;

import com.jkt.donateme.RegistrationForm;

public interface PatientSignUpBusinessService {
	
	RegistrationForm saveSignUpInfo(final RegistrationForm signUpFields);

}
