package ch07.home.hr.domain;

import java.time.LocalDate;

public class Worker {
	private String name;
	private String joinDate;
	private int workerId;
	
	public Worker(String name, String joinDate) {
		this.joinDate = joinDate;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	
	public void setWorkerId(int workerId) {
		this.workerId = workerId + 1;
	}

	public int getWorkerId() {
		return workerId;
	}

	public String toString() {
		return String.format("노동자Id는 %d 노동자 이름은 %s 입사일은 %s 입니다.\n", this.workerId, this.name, this.joinDate);
	}

}
