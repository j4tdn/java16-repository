package service;

import java.time.LocalDate;
import java.util.List;

import dao.DatabaseDao;
import dao.JdbcDatabaseDao;
import dto.ItemWithSellDateDto;

public class DatabaseServiceImpl implements DatabaseService {
	private DatabaseDao databaseDao;

	public DatabaseServiceImpl() {
		databaseDao = new JdbcDatabaseDao();
	}

	@Override
	public List<ItemWithSellDateDto> getItemByOrderTime(LocalDate date) {
		return databaseDao.getItemByOrderTime(date);
	}

}
