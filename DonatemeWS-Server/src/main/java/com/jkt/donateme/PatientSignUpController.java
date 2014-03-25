package com.jkt.donateme;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.jkt.donateme.businessservice.PatientSignUpBusinessService;

@Path("/patient")
@Component
public class PatientSignUpController {

	@Autowired
	PatientSignUpBusinessService patientSignUpBusinessService;

	/**
	 * When Patient signs up, the registration form gets save in the Patient
	 * collection.
	 * 
	 * @param registrationForm
	 * @return registrationForm
	 */
	@POST
	@Path("/signup")
	@Produces(MediaType.TEXT_XML)
	public RegistrationForm registerPatient(
			final RegistrationForm registrationForm) {
		patientSignUpBusinessService.saveSignUpInfo(registrationForm);
		return registrationForm;
	}

	/**
	 * getter for PatientSignUpBusinessService
	 * 
	 * @return PatientSignUpBusinessService
	 */
	public PatientSignUpBusinessService getPatientSignUpBusinessService() {
		return patientSignUpBusinessService;
	}

	/**
	 * Setter for PatientSignUpBusinessService
	 * 
	 * @param patientSignUpBusinessService
	 */
	@Autowired
	public void setPatientSignUpBusinessService(
			final PatientSignUpBusinessService patientSignUpBusinessService) {
		this.patientSignUpBusinessService = patientSignUpBusinessService;
	}

}
