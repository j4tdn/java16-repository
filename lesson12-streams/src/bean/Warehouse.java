package bean;

import java.util.List;

public class Warehouse {
	private Integer id;
	private String name;
	private Integer countryId;
	private List<Integer> storedIds;
	
	public Warehouse() {
	}

	public Warehouse(Integer id, String name, Integer countryId, List<Integer> storedIds) {
		this.id = id;
		this.name = name;
		this.countryId = countryId;
		this.storedIds = storedIds;
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

	public Integer getCountryId() {
		return countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public List<Integer> getStoredIds() {
		return storedIds;
	}

	public void setStoredIds(List<Integer> storedIds) {
		this.storedIds = storedIds;
	}

	@Override
	public String toString() {
		return "Warehouse [id=" + id + ", name=" + name + ", countryId=" + countryId + ", storedIds=" + storedIds + "]";
	}
	
	
}
