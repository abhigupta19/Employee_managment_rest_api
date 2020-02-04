package com.abhinav;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Employment implements Iemempolyee {
	List<Employees> emp=new ArrayList<>(Arrays.asList(new Employees(1,"abhia","gupta"),new Employees(2,"kaka","kek")));


	@Override
	public List<Employees> getEmployeeAll() {
		return emp;
	}
	@Override
	public Employees getById(int empId) {	
		return emp.stream().filter(e->e.getEmpId()==empId).findFirst().get();
	}
	public void addEmp(Employees employees) {
	
		emp.add(employees);
		
	}
	
	
}
