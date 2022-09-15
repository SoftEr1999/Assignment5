import java.util.*;  
import java.util.stream.Collectors;  


class Student{  //Student class
    int id;  
    String name;  
    int age;
    float math_marks;
    public Student(int id, String name, int age,float math_marks) {  
        this.id = id;  
        this.name = name;  
        this.age = age; 
        this.math_marks=math_marks;
    }  
    
    public String toString(){//overriding the toString() method  
    	  return id+" "+name+" "+age+" "+math_marks;  
    }
}  


public class StudentsMathMarksFilter {

	public static void main(String[] args) {
		 List<Student> stu = new ArrayList<Student>();
		 
		 
	        //Adding students 
	       stu.add(new Student(001,"Jahul Khan",16,78.6f));  
	       stu.add(new Student(002,"Abir Khan",17,79.2f));  
	       stu.add(new Student(003,"Varun Gupta",18,82.8f));  
	       stu.add(new Student(004,"Lalit Bhatt",17,93f));  
	       stu.add(new Student(005,"Mukesh Kushwaha",15,98f));  
	        
	       //Printing only the math_marks of students using stream
	        List<Float> newStu =stu.stream().filter(p -> p.math_marks>60.0f && p.math_marks<80.0f).map(m->m.math_marks).collect(Collectors.toList()); 	// collecting as list
	        System.out.println(newStu);
	        
	        //Printing the whole records of student using Stream
	        List<Student> newStu1 =stu.stream().filter(p -> p.math_marks>60 && p.math_marks<80).collect(Collectors.toList()); 	// collecting as list  
	        System.out.println(newStu1);  

	}

}
