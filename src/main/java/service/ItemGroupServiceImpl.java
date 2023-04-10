package service;

import java.util.List;
import java.util.Optional;

import bean.ItemGroup;
import dao.ItemGroupDao;
import dao.JDBCItemGroupDao;

public class ItemGroupServiceImpl implements ItemGroupService{
	
	private static ItemGroupDao itemGroupDao;
		
	public ItemGroupServiceImpl() {
		itemGroupDao= new JDBCItemGroupDao();
	}
	@Override
	public List<ItemGroup> getAll() {
		// TODO Auto-generated method stub
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
		if(Optional.ofNullable(get(ig.getId())).isPresent()) {
			update(ig);
		}else {
			save(ig);
		}
		
	}
	@Override
	public ItemGroup get(String name) {
		
		return itemGroupDao.get(name);
	}

}
