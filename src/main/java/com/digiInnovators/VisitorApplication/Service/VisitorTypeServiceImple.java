package com.digiInnovators.VisitorApplication.Service;

import com.digiInnovators.VisitorApplication.Model.VisitorType;
import com.digiInnovators.VisitorApplication.Repository.VisitorRepository;
import com.digiInnovators.VisitorApplication.Repository.VisitorTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VisitorTypeServiceImple implements  VisitorTypeService{


    @Override
    public List<VisitorType> getAllVisitorType() {
        return null;
    }

    @Override
    public VisitorType getSingleVisitorType(Long id) {
        return null;
    }
}
