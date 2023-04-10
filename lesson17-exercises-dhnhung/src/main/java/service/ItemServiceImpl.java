package service;

import java.time.LocalDate;
import java.time.Year;
import java.util.List;

import bean.Item;
import dao.ItemDao;
import dao.JdbcItemDao;
import dto.ItemOrderTimeDto;

public class ItemServiceImpl implements ItemService{
	
	private final ItemDao  itemDao;
	
	public ItemServiceImpl() {
		itemDao = new JdbcItemDao();
	}
	
	
	@Override
	public List<ItemOrderTimeDto> getItems(LocalDate sellDate) {
		return itemDao.getItems(sellDate);
	}


	 @Override
	    public List<Item> getHighestPriceItemsByItemGroup() {
	        return itemDao.getHighestPriceItemsByItemGroup();
	    }


	@Override
	public List<String> getBestSellingItems(Year year) {
		 return itemDao.getBestSellingItems(year);
	}
}
