package com.studentservice.student.service.respositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentservice.student.service.model.Student;

@Repository
public interface StudentRespositories extends JpaRepository<Student, Long> {

List<Student>findAllByInstituteid(Integer instituteid);
}
