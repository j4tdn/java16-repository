package service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import dao.ItemDao;
import dao.JdbcItemDao;
import dto.ItemDtoOrderTime;

public class ItemServiceImpl implements ItemService{
	
	private final ItemDao  itemDao;
	
	public ItemServiceImpl() {
		itemDao = new JdbcItemDao();
	}
	
	@Override
		public List<ItemDtoOrderTime> getAll(LocalDate timeOrder) {
		return itemDao.getAll(timeOrder);
		}
}
