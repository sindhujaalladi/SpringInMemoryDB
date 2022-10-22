package com.inmemory.Entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "studentDetails")
public class StudentDetails {

    @Id
    @GeneratedValue
    private int rollNo;

    @Column(name = "lastName") //adding this @column to every field will be named as column name in database
    private String lName;

    @Column(name = "Gender")
    private String Gen;

    @Column(name = "fullName")
    private String fName;

    @Column(name = "department")
    private String dept;

    @Column(name = "collegeName")
    private String cName;


    @Override
    public String toString(){
        return "StudentDetails{" +
                "rollNo=" + rollNo +
                "lName=" + lName +
                "Gen=" + Gen +
                "fName=" + fName +
                "dept=" + dept +
                "cName=" + cName +
                '}';

    }
}
