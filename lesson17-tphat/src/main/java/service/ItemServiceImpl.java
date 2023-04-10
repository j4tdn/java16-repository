package service;

import java.time.LocalDate;
import java.util.List;

import dao.ItemDao;
import dao.JdbcItemDao;
import dto.ItemDto;

public class ItemServiceImpl implements ItemService{
	private final ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao = new JdbcItemDao();
	}
	

	@Override
	public List<ItemDto> getItemByAnyDate(LocalDate date) {
		return itemDao.getItemByAnyDate(date);
	}

}
