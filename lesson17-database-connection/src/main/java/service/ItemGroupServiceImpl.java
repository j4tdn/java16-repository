package service;

import java.util.List;
import java.util.Optional;

import bean.ItemGroup;
import dao.ItemGroupDao;
import dao.JDBCItemGroupDao;

public class ItemGroupServiceImpl implements ItemGroupService {
	
	private ItemGroupDao itemgroupdao;
	public ItemGroupServiceImpl() {
		itemgroupdao = new JDBCItemGroupDao();
	}
	public List<ItemGroup> getAll() {
		
		return itemgroupdao.getAll();
	}
	@Override
	public ItemGroup get(int id) {
		
		return itemgroupdao.get(id);
	}
	@Override
	public void save(ItemGroup ig) {
		itemgroupdao.save(ig);
	}
	@Override
	public void update(ItemGroup ig) {
		itemgroupdao.update(ig);
		
	}
	@Override
	public void saveOrUpdate(ItemGroup ig) {
		if(Optional.ofNullable(ig.getId()).isPresent()) {
			update(ig);
		}else {
			save(ig);
		}
		
	}
	@Override
	public ItemGroup get(String name) {
		
		return itemgroupdao.get(name);
	}
	

}
