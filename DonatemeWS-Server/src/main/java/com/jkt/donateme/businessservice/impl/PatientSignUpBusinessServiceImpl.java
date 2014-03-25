package com.jkt.donateme.businessservice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jkt.donateme.RegistrationForm;
import com.jkt.donateme.businessservice.PatientSignUpBusinessService;
import com.jkt.donateme.dataservice.PatientSignUpDataService;

@Service("patientSignUpBusinessService")
public class PatientSignUpBusinessServiceImpl implements
		PatientSignUpBusinessService {

	@Autowired
	PatientSignUpDataService patientSignUpDataService;

	/**
	 * Getter for PatientSignUpDataService
	 * 
	 * @return patientSignUpDataService
	 */
	public PatientSignUpDataService getPatientSignUpDataService() {
		return patientSignUpDataService;
	}

	/**
	 * Setter for PatientSignUpDataService
	 * 
	 * @param patientSignUpDataService
	 */
	public void setPatientSignUpDataService(
			final PatientSignUpDataService patientSignUpDataService) {
		this.patientSignUpDataService = patientSignUpDataService;
	}

	/**
	 * Saving Patient SignUp Fields through data service layer
	 */
	public RegistrationForm saveSignUpInfo(final RegistrationForm signUpFields) {
		return patientSignUpDataService.saveSignUpInfo(signUpFields);
	}
}
