package Program1;

import java.util.Scanner;


class Person {
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String emailId;

    public Person(String name, String address, String phoneNumber, String emailId) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
    }

    public void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email ID: " + emailId);
    }
}

interface Staff {
    void staff(String name, String address, String phoneNumber, String emailId, String designation);
}

class Staff_Op implements Staff {
    private String designation;

    public Staff_Op(String designation) {
        this.designation = designation;
    }

    @Override
    public void staff(String name, String address, String phoneNumber, String emailId, String designation) {
        Person staff = new Person(name, address, phoneNumber, emailId);
        System.out.println("Staff information updated successfully.");
        System.out.println("Staff Information:");
        staff.displayInformation();
        System.out.println("Designation: " + this.designation);
        System.out.println();
    }
    
    double calculateSalary() {
        // Perform salary calculation based on designation, experience, etc.
        // This is just a placeholder implementation
        if (designation.equals("Manager")) {
            return 5000.0;
        } else if (designation.equals("Employee")) {
            return 3000.0;
        } else {
            return 0.0;
        }
    }
}


//Student interface
interface Student {
 void student(String name, String address, String phoneNumber, String emailId, String usn, String branch);
}

//Student implementation
class Student_Op implements Student {
 private String usn;
 private String branch;

 public Student_Op(String usn, String branch) {
     this.usn = usn;
     this.branch = branch;
 }

 @Override
 public void student(String name, String address, String phoneNumber, String emailId, String usn, String branch) {
     Person student = new Person(name, address, phoneNumber, emailId);
     System.out.println("Student information updated successfully.");
     System.out.println("Student Information:");
     student.displayInformation();
     System.out.println("USN: " + this.usn);
     System.out.println("Branch: " + this.branch);
     System.out.println();
 }
 
 
 
protected double calculateFees() {
     // Perform fee calculation based on the branch, course, etc.
     // This is just a placeholder implementation
     if (branch.equals("CS")) {
         return 5000.0;
     } else if (branch.equals("ECE")) {
         return 6000.0;
     } else {
         return 0.0;
     }
 }
}


//TestClass
class TestClass {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Enter staff details:");
     System.out.print("Name: ");
     String staffName = scanner.nextLine();
     System.out.print("Address: ");
     String staffAddress = scanner.nextLine();
     System.out.print("Phone Number: ");
     String staffPhoneNumber = scanner.nextLine();
     System.out.print("Email ID: ");
     String staffEmailId = scanner.nextLine();
     System.out.print("Designation: ");
     String staffDesignation = scanner.nextLine();
     
     Staff_Op staffObj = new Staff_Op(staffDesignation);
     staffObj.staff(staffName, staffAddress, staffPhoneNumber, staffEmailId, staffDesignation);
     double salary = staffObj.calculateSalary();
     System.out.println("Calculated Salary: $" + salary);

     System.out.println("Enter student details:");
     System.out.print("Name: ");
     String studentName = scanner.nextLine();
     System.out.print("Address: ");
     String studentAddress = scanner.nextLine();
     System.out.print("Phone Number: ");
     String studentPhoneNumber = scanner.nextLine();
     System.out.print("Email ID: ");
     String studentEmailId = scanner.nextLine();
     System.out.print("USN: ");
     String studentUsn = scanner.nextLine();
     System.out.print("Branch: ");
     String studentBranch = scanner.nextLine();

     Student_Op studentObj = new Student_Op(studentUsn, studentBranch);
     studentObj.student(studentName, studentAddress, studentPhoneNumber, studentEmailId, studentUsn, studentBranch);
     double fees = studentObj.calculateFees();
     System.out.println("Calculated Fees: $" + fees);
     scanner.close();
 }
}