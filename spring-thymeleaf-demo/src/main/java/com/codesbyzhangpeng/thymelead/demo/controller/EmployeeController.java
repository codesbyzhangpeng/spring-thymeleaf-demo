package com.codesbyzhangpeng.thymelead.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codesbyzhangpeng.thymelead.demo.model.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	//load the data
	
	List<Employee> theEmployees;
	
	@PostConstruct
	private void loadData() {
		//Create employees
		Employee emp1 = new Employee(1, "Thomas", "Schmidt", "thomas.schidt@gmail.com");
		Employee emp2 = new Employee(1, "Sibine", "Gutdeutsch", "sibine@gmail.com");
		Employee emp3 = new Employee(1, "Tim", "Thoene", "tim.thoene@gmail.com");
		Employee emp4 = new Employee(1, "Jack", "Wolfskin", "jack@wolfskin.com");
		
		theEmployees = new ArrayList<Employee>();
			
		theEmployees.add(emp1);
		theEmployees.add(emp2);
		theEmployees.add(emp3);
		theEmployees.add(emp4);
	}

	//add mapping for "/employee-list"
	@GetMapping("/list")
	public String showEmployees(Model theModel) {
		theModel.addAttribute("employees", theEmployees);
		return "employee-list";
	}

}
