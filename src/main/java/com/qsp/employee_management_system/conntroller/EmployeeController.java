package com.qsp.employee_management_system.conntroller;

import java.util.List;
import java.util.Scanner;

import com.qsp.employee_management_system.dao.EmployeeDao;
import com.qsp.employee_management_system.entity.Employee;

public class EmployeeController {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeDao dao = new EmployeeDao();
		System.err.println("WELCOME TO EMPLOYEE-MANAGEMENT-SYSTEM");
		while (true) {
//			System.out.println("-----------------------------------------");
			System.out.println("1.Insert Employee");
			System.out.println("2.Fetch All Employees");
			System.out.println("3.Fetch Employee By ID");
			System.out.println("4.Update Employee Salary");
			System.out.println("5.Delete Employee");
			System.err.println("6.Exit");

			System.out.println("---------------------------------------------");

			System.out.println("Enter  Your Choice");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter ID");
				int id = sc.nextInt();
				System.out.println("Enter Name");
				String name = sc.next();
				System.out.println("Enter Salary");
				double salary = sc.nextDouble();
				System.out.println("Enter Location");
				String loc = sc.next();

				Employee emp = new Employee();
				emp.seteId(id);
				emp.seteName(name);
				emp.seteSalary(salary);
				emp.seteLoc(loc);

				System.out.println(dao.saveEmployee(emp) ? "DATA INSERTED" : "NOT Inserted");
				break;

			case 2:
				List<Employee> list = dao.getAllEmployee();
				for (Employee e : list) {
					System.out.println(e.geteId());
					System.out.println(e.geteName());
					System.out.println(e.geteSalary());
					System.out.println(e.geteLoc());
					System.out.println("-----------------------------");
				}
				break;

			case 3: {
				System.out.println("Enter ID");
				int eid = sc.nextInt();
				Employee e = dao.getEmployeeById(eid);

				System.out.println("-----------------------------------------");
				System.out.println("EID:" + e.geteId());
				System.out.println("NAME:" + e.geteName());
				System.out.println("SALARY::" + e.geteSalary());
				System.out.println("LOCATION:" + e.geteLoc());
			}
				break;

			case 4:
				System.out.println("Enter ID");
				int eid = sc.nextInt();
				System.out.println("Enter New Salary");
				double sal = sc.nextDouble();
				System.out.println(dao.updateEmployeeSalary(sal, eid) ? "DATA Updated" : "Not Updated");
				break;

			case 5:
				System.out.println("Enter ID");
				System.out.println(dao.deleteEmployeeById(sc.nextInt()) ? "Deleted" : "Not Deleted");
				break;

			case 6:
				System.exit(0);

			default:
				System.out.println("Invalid Choice");
			}
		}
	}
}
