package com.digiInnovators.VisitorApplication.Controller;

import com.digiInnovators.VisitorApplication.Model.ToVisit;
import com.digiInnovators.VisitorApplication.Model.Visitor;
import com.digiInnovators.VisitorApplication.Model.VisitorType;
import com.digiInnovators.VisitorApplication.Service.ToVisitServiceImpl;
import com.digiInnovators.VisitorApplication.Service.VisitorService;
import com.digiInnovators.VisitorApplication.Service.VisitorsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1/")
public class VisitorController {

    @Autowired
    private VisitorsServiceImpl visitorService;
    @Autowired
    private ToVisitServiceImpl toVisitService;

    @PostMapping("/visitor")
    public Visitor saveVisitor(@RequestBody Visitor visitor){


        return visitorService.saveVisitor(visitor);
    }

    @GetMapping("/allTo")
    public List<ToVisit> getAllToVisit(){
        return toVisitService.getAllToVisit();
    }

    @GetMapping("/to")
    public ToVisit getToVisit(){



        return toVisitService.findByToVisitName("Facility");
    }

    @PostMapping("/getVisitor")
    public Visitor getVisitorById(@RequestBody Visitor visitor){
        System.out.println("Finding.............."+visitor.getVisitorId());

        return visitorService.getSingleVisitor(visitor.getVisitorId());
    }

    @PostMapping("/check-out")
    public String updateCheckOut(@RequestBody Visitor visitorId){

        try {
            return visitorService.updateVisitor(visitorId.getVisitorId());
        }catch (Exception exception){
            return "Error";
        }
    }

    @GetMapping("/allVisitors")
    public List<Visitor> getAllVisitors(){
        return visitorService.getAllVisitors();
    }



}
