package practice;

import java.time.LocalDate;

public class Task {
	private LocalDate day;
	private String schedule;

	public Task(LocalDate day, String schedule) {
		this.day = day;
		this.schedule = schedule;
	}

	public LocalDate getDay() {
		return day;
	}

	public String getSchedule() {
		return schedule;
	}
}
