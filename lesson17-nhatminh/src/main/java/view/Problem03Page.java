package view;

import service.DatabaseService;
import service.DatabaseServiceImpl;

public class Problem03Page {
	private static DatabaseService databaseService;
	static {
		databaseService = new DatabaseServiceImpl();
	}

	public static void main(String[] args) {
		PrintUtils("Prob 3: ", databaseService.getTop3ItemsToSring(2022));
	}
}
