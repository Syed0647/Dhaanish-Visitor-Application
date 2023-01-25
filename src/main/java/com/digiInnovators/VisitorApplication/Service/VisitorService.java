package com.digiInnovators.VisitorApplication.Service;

import com.digiInnovators.VisitorApplication.Model.ToVisit;
import com.digiInnovators.VisitorApplication.Model.Visitor;
import com.digiInnovators.VisitorApplication.Model.VisitorType;

import java.util.List;

public interface VisitorService {

    Visitor saveVisitor(Visitor visitor);

    List<Visitor> getAllVisitors();

    Visitor getSingleVisitor(Long id);

    String updateVisitor(Long id);
}
