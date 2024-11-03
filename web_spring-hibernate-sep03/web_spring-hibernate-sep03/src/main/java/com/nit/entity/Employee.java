package com.nit.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	private Long id;
	@NotEmpty
	@Size(min = 2, max = 50)
	private String name;
	@NotEmpty
	@Size(min = 10, max = 50)
	private String address;
	@Max(value = 20000)
	private Double salary;
}
