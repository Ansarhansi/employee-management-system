package com.qsp.employee_management_system.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.qsp.employee_management_system.connection.GetConnection;
import com.qsp.employee_management_system.entity.Employee;

public class EmployeeDao {
	Connection con = GetConnection.getConnection();

	public boolean saveEmployee(Employee emp) {
		String sql = "insert into employee values(?,?,?,?)";
		try {
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1, emp.geteId());
			pstm.setString(2, emp.geteName());
			pstm.setDouble(3, emp.geteSalary());
			pstm.setString(4, emp.geteLoc());
			return pstm.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public List<Employee> getAllEmployee() {
		List<Employee> list = new ArrayList<>();
		String sql = "select * from employee";
		try {
			PreparedStatement pstm = con.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				Employee emp = new Employee();
				emp.seteId(rs.getInt("e_id"));
				emp.seteName(rs.getString("e_name"));
				emp.seteSalary(rs.getDouble("e_salary"));
				emp.seteLoc(rs.getString("e_loc"));
				list.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public Employee getEmployeeById(int id) {
		String sql = "select * from employee where e_id=?";
		try {
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1, id);
			ResultSet rs = pstm.executeQuery();
			if (rs.next()) {
				Employee emp = new Employee();
				emp.seteId(rs.getInt("e_id"));
				emp.seteName(rs.getString("e_name"));
				emp.seteSalary(rs.getDouble("e_salary"));
				emp.seteLoc(rs.getString("e_loc"));
				return emp;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean updateEmployeeSalary(double salary, int id) {
		String sql = "update employee set e_salary=? where e_id=?";
		try {
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setDouble(1, salary);
			pstm.setInt(2, id);
			return pstm.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean deleteEmployeeById(int id) {
		String sql = "delete from employee where e_id=?";
		try {
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1, id);
			return pstm.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
