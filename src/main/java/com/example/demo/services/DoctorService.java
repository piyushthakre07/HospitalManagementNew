package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Doctor;
import com.example.demo.repository.DoctorRepository;

@Service
public class DoctorService {

	DoctorRepository doctorRepository; 
	
	public void saveDoctor(Doctor doctor ) {
		doctorRepository.save(doctor);
	}
}
