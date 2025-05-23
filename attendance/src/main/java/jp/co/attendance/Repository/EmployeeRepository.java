package jp.co.attendance.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.attendance.Domain.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	Employee findById(long id);
}
