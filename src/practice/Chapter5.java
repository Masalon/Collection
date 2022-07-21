package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Chapter5 {

	public static void main(String[] args) {
		List<Task> dates = new ArrayList<Task>();
		dates.add(new Task(LocalDate.parse("2021-10-21"), "牛乳を買う"));
		dates.add(new Task(LocalDate.parse("2021-09-15"), "○○社面談"));
		dates.add(new Task(LocalDate.parse("2021-12-04"), "手帳を買う"));
		dates.add(new Task(LocalDate.parse("2021-08-10"), "散髪に行く"));
		dates.add(new Task(LocalDate.parse("2021-11-09"), "スクールの課題を解く"));

		dates.sort(Comparator.comparing(Task::getDay));
		for (Task str : dates) {
			System.out.println(str.day + ":" + str.schedule);
		}
	}
}

// DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");

// 1. Create hash map (key:value) (date : what you are doing that day)
/*
 * Map<LocalDate, String> day1 = new HashMap<>();
 * day1.put(LocalDate.parse("2021-10-21"), "牛乳を買う");
 * day1.put(LocalDate.parse("2021-09-15"), "○○社面談");
 * day1.put(LocalDate.parse("2021-12-04"), "手帳を買う");
 * day1.put(LocalDate.parse("2021-08-10"), "散髪に行く");
 * day1.put(LocalDate.parse("2021-11-09"), "スクールの課題を解く"); // 2. Sort the Dates
 * 
 * ArrayList<LocalDate> dates = new ArrayList<>();
 * dates.add(LocalDate.parse("2021-10-21",f));
 * dates.add(LocalDate.parse("2021-09-15",f));
 * dates.add(LocalDate.parse("2021-12-04",f));
 * dates.add(LocalDate.parse("2021-08-10",f));
 * dates.add(LocalDate.parse("2021-11-09",f));
 * 
 * Collections.sort(dates, new sortCompare()); System.out.println()
 * for(LocalDate d : dates) { } // 3. Loop the sorted dates and use the hashmap
 * to get what you are doing that day, print them both during each loop
 * 
 * }
 */