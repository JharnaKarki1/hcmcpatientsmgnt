package edu.mum.cs.cs425.hcmcpatientsmgnt.service;

import java.util.List;

import edu.mum.cs.cs425.hcmcpatientsmgnt.model.Patient;
import edu.mum.cs.cs425.hcmcpatientsmgnt.model.PrimaryAddress;

public interface PrimaryAddressService {
	public abstract  List<PrimaryAddress> getAllPrimaryAddresses();
	PrimaryAddress addNewPrimaryAddress(PrimaryAddress primaryAddress);

}
