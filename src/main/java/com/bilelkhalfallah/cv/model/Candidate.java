package com.bilelkhalfallah.cv.model;

import com.bilelkhalfallah.cv.helper.Auditable;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="CANDIDATE")
@EntityListeners(AuditingEntityListener.class)
public class Candidate extends Auditable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "speciality")
    private String speciality;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "address")
    private String address;

    @Column(name = "email")
    private String email;

    @Column(name = "link")
    private String link;

    @Column(name = "about")
    private String about;

    @Column(name = "picture")
    private String picture;



    public Candidate(Date createdDate, Date lastModifiedDate, Long id, String firstName, String lastName, String speciality, String mobile, String address, String email, String link, String about, String picture) {
        super(createdDate, lastModifiedDate);
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.speciality = speciality;
        this.mobile = mobile;
        this.address = address;
        this.email = email;
        this.link = link;
        this.about = about;
        this.picture = picture;
    }

    public Candidate( String firstName, String lastName, String speciality, String mobile, String address, String email, String link, String about, String picture) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.speciality = speciality;
        this.mobile = mobile;
        this.address = address;
        this.email = email;
        this.link = link;
        this.about = about;
        this.picture = picture;
    }

    public Candidate( Long id, String firstName, String lastName, String speciality, String mobile, String address, String email, String link, String about, String picture) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.speciality = speciality;
        this.mobile = mobile;
        this.address = address;
        this.email = email;
        this.link = link;
        this.about = about;
        this.picture = picture;
    }

    public Candidate() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", speciality='" + speciality + '\'' +
                ", mobile='" + mobile + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", link='" + link + '\'' +
                ", about='" + about + '\'' +
                ", picture='" + picture + '\'' +
                ", createdDate=" + createdDate +
                ", lastModifiedDate=" + lastModifiedDate +
                '}';
    }
}
