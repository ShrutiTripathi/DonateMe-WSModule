package com.jkt.donateme;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jkt.donateme.businessservice.PatientSignUpBusinessService;
import com.jkt.donateme.dataservice.PatientSignUpDataService;

@Path("/patient")
@Component
public class PatientSignUpController {

	@Autowired
	PatientSignUpBusinessService patientSignUpBusinessService;
	@Autowired
	PatientSignUpDataService patientSignUpDataService;

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
	public Response registerPatient(final RegistrationForm registrationForm) {
		Response response = null;
		Boolean isSave = patientSignUpBusinessService
				.saveSignUpInfo(registrationForm);
		if (isSave) {
			return Response.status(2).entity("Saved Successfully").build();

		} else {
			response = Response.status(1).entity("Failed to Save").build();

		}

		return response;
	}

	@POST
	@Path("/email")
	@Produces(MediaType.TEXT_XML)
	public Response emailValidation(final String email) {
		Boolean result = patientSignUpDataService.findEmailID(email);
		if (result) {
			return Response.status(2).entity("failed to Save").build();
		} else {
			return Response.status(1).entity("Saved Successfully").build();
		}
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
