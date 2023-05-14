package persistence;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class ItemDetail {

	@EmbeddedId
	private Id id;

	@Column(name = "amount")
	private Integer amount;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "item_id", referencedColumnName = "id")
	private Item item;

	public ItemDetail() {
	}

	public ItemDetail(Id id, Integer amount) {
		this.id = id;
		this.amount = amount;
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

	@Embeddable
	public static class Id {
		@Column(name = "item_id")
		private Integer itemId;

		@Column(name = "size_id")
		private String sizeId;

		public Id() {
		}

		public Id(Integer itemId, String sizeId) {
			this.itemId = itemId;
			this.sizeId = sizeId;
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
	}
}
