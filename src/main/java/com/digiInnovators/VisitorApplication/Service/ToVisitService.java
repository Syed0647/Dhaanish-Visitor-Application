package com.digiInnovators.VisitorApplication.Service;

import com.digiInnovators.VisitorApplication.Model.ToVisit;

import java.util.List;

public interface ToVisitService {

    List<ToVisit> getAllToVisit();

    ToVisit getSingleToVisit(Long id);

    ToVisit findByToVisitName(String toVisitName);
}
