package dto;

import java.time.LocalDate;

public class ItemWithSellDateDto {
	private Integer id;
	private String name;
	private LocalDate date;

	public ItemWithSellDateDto() {
		super();
	}

	public ItemWithSellDateDto(Integer id, String name, LocalDate date) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "ItemWithSellDateDto [id=" + id + ", name=" + name + ", date=" + date + "]";
	}
}
