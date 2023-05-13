package persistence;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item_detail")
public class ItemDetail {

	@EmbeddedId
	private Id id;
	
	@Column(name = "amount")
	private Integer amount;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ITEM_ID", referencedColumnName = "ID")
	private Item item;
		
	public ItemDetail() {
	}
	public void setId(Id id) {
		this.id = id;
	}
	
	public Id getId() {
		return id;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	public Item getItem() {
		return item;
	}
	
	public void setItem(Item item) {
		this.item = item;
	}
	
	@Override
	public String toString() {
		return "ItemDetail [id=" + id + ", amount=" + amount + "]";
	}
	
	
	
}
