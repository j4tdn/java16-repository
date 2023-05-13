package service;

import java.util.List;
import java.util.Objects;

import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;
import persistence.ItemGroup;
import persistence.ItemGroupDto;

public class ItemGroupServiceImpl implements ItemGroupService {
	
	private ItemGroupDao itemGroupDao;
	
	public ItemGroupServiceImpl() {
	itemGroupDao = new HibernateItemGroupDao();
	}
	
	public List<ItemGroup> getAll() {//câu 1: Liệt kê tất cả các loại hàng
		return itemGroupDao.getAll();
	}
	
	@Override
	public ItemGroup get(int id) {//câu 2:  Liệt kê tất cả các loại hàng [theo MaLoai]
		return itemGroupDao.get(id);
	}
	@Override
	public List<ItemGroupDto> statistic() {
		return itemGroupDao.statistic();
	}
	@Override
	public void save(ItemGroup itemGroup) {
		Objects.requireNonNull(itemGroup,"item Group should not be null!!");
	    itemGroupDao.save(itemGroup);
	}
	@Override
	public void save(List<ItemGroup> itemGroups) {

		Objects.requireNonNull(itemGroups,"item Group should not be null!!");
		if(itemGroups.isEmpty()) {
			return;
		}
		itemGroupDao.save(itemGroups);
	}

}
