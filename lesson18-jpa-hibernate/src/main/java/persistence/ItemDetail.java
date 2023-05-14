package persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item detail")
public class ItemDetail {

	@EmbeddedId
	private Id id;

	@Column(name = "amount")
	private Integer amount;
	
	// BTVN: Demo getItemDetail(Id id) --> load item

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

	public static class Id implements Serializable{
		private static final long serialVersionUID = 1L;

		@Column(name = "ITEM_ID")
		private Integer itemId;

		@Column(name = "SIZE_ID")
		private String sizeId;

		public Id() {
		}

		public Integer getItemId() {
			return itemId;
		}

		public void setItemId(Integer itemId) {
			this.itemId = itemId;
		}

		public String getSizeId() {
			return sizeId;
		}

		public void setSizeId(String sizeId) {
			this.sizeId = sizeId;
		}

		@Override
		public String toString() {
			return "Id [itemId=" + itemId + ", sizeId=" + sizeId + "]";
		}

	}

	@Override
	public String toString() {
		return "ItemDetail [id=" + id + ", amount=" + amount + "]";
	}

}
