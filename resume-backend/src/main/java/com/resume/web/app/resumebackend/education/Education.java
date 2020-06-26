package com.resume.web.app.resumebackend.education;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Education {
    @Id
    @GeneratedValue
    private Integer id;

    private String school;

    private String location;

    private String major;

    private String timePeriod;

    public Education(){}

    public Education(Integer id, String school, String location, String major, String timePeriod) {
        super();
        this.id = id;
        this.school = school;
        this.location = location;
        this.major = major;
        this.timePeriod = timePeriod;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(String timePeriod) {
        this.timePeriod = timePeriod;
    }

    @Override
    public String toString() {
        return "Education [id=" + id + ", location=" + location + ", major=" + major + ", school=" + school
                + ", timePeriod=" + timePeriod + "]";
    }




    

    
}