package service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import bean.ItemDTO;
import bean.ItemDTOByItemGroup;
import dao.ItemDao;
import dao.JdbcItemDao;


public class ItemServiceImpl implements ItemService {
	private ItemDao itemDao;

	public ItemServiceImpl() {
		itemDao = new JdbcItemDao();
	}



	@Override
	public List<ItemDTO> getItemsbyDate(LocalDate deliveryOrder) {
		return itemDao.getItemsbyDate(deliveryOrder);
	}
	@Override
	public List<String> getTop3Items(Integer year) {
		 List<ItemDTO> items = itemDao.getTop3Items(year);
		 return items.stream().map(ItemDTO::getName)
		.collect(Collectors.toList());
	}
	@Override
	public List<ItemDTOByItemGroup> getItemsByIG() {
		return itemDao.getItemsByIG();
	}
}