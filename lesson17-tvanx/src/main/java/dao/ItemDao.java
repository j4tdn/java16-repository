package dao;

import java.time.LocalDate;
import java.util.List;

import dto.ItemDtoOrderTime;

public interface ItemDao {
	List<ItemDtoOrderTime> getAll(LocalDate timeOrder); 
}
