package service;

import java.util.List;


import java.util.Optional;
import java.util.stream.Collectors;

import bean.Item;
import bean.ItemGroup;
import dao.ItemDao;
import dao.ItemGroupDao;
import dao.JdbcItemDao;
import dao.jdbcItemGroupDao;
import dto.ItemGroupDto;

public class ItemGroupServiceImpl implements ItemGroupService {

	private final ItemGroupDao itemGroupDao;
	
	private final ItemDao itemDao;

	public ItemGroupServiceImpl() {
		itemGroupDao = new jdbcItemGroupDao();
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
	public List<ItemGroupDto> CountItemByItemGroup() {
		return itemGroupDao.CountItemByItemGroup();
	}

	@Override
	public ItemGroup get(int id) {
		return itemGroupDao.get(id);
	}
	
	@Override
	public ItemGroup get(String name) {
		return itemGroupDao.get(name);
	}

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
		if (Optional.ofNullable(get(ig.getId())).isPresent()) {
			update(ig);
		} else {
			save(ig);
		}
	}


}