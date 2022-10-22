package com.inmemory.pojo;

import lombok.*;

import java.io.Serializable;



@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentDetailsDTO implements Serializable {

    private int rollNo;
    private String  lName;
    private String Gen;
    private String fName;
    private String dept;
    private String cName;
}
