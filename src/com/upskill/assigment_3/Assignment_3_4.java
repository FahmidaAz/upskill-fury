package com.upskill.assigment_3;
//Write a java program that explains runtime polymorphism.
public class Assignment_3_4 {
        int salary;
        void displaySalary(){
        	salary =100000;
        	System.out.println("Default salary is "+salary);
        }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Assignment_3_4 employee =new Assignment_3_4();
       
       employee.displaySalary();
       Assignment_3_4 pm = new ProjectManager();
       pm.displaySalary();
       Assignment_3_4 qa = new QAEngineer();
       qa.displaySalary();
       Assignment_3_4 swe = new SWE();
       swe.displaySalary();
       Assignment_3_4 ceo = new CEO();
       ceo.displaySalary();
	}

}
class ProjectManager extends Assignment_3_4{
	
	void displaySalary(){
		salary = 230000;
		System.out.println("Project Manager's salary is "+salary);
	}
	
}
class QAEngineer extends Assignment_3_4{
	
	void displaySalary(){
		salary = 120000;
		System.out.println("QA Engineer's salary is "+salary);
	}
	
}
class SWE extends Assignment_3_4{
	
	void displaySalary(){
		salary = 200000;
		System.out.println("SWE's salary is "+salary);
	}
	
}
class CEO extends Assignment_3_4{
	
	void displaySalary(){
		salary = 430000;
		System.out.println("CEO's salary is "+salary);
	}
	
}

