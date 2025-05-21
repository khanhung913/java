package jp.co.attendance.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.attendance.Domain.Attendance;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
	List<Attendance> findByEmployeeId(long id);
}
