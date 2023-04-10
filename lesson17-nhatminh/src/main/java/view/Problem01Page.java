package view;

import java.time.LocalDate;

import service.DatabaseService;
import service.DatabaseServiceImpl;
import utils.PrintUtils;

public class Problem01Page {
	private static DatabaseService databaseService;
	static {
		databaseService = new DatabaseServiceImpl();
	}

	public static void main(String[] args) {
		PrintUtils.generate("List items be sold on 23-11-2019",
				databaseService.getItemByOrderTime(LocalDate.of(2019, 11, 23)));
	}
}
