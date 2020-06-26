package com.resume.web.app.resumebackend.contactinfo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactInfoRepository extends JpaRepository<ContactInfo, Integer>{
    Optional<ContactInfo> findByName(String name);
}
    
