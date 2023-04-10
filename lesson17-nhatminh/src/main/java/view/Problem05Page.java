package view;

import service.DatabaseService;
import service.DatabaseServiceImpl;
import utils.PrintUtils;

public class Problem05Page {
	private static DatabaseService databaseService;
	static {
		databaseService = new DatabaseServiceImpl();
	}

	public static void main(String[] args) {
		PrintUtils.generate("Prob 5: ", databaseService.insertDataFormTxt());
	}
}
