package com.digiInnovators.VisitorApplication.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


public class VisitorType {


    private Long visitorTypeId;
    private String visitorTypeName;

    public VisitorType() {
    }

    public VisitorType(Long visitorTypeId, String visitorTypeName) {
        this.visitorTypeId = visitorTypeId;
        this.visitorTypeName = visitorTypeName;
    }

    public Long getVisitorTypeId() {
        return visitorTypeId;
    }

    public String getVisitorTypeName() {
        return visitorTypeName;
    }

    @Override
    public String toString() {
        return "VisitorType{" +
                "visitorTypeId=" + visitorTypeId +
                ", visitorTypeName='" + visitorTypeName + '\'' +
                '}';
    }
}
