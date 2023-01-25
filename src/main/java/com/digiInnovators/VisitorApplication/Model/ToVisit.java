package com.digiInnovators.VisitorApplication.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


public class ToVisit {


    private Long toVisitId;
    private String toVisitName;

    public ToVisit() {
    }

    public ToVisit(Long toVisitId, String toVisitName) {
        this.toVisitId = toVisitId;
        this.toVisitName = toVisitName;
    }

    public Long getToVisitId() {
        return toVisitId;
    }

    public String getToVisitName() {
        return toVisitName;
    }

    @Override
    public String toString() {
        return "ToVisit{" +
                "toVisitId=" + toVisitId +
                ", toVisitName='" + toVisitName + '\'' +
                '}';
    }
}
