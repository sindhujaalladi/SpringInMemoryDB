package com.inmemory.service;


import com.inmemory.Entity.StudentDetails;
import com.inmemory.pojo.StudentDetailsDTO;
import com.inmemory.repository.StudentDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentDetailsService {

    @Autowired
     StudentDetailsRepository studentDetailsRepository;


    public void createStudDetails(StudentDetailsDTO studentDetailsdto) {
        StudentDetails sDetails = StudentDetails.
                builder()
                .rollNo(studentDetailsdto.getRollNo())
                .lName(studentDetailsdto.getLName())
                .Gen(studentDetailsdto.getGen())
                .dept(studentDetailsdto.getDept())
                .fName(studentDetailsdto.getFName())
                .cName(studentDetailsdto.getCName())
                .build();
         studentDetailsRepository.save(sDetails);
    }

     /*   public List<StudentDetailsDTO> createStudDetailsList(List<StudentDetailsDTO> list) {
           // Iterable<StudentDetails> sDetails = studentDetailsRepository.saveAll();
            List<StudentDetailsDTO> studentDetailsdto = new ArrayList<>();
            StudentDetails sDetails1 = StudentDetails.
                    builder()
                    .rollNo(studentDetailsdto.getRollNo())
                    .lName(studentDetailsdto.getLName())
                    .Gen(studentDetailsdto.getGen())
                    .dept(studentDetailsdto.getDept())
                    .fName(studentDetailsdto.getFName())
                    .cName(studentDetailsdto.getCName())
                    .build();

          return   studentDetailsRepository.saveAll(list);
        }*/

        public StudentDetailsDTO finddetailsbyrollNo(int rollNo) {
            StudentDetails sDetails = studentDetailsRepository.findbyrollNo(rollNo);
            StudentDetailsDTO studentDetailsDTO = new StudentDetailsDTO();
            return studentDetailsDTO ;
        }

         /*   public StudentDetailsDTO finddetailsbyfName(String fName) {
                StudentDetails sDetails=  studentDetailsRepository.findbyfName(fName);
                return StudentDetailsDTO = sDetails;
            }*/
        }

