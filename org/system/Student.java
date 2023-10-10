package org.system;

public class Student extends Department {
public void studentName() {
	System.out.println("dinesh");
}
public void studentDept() {
	System.out.println("computer science");
}
public void studentId() {
	System.out.println("143420");
}
public static void main(String[] args) {
	Student detail=new Student();
	detail.collegeName();
	detail.collegeCode();
	detail.collegeRank();
	detail.departmentName();
	detail.studentName();
	detail.studentDept();
	detail.studentId();
}
}

