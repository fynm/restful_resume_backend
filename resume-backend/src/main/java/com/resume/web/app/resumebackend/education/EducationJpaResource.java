package com.resume.web.app.resumebackend.education;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RestController
public class EducationJpaResource {
    @Autowired
    private EducationRepository eduRepo;

    @GetMapping(path="/edu")
    public List<Education> retrieveAllEducation(){
        return eduRepo.findAll();
    }

    @GetMapping(path="/edu/{id}")
    public Optional<Education> retrieveEducation_id(@PathVariable int id){
        Optional<Education> education = eduRepo.findById(id);
        if(education ==  null){
            //TODO Add exception here
        }
        return education;
    }

}