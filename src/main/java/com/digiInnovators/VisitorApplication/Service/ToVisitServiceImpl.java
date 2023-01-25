package com.digiInnovators.VisitorApplication.Service;

import com.digiInnovators.VisitorApplication.Model.ToVisit;
import com.digiInnovators.VisitorApplication.Repository.ToVisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ToVisitServiceImpl implements ToVisitService{


    @Override
    public List<ToVisit> getAllToVisit() {
        return null;
    }

    @Override
    public ToVisit getSingleToVisit(Long id) {
        return null;
    }

    @Override
    public ToVisit findByToVisitName(String toVisitName) {
        return null;
    }
}
