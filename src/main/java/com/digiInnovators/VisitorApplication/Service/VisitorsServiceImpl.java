package com.digiInnovators.VisitorApplication.Service;

import com.digiInnovators.VisitorApplication.Model.ToVisit;
import com.digiInnovators.VisitorApplication.Model.Visitor;
import com.digiInnovators.VisitorApplication.Model.VisitorType;
import com.digiInnovators.VisitorApplication.Repository.ToVisitRepository;
import com.digiInnovators.VisitorApplication.Repository.VisitorRepository;
import com.digiInnovators.VisitorApplication.Repository.VisitorTypeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class VisitorsServiceImpl implements VisitorService{

    @Autowired
    private VisitorRepository visitorRepository;
//    @Autowired
//    private ToVisitRepository toVisitRepository;
//    @Autowired
//    private VisitorTypeRepository visitorTypeRepository;

    @Override
    public Visitor saveVisitor(Visitor visitor) {

//        ToVisit toVisit = toVisitRepository.findByToVisitName(visitor.getGetToVisitor());
//        VisitorType visitorType = visitorTypeRepository.findByVisitorTypeName(visitor.getGetVisitorType());

        Visitor visit = new Visitor();


        visit.setVisitorName(visitor.getVisitorName());
        visit.setPhoneNumber(visitor.getPhoneNumber());
        visit.setPurpose(visitor.getPurpose());
//        visit.setToVisit(toVisit);
        visit.setGetVisitorType(visitor.getGetVisitorType());
        visit.setGetToVisitor(visitor.getGetToVisitor());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String result = LocalDateTime.now().format(formatter);
        visit.setLocalDateTime(result);



        return visitorRepository.save(visit);
    }

    @Override
    public List<Visitor> getAllVisitors() {
        return visitorRepository.findAll();
    }


    @Override
    public Visitor getSingleVisitor(Long id) {
        return visitorRepository.findById(id).get();
    }

    @Override
    public String updateVisitor(Long id) {

        Visitor visitor = visitorRepository.findById(id).get();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String result = LocalDateTime.now().format(formatter);
        visitor.setCheckOut(result);
        visitorRepository.save(visitor);

        return "Visitor Check-Out Update Successfully";
    }


}
