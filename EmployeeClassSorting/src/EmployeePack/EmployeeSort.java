package EmployeePack;
import java.util.*;


public class EmployeeSort {
	

	public static void main(String[] args) {
		
		ArrayList<Employee> list=new ArrayList<Employee>();  
		
		
		list.add(new Employee("Ashish",28,20000,011));  
		list.add(new Employee("Kailash",27,40000,012));  
		list.add(new Employee("Abir",32,23000,013));  
		list.add(new Employee("Gaurav",26,60000,014));
		  
		Collections.sort( list);  
		
		for(Employee st:list){  
		System.out.println(st.emp_id+" "+st.name+" "+st.age+" "+st.salary);  
		}  

	}

}
