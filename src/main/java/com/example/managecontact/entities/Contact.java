package com.example.managecontact.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Contact implements Serializable {
    @Id @GeneratedValue
    private Long id;
    private String lastname;
    private String firstname;
    @Temporal(TemporalType.DATE)
    private Date birthday;
    private String email;
    private String tel;
    private String photo;

    public Contact() {}

    public Contact(String lastname, String firstname, Date birthday, String email, String tel, String photo) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.birthday = birthday;
        this.email = email;
        this.tel = tel;
        this.photo = photo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

}
