/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3.Task2;

/**
 *
 * @author Sai Hari
 */
class Employee {

    private int empId;
    private String empName;
    private double sal;
    private int yearsOfExperience;

    // Method to set employee details
    public void setEmployeeDetails(int empId, String empName, double sal, int yearsOfExperience) {
        this.empId = empId;
        this.empName = empName;
        this.sal = sal;
        this.yearsOfExperience = yearsOfExperience;
    }

    // Method to get employee details
    public void getEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + sal);
        System.out.println("Years of Experience: " + yearsOfExperience);
    }

    public void getLoanEligibility() {
        if (this.yearsOfExperience > 5) {
            if (this.sal == 600000) {
                System.out.println("2 Lakh loan can be granted");
            } else if (this.sal >= 100000) {
                System.out.println("5 Lakh loan can begranted");
            }
            if (this.sal >= 1500000) {
                System.out.println("7 Lakh loan can be granted");
            }
        } else {
            System.out.println("Sorry. Loan cannot be granted.");
        }
    }
}

public class Task2 {

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setEmployeeDetails(1, "Hari", 600000,7);
        emp1.getLoanEligibility();
    }

}
