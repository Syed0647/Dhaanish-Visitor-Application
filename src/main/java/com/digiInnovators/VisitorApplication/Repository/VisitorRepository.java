package com.digiInnovators.VisitorApplication.Repository;

import com.digiInnovators.VisitorApplication.Model.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitorRepository extends JpaRepository<Visitor,Long> {
}
