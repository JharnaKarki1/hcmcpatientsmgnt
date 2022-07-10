package edu.mum.cs.cs425.hcmcpatientsmgnt.Controller.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.mum.cs.cs425.hcmcpatientsmgnt.model.Patient;
import edu.mum.cs.cs425.hcmcpatientsmgnt.service.PatientService;

@RestController
@RequestMapping(value= "/hcmcpatientsmgnt/api/patient")
public class PatientRestController {
	@Autowired
	private PatientService patientService;
	
	@GetMapping(value= {"/list"})
	public List<Patient> listpatients(){
		return patientService.getAllPatients();
	}
	
}
