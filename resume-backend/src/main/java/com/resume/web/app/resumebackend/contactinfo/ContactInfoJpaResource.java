package com.resume.web.app.resumebackend.contactinfo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RestController
public class ContactInfoJpaResource {
    @Autowired
    private ContactInfoRepository contactRepo;

    @GetMapping(path="/contactinfo")
    public List<ContactInfo> retrieveAllContactInfo(){
        return contactRepo.findAll();
    }

    @GetMapping(path="/contactinfo/{id}")
    public Optional<ContactInfo> retrieveContactInfo_id(@PathVariable int id){
        Optional<ContactInfo> contactInfo = contactRepo.findById(id);
        if(contactInfo == null){
            //TODO Add throws exception here
        }
        return contactInfo;
    }

    @GetMapping(path="/contactinfo/name/{name}")
    public Optional<ContactInfo> retrieveContactInfo_name(@PathVariable String name){
        Optional<ContactInfo> contactInfo = contactRepo.findByName(name);
        if(contactInfo == null){
            //TODO Add throws exception here
        }
        return contactInfo;
    }


}