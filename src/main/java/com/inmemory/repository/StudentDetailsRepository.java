package com.inmemory.repository;

import com.inmemory.Entity.StudentDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDetailsRepository extends JpaRepository<StudentDetails,Integer> {

    StudentDetails findbyrollNo(int rollNo);
    StudentDetails findbyfName(String fullName);

}
