package com.digiInnovators.VisitorApplication.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Visitor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long visitorId;

    private String visitorName;
    private String phoneNumber;

    private String localDateTime;
    private String purpose;


    private  String getVisitorType;

    private String getToVisitor;

    private String checkOut;

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public String getGetVisitorType() {
        return getVisitorType;
    }

    public void setGetVisitorType(String getVisitorType) {
        this.getVisitorType = getVisitorType;
    }

    public String getGetToVisitor() {
        return getToVisitor;
    }

    public void setGetToVisitor(String getToVisitor) {
        this.getToVisitor = getToVisitor;
    }

    public Long getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(Long visitorId) {
        this.visitorId = visitorId;
    }


    public String getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(String localDateTime) {
        this.localDateTime = localDateTime;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }


    @Override
    public String toString() {
        return "Visitor{" +
                "visitorId=" + visitorId +
                ", visitorName='" + visitorName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", localDateTime='" + localDateTime + '\'' +
                ", purpose='" + purpose + '\'' +
                ", getVisitorType='" + getVisitorType + '\'' +
                ", getToVisitor='" + getToVisitor + '\'' +
                ", checkOut='" + checkOut + '\'' +
                '}';
    }
}
