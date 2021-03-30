package com.JPAExample.JPAExample.dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.JPAExample.JPAExample.entity.Employee;

//@RepositoryRestResource( path="partners") //This is to overrider JPA-REST defualt. Here that would mean it replaces employees.
public interface EmployeeRespository extends JpaRepository<Employee, Integer> {
//will give me all the basic calls to the 
}
