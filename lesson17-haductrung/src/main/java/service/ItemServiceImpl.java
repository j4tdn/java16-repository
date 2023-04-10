package service;

import java.time.LocalDate;
import java.util.List;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

import dao.ItemDao;
import dao.JdbcItemDao;
import bean.Item;
import bean.ItemDto;

public class ItemServiceImpl implements ItemService {

private JdbcItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao = new JdbcItemDao();
	}
	
	

	public List<ItemDto> getItemsbyDate(LocalDate deliveryOrder) {
		return itemDao.getItemsbyDate(deliveryOrder);
	}

}
