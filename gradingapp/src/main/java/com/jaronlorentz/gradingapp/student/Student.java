package com.jaronlorentz.gradingapp.student;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "student_tbl")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private String firstname;
    private String lastname;
    private String studentlevel;
    private Date datejoined;

    public Student() {
    }
}

