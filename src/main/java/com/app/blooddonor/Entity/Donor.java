package com.app.blooddonor.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "donor_info")
public class Donor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "D_ID")
    private int id;
    @Column(name = "D_Name")
    private String name;
    @Column(name = "D_City")
    private String city;
    @Column(name = "D_BloodGroup")
    private String bloodGroup;
    @Column(name = "D_State")
    private String state;
    @Column(name = "D_Mobile_No")
    private String mobileNo;

    public Donor(){}

    public Donor(int id, String name, String city, String bloodGroup, String state, String mobileNo) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.bloodGroup = bloodGroup;
        this.state = state;
        this.mobileNo = mobileNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}
