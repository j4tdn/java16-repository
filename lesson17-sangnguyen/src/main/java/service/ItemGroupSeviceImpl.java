package service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import bean.Item;
import bean.ItemGroup;
import dao.ItemDao;
import dao.ItemGroupDao;
import dao.JdbcItemDao;
import dao.JdbcItemGroupDao;

public class ItemGroupSeviceImpl implements ItemGroupService{
	
	private final ItemGroupDao itemGroupDao;
	
	private final ItemDao itemDao;
	
	public ItemGroupSeviceImpl() {
		itemGroupDao = new JdbcItemGroupDao();
		itemDao = new JdbcItemDao();
	}
	
	@Override
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}
	
	@Override
	public List<ItemGroup> getItemGroups() {
		return itemDao.getItems()
				.stream()
				.collect(Collectors.groupingBy(Item::getItemGroup))
				.entrySet()
					.stream()
					.map(ItemGroup::new)
					.collect(Collectors.toList());
	}
	
	@Override
	public ItemGroup get(int id) {
		return itemGroupDao.get(id);
	}
	
	@Override
	public ItemGroup get(String name) {
		// TODO Auto-generated method stub
		return itemGroupDao.get(name);
	}
	
	@Override
	public List<ItemGroup> getItemsInAYear(String year) {
		// TODO Auto-generated method stub
		return itemGroupDao.getItemsInAYear(year);
	}
	
	@Override
	public List<ItemGroup> getAllItems() {
		// TODO Auto-generated method stub
		return itemGroupDao.getAllItems();
	}
}
