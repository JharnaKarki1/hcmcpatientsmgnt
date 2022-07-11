package edu.mum.cs.cs425.hcmcpatientsmgnt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs.cs425.hcmcpatientsmgnt.model.PrimaryAddress;

@Repository
public interface PrimaryAddressRepository extends JpaRepository<PrimaryAddress, Integer>  {

}
