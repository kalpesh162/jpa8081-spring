package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bean.Address;
import com.bean.Employee;

// spring.xml
@Configuration
public class AppConfig {

	// <bean id="homeAddress" class="com.bean.Address">
	// </bean>
	@Bean
	public Address homeAddress() {
		return new Address("MH", "PUNE", 411011);
	}

	// <bean id="employee1" class="com.bean.Employee">
	// <property name="address" ref="homeAddres">
	// </bean>
	@Bean
	public Employee employee1() {
		// Employee employee = new Employee(11, "Mahesh", 77.77,homeAddress);
		// Employee(homeAddress)
		Employee employee = new Employee(11, "Mahesh", 77.77);
		employee.setAddress(homeAddress());
		return employee;
	}
}
