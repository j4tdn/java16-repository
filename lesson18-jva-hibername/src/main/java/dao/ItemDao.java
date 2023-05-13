package dao;

import java.util.List;

import persistence.Item;

public interface ItemDao {
	List<Item> getAll();//câu 3: liệt kê tất cả các mặt hàng chứa thông tin loại hàng
	
	void saveOrUpdate(Item item);
}
