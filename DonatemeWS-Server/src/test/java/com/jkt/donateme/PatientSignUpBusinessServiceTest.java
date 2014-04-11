/*package com.jkt.donateme;

import junit.framework.TestCase;

import org.easymock.EasyMock;

import com.jkt.donateme.businessservice.impl.PatientSignUpBusinessServiceImpl;
import com.jkt.donateme.dataservice.PatientSignUpDataService;

public class PatientSignUpBusinessServiceTest extends TestCase {
	private PatientSignUpBusinessServiceImpl patientSignUpBusinessService;
	private PatientSignUpDataService mockPatientSignUpDataService;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		mockPatientSignUpDataService = EasyMock.createMock(PatientSignUpDataService.class);
		patientSignUpBusinessService = new PatientSignUpBusinessServiceImpl();
		patientSignUpBusinessService.setPatientSignUpDataService(mockPatientSignUpDataService);
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testSavePatient() {
		RegistrationForm expectedSignUpFields = createPatientSignUpInfo();
		EasyMock.expect(mockPatientSignUpDataService.saveSignUpInfo(expectedSignUpFields)).andReturn(null);
		
		EasyMock.replay();
		RegistrationForm statusCodes = patientSignUpBusinessService.saveSignUpInfo(expectedSignUpFields);
		assertEquals(null, statusCodes);
		EasyMock.verify();

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