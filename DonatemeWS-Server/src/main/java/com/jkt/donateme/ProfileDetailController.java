package com.jkt.donateme;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jkt.donateme.businessservice.ProfileDetailBusinessService;
import com.jkt.donateme.dataservice.ProfileDetailDataService;

@Path("/patient2")
@Component
public class ProfileDetailController {

	@Autowired
	ProfileDetailBusinessService profileDetailBusinessService;
	@Autowired
	ProfileDetailDataService profileDetailDataService;

	/**
	 * When Patient signs up, the registration form gets save in the Patient
	 * collection.
	 * 
	 * @param registrationForm
	 * @return registrationForm
	 */
	@POST
	@Path("/profile")
	@Produces(MediaType.TEXT_XML)
	public Response registerPatient(final ProfileDetailFields profileDetailFields) {
		Response response = null;
		Boolean isSave = profileDetailBusinessService
				.saveSignUpInfo(profileDetailFields);
		if (isSave) {
			return Response.status(2).entity("Saved Successfully").build();

		} else {
			response = Response.status(1).entity("Failed to Save").build();

		}

		return response;
	}



}
