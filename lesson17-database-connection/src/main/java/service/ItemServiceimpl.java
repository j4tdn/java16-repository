package service;

import java.util.List;

import bean.Item;
import dao.ItemDao;
import dao.JDBCItemDao;

public class ItemServiceimpl implements ItemService{
	private ItemDao itemdao;

	public ItemServiceimpl() {
		itemdao = new JDBCItemDao();
	}
	@Override
	public List<Item> getAll() {
		// TODO Auto-generated method stub
		return itemdao.getAll();
	}
	@Override
	public List<Item> getItems(int igId) {

		return itemdao.getItems(igId);
	}

}