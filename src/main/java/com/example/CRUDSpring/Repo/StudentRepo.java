package com.example.CRUDSpring.Repo;

import com.example.CRUDSpring.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface StudentRepo extends JpaRepository<Student,Integer> {

}
