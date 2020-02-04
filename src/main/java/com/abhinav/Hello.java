package com.abhinav;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Hello {
    @Autowired
	Iemempolyee iem;
	
	@RequestMapping("/welcome")
	public String Welcome()
	{
		return "hello";
	}
	@RequestMapping("/employe")
	public List<Employees> ram()
	{
		return iem.getEmployeeAll();
		
	}
	@RequestMapping("/employe/{empId}")
	public Employees getEmployment(@PathVariable int empId)
	{
		return iem.getById(empId); 
	}
	@RequestMapping(method=RequestMethod.POST,value="/employee")
	public void addEmp(@RequestBody Employees employees)
	{
		iem.addEmp(employees);
	}

}
