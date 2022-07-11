package edu.mum.cs.cs425.hcmcpatientsmgnt.Controller.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import edu.mum.cs.cs425.hcmcpatientsmgnt.model.Patient;
import edu.mum.cs.cs425.hcmcpatientsmgnt.service.PatientService;

@RestController
@RequestMapping(value= "/hcmcpatientsmgnt/api/patient")
public class PatientRestController {
	@Autowired
	private PatientService patientService;
	
	@GetMapping(value= {"/list"})
	public ResponseEntity<List<Patient>> listpatients(){
		return ResponseEntity.ok(patientService.getAllPatients());
	}
	@GetMapping(value = {"/{patientId}"})
    public ResponseEntity<Patient> getPatientId(@PathVariable Long patientId) {
        return ResponseEntity.ok(patientService.getPatientById(patientId));
    }
	
}
