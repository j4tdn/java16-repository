package service;

import java.time.LocalDate;
import java.time.Year;
import java.util.List;

import bean.Item;
import dao.ItemDao;
import dao.JdbcItemDao;
import dto.ItemGroupDto;
import dto.ItemOrderTimeDto;
import dto.ItemSellPriceDto;

public class ItemServiceImpl implements ItemService{
	private final ItemDao itemDao;
	
	public ItemServiceImpl() {
		this.itemDao = new JdbcItemDao();
	}

//	@Override
//	public List<Item> getAll() {
//		return itemDao.getAll();
//	}
//	
//	@Override
//	public List<Item> getItems(int igID) {
//		return itemDao.getItems(igID);
//	}
//	
//	@Override
//	public List<Item> getItems(LocalDate sellDate) {
//		return itemDao.getItems(sellDate);
//	}
	
	@Override
	public List<ItemOrderTimeDto> getItemsOrderTime(LocalDate orderDate) {
		return itemDao.getItemsOrderTime(orderDate);
	}
	
	@Override
	public List<String> getNamesOfTop3Items(Year year) {
		return itemDao.getNamesOfTop3Items(year);
	}
	
	@Override
	public List<ItemSellPriceDto> getItemsMaxPriceByIgId() {
		return itemDao.getItemsMaxPriceByIgId();
	}
}
