package com.cg.ngoportal.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "NDonationItem")
public class DonationItem {
	@Id
	private int itemId;
	@OneToOne
	private DonationType item;
	private String itemDescription;
	public DonationItem(int itemId, DonationType item, String itemDescription) {
		super();
		this.itemId = itemId;
		this.item = item;
		this.itemDescription = itemDescription;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public DonationType getItem() {
		return item;
	}
	public void setItem(DonationType item) {
		this.item = item;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	@Override
	public String toString() {
		return "DonationItem [itemId=" + itemId + ", item=" + item + ", itemDescription=" + itemDescription + "]";
	}
	
	
	
	
}
