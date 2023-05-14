package service;

import java.util.List;
import java.util.Objects;

import dao.HibernateItemDao;
import dao.HibernateItemGroupDao;
import dao.ItemDao;
import dao.ItemGroupDao;
import persistence.Item;
import persistence.ItemGroup;

public class ItemServiceImpl implements ItemService{

	private ItemDao itemDao;
	
	private ItemGroupDao itemGroupDao;
	
	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
		itemGroupDao = new HibernateItemGroupDao();
	}
	
	@Override
	public List<Item> getAll() {
		return itemDao.getAll();
	}
	
	@Override
	public void saveOrUpdate(Item item) {
		Objects.requireNonNull(item, "item should not be null !");
		ItemGroup ig = item.getItemGroup();
		Objects.requireNonNull(ig, "item group should not be null !");
		
		if (itemGroupDao.get(ig.getId()) == null) {
			itemGroupDao.save(ig);
		}
		
		// ig already existed
		itemDao.saveOrUpdate(item);
	}

}