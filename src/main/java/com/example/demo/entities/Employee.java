package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	Integer id ; 
	String employeeName ; 
	
}
