package service;

import java.util.List;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.Item;

public class ItemServiceImpl implements ItemService{
	private ItemDao itemdao;
	
	public ItemServiceImpl() {
		itemdao = new HibernateItemDao();
	}
	@Override
	public List<Item> getAll() {
		return itemdao.getAll();
	}

}
