package edu.mum.cs.cs425.hcmcpatientsmgnt.service;

import java.util.List;

import edu.mum.cs.cs425.hcmcpatientsmgnt.model.Patient;

public interface PatientService {
	public abstract Patient addNewPatient(Patient patient);
	
	 public abstract  List<Patient> getAllPatients();

	    
	}


