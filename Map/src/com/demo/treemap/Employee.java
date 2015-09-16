package com.demo.treemap;

public class Employee implements Comparable<Employee> {

	int id;

	public Employee(int id) {
		this.id=id;
	}
	
	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		Employee employee=(Employee)obj;
		return this.id==employee.id;
	}
	@Override
	public int compareTo(Employee o) {
	
		return this.id-o.id;
	
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + "]";
	}
	
	
}
