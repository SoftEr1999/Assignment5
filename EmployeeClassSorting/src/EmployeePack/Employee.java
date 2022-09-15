package EmployeePack;


public class Employee implements Comparable<Employee>{	//implementing Comparable interface
	String name;
	int age;
	double salary;
	int emp_id;
	
	Employee(String name,int age,double salary,int emp_id)
	{
		this.name=name;
		this.age=age;
		this.salary= salary;
		this.emp_id=emp_id;
	}
	
		public int compareTo(Employee st){  
		if(salary==st.salary)  
		return 0;  
		else if(salary>st.salary)  
		return 1;  
		else  
		return -1;  
		}

}
