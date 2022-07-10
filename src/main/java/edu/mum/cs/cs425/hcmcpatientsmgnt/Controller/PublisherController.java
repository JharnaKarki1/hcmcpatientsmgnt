package edu.mum.cs.cs425.hcmcpatientsmgnt.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import edu.mum.cs.cs425.hcmcpatientsmgnt.service.PatientService;

@Controller
@RequestMapping(value ={"/hcmcpatientsmgnt/patient"})
	 
public class PublisherController {
	 
	 @Autowired
	    private PatientService patientService;

	 @GetMapping(value = {"/list"})
	    public ModelAndView listPatients(){
	        var patients = patientService.getAllPatients();
	        var modelAndView = new ModelAndView();
	        modelAndView.addObject("patients", patients);
	        modelAndView.setViewName("patient/list");
	        return modelAndView;
	    }
	 
	

}
