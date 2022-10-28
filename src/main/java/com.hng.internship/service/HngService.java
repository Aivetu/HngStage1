package com.hng.internship.service;

import com.hng.internship.model.HngDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HngService {


    public HngDetails Details(){
        HngDetails details =new HngDetails();
        details.setAge(25);
        details.setBackend(true);
        details.setSlackUsername("Aiva");
        details.setBio("Hello, I am an introvert and food loving girl, muslimah and wife. Looking forward to knowledge that will be impacted");
        return details;
    }
}
