package edu.mum.cs.cs425.hcmcpatientsmgnt.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.mum.cs.cs425.hcmcpatientsmgnt.model.Patient;


@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
	  
}

