package com.sms.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.app.entity.Students;

public interface StudentRepository extends JpaRepository<Students, Long> {
    



}
