package com.nit.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
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
	@Size(min = 2, max = 50)
	private String address;
	@Positive
	private Double salary;
}
