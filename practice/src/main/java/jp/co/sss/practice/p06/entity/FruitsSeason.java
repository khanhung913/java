package jp.co.sss.practice.p06.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "fruits_season")
public class FruitsSeason {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_fruits_season")
	@SequenceGenerator(sequenceName = "seq_fruits_season", name = "seq_fruits_season", allocationSize = 1)
	private long fruit_id;
	private String fruit_name;
	private long season_month;

	public long getFruit_id() {
		return fruit_id;
	}

	public void setFruit_id(long fruit_id) {
		this.fruit_id = fruit_id;
	}

	public String getFruit_name() {
		return fruit_name;
	}

	public void setFruit_name(String fruit_name) {
		this.fruit_name = fruit_name;
	}

	public long getSeason_month() {
		return season_month;
	}

	public void setSeason_month(long season_month) {
		this.season_month = season_month;
	}

}
