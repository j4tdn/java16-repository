package service;

import java.time.LocalDate;
import java.util.List;

import dto.ItemDto;

public interface ItemService {
	List<ItemDto> getItemByAnyDate(LocalDate date);
}
