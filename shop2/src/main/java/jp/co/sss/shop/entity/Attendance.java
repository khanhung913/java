package jp.co.sss.shop.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "timetable")
public class Attendance {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_seq")
	@SequenceGenerator(name = "id_seq", sequenceName = "id_create_seq",allocationSize = 1)
	private long id;
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