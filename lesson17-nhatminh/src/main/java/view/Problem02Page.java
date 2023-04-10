package view;

import service.DatabaseService;
import service.DatabaseServiceImpl;
import utils.PrintUtils;

public class Problem02Page {
	private static DatabaseService databaseService;
	static {
		databaseService = new DatabaseServiceImpl();
	}

	public static void main(String[] args) {
		PrintUtils.generate("Prob 2: ", databaseService.getItemGroups());
	}
}
