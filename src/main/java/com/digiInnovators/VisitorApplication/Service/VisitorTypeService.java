package com.digiInnovators.VisitorApplication.Service;

import com.digiInnovators.VisitorApplication.Model.VisitorType;

import java.util.List;

public interface VisitorTypeService {

    List<VisitorType> getAllVisitorType();

    VisitorType getSingleVisitorType(Long id);

}
