/*package com.jkt.donateme;

import junit.framework.TestCase;
import org.easymock.EasyMock;
import com.jkt.donateme.businessservice.PatientSignUpBusinessService;

public class PatientSignUpControllerTest extends TestCase {

	private PatientSignUpBusinessService patientSignUpBusinessService;
	private PatientSignUpController patientSignUpController;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		patientSignUpBusinessService = EasyMock
				.createMock(PatientSignUpBusinessService.class);

		patientSignUpController = new PatientSignUpController();
		patientSignUpController
				.setPatientSignUpBusinessService(patientSignUpBusinessService);
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testPatientRegistration() {

		RegistrationForm expectedSignUpFields = createPatientSignUpInfo();
		
		EasyMock.expect(
				patientSignUpBusinessService
						.saveSignUpInfo(expectedSignUpFields)).andReturn(
				new RegistrationForm());
		EasyMock.replay();
		RegistrationForm registrationForm = patientSignUpController
				.registerPatient(expectedSignUpFields);
		EasyMock.verify();
		assertEquals(expectedSignUpFields, registrationForm);

	}

	public RegistrationForm createPatientSignUpInfo() {

		RegistrationForm signUpFields = new RegistrationForm();
		signUpFields.setFirstName("Shruti");
		signUpFields.setLastName("Tripathi");
		signUpFields.setEmail("shrutimailing1989@gmail.com");
		signUpFields.setPassword("password");
		signUpFields.setDob("12/10/1989");

		return signUpFields;

	}

}
*/