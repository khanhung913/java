package jp.co.attendance.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.attendance.Domain.Employee;
import jp.co.attendance.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	public Employee findEmployee(long id) {
		return this.employeeRepository.findById(id);
	}

}
