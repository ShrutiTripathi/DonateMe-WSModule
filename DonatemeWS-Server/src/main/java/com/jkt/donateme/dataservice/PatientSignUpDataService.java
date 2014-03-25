package com.jkt.donateme.dataservice;

import com.jkt.donateme.RegistrationForm;

public interface PatientSignUpDataService {

	RegistrationForm saveSignUpInfo(final RegistrationForm signUpFields);
}
