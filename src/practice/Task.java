package practice;

import java.time.LocalDate;

public class Task {
	public LocalDate day;
	public String schedule;

	public Task(LocalDate day, String schedule) {
		this.day = day;
		this.schedule = schedule;
	}

	public LocalDate getDay() {
		return day;
	}
}
