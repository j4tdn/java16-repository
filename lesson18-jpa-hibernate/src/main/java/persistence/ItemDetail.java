package persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item_detail")
public class ItemDetail {

	// HOMEWORK: Demo getItemDetail(ID id) --> load item
	
	@EmbeddedId
	private Id id;
	
	@Column(name = "amount")
	private Integer amount;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ITEM_ID", referencedColumnName = "ID")
	private Item item;
	
	public ItemDetail() {
	}
	
	
	public Id getId() {
		return id;
	}


	public void setId(Id id) {
		this.id = id;
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



	@Embeddable
	public static class Id implements Serializable{
	
		private static final long serialVersionUID = 1L;

		@Column(name = "item_id")
		private Integer itemId;
		
		@Column(name = "size_id")
		private Integer sizeId;
		
		public Id() {
		}

		public Integer getItemId() {
			return itemId;
		}

		public void setItemId(Integer itemId) {
			this.itemId = itemId;
		}

		public Integer getSizeId() {
			return sizeId;
		}

		public void setSizeId(Integer sizeId) {
			this.sizeId = sizeId;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
	}
}
