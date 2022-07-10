package edu.mum.cs.cs425.hcmcpatientsmgnt.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.cs.cs425.hcmcpatientsmgnt.model.Patient;
import edu.mum.cs.cs425.hcmcpatientsmgnt.repository.PatientRepository;
import edu.mum.cs.cs425.hcmcpatientsmgnt.service.PatientService;


@Service
public class PatientServiceImpl implements PatientService  {
	
	    private PatientRepository patientRepository;
	 
	 public PatientServiceImpl(PatientRepository patientRepository) {
		 this.patientRepository =patientRepository;
	 }
	
	 @Override
	 public Patient addNewPatient(Patient patient) {
		 var newPatient= patientRepository.save(patient);
		 return newPatient;
	 }
	 @Override
    public List<Patient> getAllPatients(){
    	var patients = patientRepository.findAll(Sort.by("fullNames"));
    	return patients;
    }
    


}
