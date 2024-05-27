package models;

public class Bid {
	private int bidId;
	private int tenderId;
	private int bidAmount;
	private String deliveryTimeStatus;
	private String createdAt;
	private int vendorId;
	public int getBidId() {
		return bidId;
	}
	public void setBidId(int bidId) {
		this.bidId = bidId;
	}
	public int getTenderId() {
		return tenderId;
	}
	public void setTenderId(int tenderId) {
		this.tenderId = tenderId;
	}
	public int getBidAmount() {
		return bidAmount;
	}
	public void setBidAmount(int bidAmount) {
		this.bidAmount = bidAmount;
	}
	public String getDeliveryTimeStatus() {
		return deliveryTimeStatus;
	}
	public void setDeliveryTimeStatus(String deliveryTimeStatus) {
		this.deliveryTimeStatus = deliveryTimeStatus;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	
	

}
