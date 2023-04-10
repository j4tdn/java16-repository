package service;

import java.time.LocalDate;
import java.util.List;

import dto.ItemDtoOrderTime;

public interface ItemService {
	List<ItemDtoOrderTime> getAll(LocalDate timeOrder); 
}
