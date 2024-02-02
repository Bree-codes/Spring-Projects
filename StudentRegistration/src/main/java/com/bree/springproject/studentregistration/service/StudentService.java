package com.bree.springproject.studentregistration.service;

import com.bree.springproject.studentregistration.domain.Student;
import com.bree.springproject.studentregistration.domain.Student;
import com.bree.springproject.studentregistration.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public List<Student> listAll() {

        return repo.findAll();
    }

    public void save(Student std) {

        repo.save(std);
    }

    public Student get(long id) {

        return repo.findById(id).get();
    }

    public void delete(long id) {

        repo.deleteById(id);
    }

}

