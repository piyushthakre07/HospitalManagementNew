package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Doctor;

public interface DoctorRepository extends CrudRepository<Doctor, Integer>{

}
