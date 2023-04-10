package service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import bean.Item;
import bean.ItemGroup;
import dao.ItemDao;
import dao.ItemGroupDao;
import dao.JdbcItemDao;
import dao.JdbcItemGroupDao;
import dto.ItemGroupDto;

public class ItemGroupServiceImpl implements ItemGroupService {
	
	private ItemGroupDao itemGroupDao;
	private ItemDao itemDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new JdbcItemGroupDao();
		itemDao = new JdbcItemDao();
	}
	
	@Override
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}
	
	@Override
	public ItemGroup get(int id) {
		return itemGroupDao.get(id);
	};
	
	@Override
	public ItemGroup get(String name) {
		return itemGroupDao.get(name);
	}
	
//	@Override
//	public ItemGroup getDetail(int id) {
//		ItemGroup ig = itemGroupDao.get(id);
//		List<Item> items = itemDao.getItems(id);
//		
//		return new ItemGroup(ig, items);
//	}
	
	@Override
	public void save(ItemGroup ig) {
		itemGroupDao.save(ig);
	}
	
	@Override
	public void update(ItemGroup ig) {
		itemGroupDao.update(ig);
	}
	
	@Override
	public void saveOrUpdate(ItemGroup ig) {
		if (Optional.ofNullable(ig.getId()).isPresent()) {
			update(ig);
		} else {
			save(ig);
		}
	}
	
	@Override
	public List<ItemGroupDto> countItemsByItemsGroup() {
		return itemGroupDao.countItemsByItemsGroup();
	}
}
