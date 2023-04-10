package service;

import java.util.List;
import java.util.Optional;

import bean.ItemGroup;
import dao.ItemGroupDao;
import dao.JdbcItemGroupDao;

public class ItemGroupServiceImpl implements ItemGroupService{

	private ItemGroupDao itemGroupDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new JdbcItemGroupDao();
	}
	
	@Override
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}
	
	@Override
	public ItemGroup get(int id) {
		return itemGroupDao.get(id);
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
