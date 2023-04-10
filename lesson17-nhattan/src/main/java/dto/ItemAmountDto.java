package dto;

public class ItemAmountDto extends ItemDto {
	
	public static final String PROP_AMOUNT = "amount";
	
	private Integer Amount;
	
	public ItemAmountDto() {
	}

	public ItemAmountDto(Integer itId, String itName, Integer amount) {
		super(itId, itName);
		Amount = amount;
	}

	public Integer getAmount() {
		return Amount;
	}

	public void setAmount(Integer amount) {
		Amount = amount;
	}

	@Override
	public String toString() {
		return "ItemAmountDto [Amount=" + Amount + ", toString()=" + super.toString() + "]";
	}
}
