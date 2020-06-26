package com.resume.web.app.resumebackend.contactinfo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class ContactInfo {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String address;

    private String phoneNumber;

    private String email;

    public ContactInfo(){}

    public ContactInfo(Integer id, String name, String address, String phoneNumber, String email) {
        super();
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ContactInfo [address=" + address + ", email=" + email + ", id=" + id + ", name=" + name
                + ", phoneNumber=" + phoneNumber + "]";
    }

    

    
    
}