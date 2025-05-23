package jp.co.attendance.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jp.co.attendance.Domain.Attendance;
import jp.co.attendance.Domain.Employee;
import jp.co.attendance.Service.AttendanceService;
import jp.co.attendance.Service.EmployeeService;

@Controller
public class UserController {
	@Autowired
	EmployeeService employeeService;

	@Autowired
	AttendanceService attendanceService;

	@RequestMapping("/")
	public String homePage() {
		return "check";
	}

	@RequestMapping("/welcome")
	public String welcomePage() {
		return "index";
	}

	@RequestMapping(path = "/check", method = RequestMethod.POST)
	public String checkEmployeeId(Model model, @RequestParam("id") Long id) {
		Employee employee = this.employeeService.findEmployee(id);
		if (employee != null) {
			model.addAttribute("name", employee.getName());
			return "index";
		} else {
			return "redirect:/";
		}
	}

	@RequestMapping("/checkin")
	public String checkin() {
		Employee employee = this.employeeService.findEmployee(1);
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String newdate = df.format(date);
		Attendance attendance = new Attendance();
		List<Attendance> attendanceTemp = this.attendanceService.findByEmployeeId(1);
		boolean hasAttendance = false;
		long attendance_id = 0;

		if (attendanceTemp.isEmpty()) {
			attendance.setComein(date);
			attendance.setEmployee(employee);
			attendance.setAttendance_date(newdate);
			this.attendanceService.handleSave(attendance);
		} else {
			for (Attendance at : attendanceTemp) {
				if (at.getAttendance_date().equals(newdate)) {
					attendance_id = at.getId();
					hasAttendance = true;
				}
			}
			if (!hasAttendance) {
				attendance.setId(attendance_id);
				attendance.setComein(date);
				attendance.setEmployee(employee);
				attendance.setAttendance_date(newdate);
				this.attendanceService.handleSave(attendance);
			}
		}
		return "redirect:/";
	}

}
