package jp.co.attendance.Domain;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "timetable")
public class Attendance {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_seq")
	@SequenceGenerator(name = "id_seq", sequenceName = "id_create_seq")
	private long id;
	@NotNull
	private String attendance_date;
	private Date comein;
	private Date leave;
	private Date breaktime;
	private Date returntime;
	private Date ondutytime;
	@ManyToOne
	private Employee employee;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAttendance_date() {
		return attendance_date;
	}

	public void setAttendance_date(String attendance_date) {
		this.attendance_date = attendance_date;
	}

	public Date getBreaktime() {
		return breaktime;
	}

	public void setBreaktime(Date breaktime) {
		this.breaktime = breaktime;
	}

	public Date getReturntime() {
		return returntime;
	}

	public void setReturntime(Date returntime) {
		this.returntime = returntime;
	}

	public Date getOndutytime() {
		return ondutytime;
	}

	public void setOndutytime(Date ondutytime) {
		this.ondutytime = ondutytime;
	}

	public Date getComein() {
		return comein;
	}

	public void setComein(Date comein) {
		this.comein = comein;
	}

	public Date getLeave() {
		return leave;
	}

	public void setLeave(Date leave) {
		this.leave = leave;
	}

	public Date getBreak_time() {
		return breaktime;
	}

	public void setBreak_time(Date break_time) {
		this.breaktime = break_time;
	}

	public Date getReturn_time() {
		return returntime;
	}

	public void setReturn_time(Date return_time) {
		this.returntime = return_time;
	}

	public Date getOnduty_time() {
		return ondutytime;
	}

	public void setOnduty_time(Date onduty_time) {
		this.ondutytime = onduty_time;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
