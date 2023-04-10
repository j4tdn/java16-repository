package service;

import java.time.LocalDate;
import java.time.Year;
import java.util.List;

import dto.ItemOrderTimeDto;
import dto.ItemSellPriceDto;

public interface ItemService {
	
	List<ItemOrderTimeDto> getItemsOrderTime(LocalDate orderDate);
	
	List<String> getNamesOfTop3Items(Year year);
	
	List<ItemSellPriceDto> getItemsMaxPriceByIgId();
}
