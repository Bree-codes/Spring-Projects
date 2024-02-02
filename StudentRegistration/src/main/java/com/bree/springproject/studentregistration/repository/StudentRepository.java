package com.bree.springproject.studentregistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bree.springproject.studentregistration.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
