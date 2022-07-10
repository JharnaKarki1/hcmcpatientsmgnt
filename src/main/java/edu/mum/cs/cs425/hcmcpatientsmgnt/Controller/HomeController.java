package edu.mum.cs.cs425.hcmcpatientsmgnt.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/hcmcpatientsmgnt")
public class HomeController {
	
    @GetMapping(value = {"/", "/home"})
    public String displayHome() {
        return "public/index";
    }
   
}



