package persistence;

public class ItemGroupDto {
	
	public static final String PROP_ID = "id";
	public static final String PROP_NAME = "name";
	public static final String PROP_AMOUNT = "amount";
	
	private Integer id;
	private String name;
	private Integer amount;
	
	 public ItemGroupDto() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ItemGroupDto [id=" + id + ", name=" + name + ", amount=" + amount + "]";
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

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public static String getPropId() {
		return PROP_ID;
	}

	public static String getPropName() {
		return PROP_NAME;
	}

	public static String getPropAmount() {
		return PROP_AMOUNT;
	}

	public ItemGroupDto(Integer id, String name, Integer amount) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
	}

}
