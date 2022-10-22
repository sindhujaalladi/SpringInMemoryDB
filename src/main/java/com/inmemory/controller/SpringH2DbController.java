package com.inmemory.controller;

import com.inmemory.pojo.StudentDetailsDTO;
import com.inmemory.service.StudentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/StudentDetails")
public class SpringH2DbController {

    @Autowired
    StudentDetailsService studentDetailsService;

    @PostMapping("/addStudDetails")
    public ResponseEntity<StudentDetailsDTO> addStudentDetails(@RequestBody StudentDetailsDTO studentDetails) {
        this.studentDetailsService.createStudDetails(studentDetails);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/retrieveDetails/{rollNo}")
    public ResponseEntity<StudentDetailsDTO> getStudentDetailsbyrollNo(@PathVariable int rollNo) {
        StudentDetailsDTO studentDetailsDTO = studentDetailsService.finddetailsbyrollNo(rollNo);
        return new ResponseEntity<>(studentDetailsDTO,HttpStatus.CREATED);
    }

    /*@GetMapping("/retrieveDetails/{fName")
    public ResponseEntity<StudentDetailsDTO> getStudentDetailsbyfName(@PathVariable String fName) {
        return ResponseEntity.ok(this.studentDetailsService.finddetailsbyfName(fName));
    }*/
}
