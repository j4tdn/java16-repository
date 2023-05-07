package service;

import java.util.List;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.Item;

public class ItemServiceIpml implements ItemService {

	private ItemDao itemDao;
	
	public ItemServiceIpml()
	{
		itemDao = new HibernateItemDao();
	}
	@Override
	public List<Item> getALl() {
		return itemDao.getALl();
	}

}
