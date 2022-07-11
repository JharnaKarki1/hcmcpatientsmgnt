package edu.mum.cs.cs425.hcmcpatientsmgnt.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.mum.cs.cs425.hcmcpatientsmgnt.model.PrimaryAddress;
import edu.mum.cs.cs425.hcmcpatientsmgnt.repository.PrimaryAddressRepository;
import edu.mum.cs.cs425.hcmcpatientsmgnt.service.PrimaryAddressService;



@Service
public class PrimaryAddressServiceImpl implements PrimaryAddressService{

	private PrimaryAddressRepository primaryAddressRepository;

//  @Autowired -- Not needed for SpringBoot v2+
  public PrimaryAddressServiceImpl(PrimaryAddressRepository primaryAddressRepository) {
      this.primaryAddressRepository = primaryAddressRepository;
  }
	@Override
	public PrimaryAddress addNewPrimaryAddress(PrimaryAddress primaryAddress) {
		// TODO Auto-generated method stub
		return primaryAddressRepository.save(primaryAddress);
	}
	@Override
	public List<PrimaryAddress> getAllPrimaryAddresses() {
		// TODO Auto-generated method stub
		return primaryAddressRepository.findAll();
	}

}
