package edu.mum.cs.cs425.hcmcpatientsmgnt;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.mum.cs.cs425.hcmcpatientsmgnt.model.Patient;
import edu.mum.cs.cs425.hcmcpatientsmgnt.model.PrimaryAddress;
import edu.mum.cs.cs425.hcmcpatientsmgnt.repository.PatientRepository;
import edu.mum.cs.cs425.hcmcpatientsmgnt.service.PatientService;
import edu.mum.cs.cs425.hcmcpatientsmgnt.service.PrimaryAddressService;

@SpringBootApplication
//public class HcmcpatientsmgntApplication implements CommandLineRunner{
	public class HcmcpatientsmgntApplication {	
	
//	private PatientService patientService;
//	private PrimaryAddressService primaryAddressService;
//	public HcmcpatientsmgntApplication (PatientService patientService,PrimaryAddressService primaryAddressService) {
//		this.patientService=patientService;
//		this.primaryAddressService = primaryAddressService;
//	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(HcmcpatientsmgntApplication.class, args);
	}

//	@Override
	//public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
	//	System.out.println("hello Program Started");
//		Patient p1 = new Patient("P1000001","Yes","John H. Smith", "jhsmith@globalmail.net",
//				"(641)-001-0012", LocalDate.of(1959,5,21));
//		//System.out.println(createNewPatient(p1));
//		Patient p2 = new Patient("EP1000002","Yes","Ann-Marie Washington",
//                "awashington@hcmc.org","(641) 002-0034",LocalDate.of(1949,12,3));
//		createNewPatient(p2);
//        Patient p3 = new Patient("EP1000003","No","Diego A. Ortiz ","diego@gmail.com",
//                "(641) 004-0015",LocalDate.of(1979,11,14));
//        createNewPatient(p3);
//        Patient p4 = new Patient("EP1000004","No","Jharna ",null,
//                "(641) 004-0017",LocalDate.of(1998,11,14));
//        createNewPatient(p4);

//		patientRepository.save(p1);
//		patientRepository.save(p2);
//		patientRepository.save(p3);
//		patientRepository.save(p4);
		//printAllPatients();
		//printAllPatients();
//		printPatientById((long) 1);
//		printPatientById((long) 10);
	//	updateAndPrintPatientById((long) 1);
//		printPatientById((long) 1);
	//deletePatientById((long) 4);
	//	printAllPatients();
		//printAllPrimaryAddresses();
	//}

}
