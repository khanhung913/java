package jp.co.attendance.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.attendance.Domain.Attendance;
import jp.co.attendance.Repository.AttendanceRepository;

@Service
public class AttendanceService {
	@Autowired
	AttendanceRepository attendanceRepository;

	public void handleSave(Attendance attendance) {
		this.attendanceRepository.save(attendance);
	}

	public List<Attendance> findByEmployeeId(long id) {
		return this.attendanceRepository.findByEmployeeId(id);
	}
}
