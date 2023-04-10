package service;

import java.time.LocalDate;
import java.util.List;

import dao.ItemDao;
import dao.JdbcItemDao;
import dto.ItemDto;

public class ItemServiceImpl implements ItemService{
		private ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao = new JdbcItemDao();
	}

	public List<ItemDto> getItemsByDate(LocalDate date) {
		return itemDao.getItemsByDate(date);
	}

	public List<String> getThreeItemBestSellingOfTheYear(int year) {
		return itemDao.getThreeItemBestSellingOfTheYear(year);
	}

}
