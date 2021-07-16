package com.durga.lamdapractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

 class Employee
{
	private int eid;
	private String ename;
	
	// Constructor
	public Employee(int eid, String ename) {
		this.eid=eid;
		this.ename=ename;
	}
	
	
	//Getters and setters
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}
	
	
	
}
public class SortingEmployeeObject {
	

	public static void main(String[] args) {
		List<Employee> emp=new ArrayList();
		emp.add(new Employee(101,"Vijay"));
		emp.add(new Employee(85,"Ajay"));
		emp.add(new Employee(101,"Raghav"));
		emp.add(new Employee(11,"Bhupendra"));
		emp.add(new Employee(6,"Prakash"));
		System.out.println("Before Sorting:"+emp);
		Collections.sort(emp,(I1, I2) -> (I1.getEid() < I2.getEid()) ? -1 : (I1.getEid() > I2.getEid()) ? 1 : 0);
		
		System.out.println("After Sorting:"+emp);
		

	}

}
