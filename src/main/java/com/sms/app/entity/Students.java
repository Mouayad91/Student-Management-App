package com.sms.app.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "students")
public class Students {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "first_name", nullable = false)
    private String firstName;
   
    @Column(name = "last_name", nullable = false)
    private String lastName;
    
    @Pattern(regexp = "^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d$", message = "Date should be in the format dd/mm/yyyy")
    @Column(name = "birth_date", nullable = false)
    private Date birthDate;

    @Column(name = "phone_number", nullable = false, unique=true)
    private String phoneNumber;
   
    @Column(name = "email", nullable = false, unique=true)
    private String email;

    @Column(name = "enrollment_date", nullable = false)
    @Pattern(regexp = "^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d$", message = "Date should be in the format dd/mm/yyyy")
    private Date enrollmentDate;
   
    
    
}
