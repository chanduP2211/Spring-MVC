package com.courier.controller.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ShoppingEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1230003996115259213L;
	@Id
	private String trackId;
	private String currentUser;
	private String senderName;
	private String receieverName;
	private String senderNumber;
	private String receiverNumber;
	private String senderAddress;
	private String receiverAddress;
	private String dataId;
	private String category;
	private String timeId;
	private String length;
	private String width;
	private String height;
	private String weight;
	private String distance;
	private String expectedDelivery;
	private String status;
	private String paymentMode;
	private String shipmentType;
	private String amount;
	
	
	public ShoppingEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ShoppingEntity(String trackId, String currentUser, String senderName, String receieverName,
			String senderNumber, String receiverNumber, String senderAddress, String receiverAddress, String dataId,
			String category, String timeId, String length, String width, String height, String weight, String distance,
			String expectedDelivery, String status, String paymentMode, String shipmentType, String amount) {
		super();
		this.trackId = trackId;
		this.currentUser = currentUser;
		this.senderName = senderName;
		this.receieverName = receieverName;
		this.senderNumber = senderNumber;
		this.receiverNumber = receiverNumber;
		this.senderAddress = senderAddress;
		this.receiverAddress = receiverAddress;
		this.dataId = dataId;
		this.category = category;
		this.timeId = timeId;
		this.length = length;
		this.width = width;
		this.height = height;
		this.weight = weight;
		this.distance = distance;
		this.expectedDelivery = expectedDelivery;
		this.status = status;
		this.paymentMode = paymentMode;
		this.shipmentType = shipmentType;
		this.amount = amount;
	}


	public String getTrackId() {
		return trackId;
	}


	public void setTrackId(String trackId) {
		this.trackId = trackId;
	}


	public String getCurrentUser() {
		return currentUser;
	}


	public void setCurrentUser(String currentUser) {
		this.currentUser = currentUser;
	}


	public String getSenderName() {
		return senderName;
	}


	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}


	public String getReceieverName() {
		return receieverName;
	}


	public void setReceieverName(String receieverName) {
		this.receieverName = receieverName;
	}


	public String getSenderNumber() {
		return senderNumber;
	}


	public void setSenderNumber(String senderNumber) {
		this.senderNumber = senderNumber;
	}


	public String getReceiverNumber() {
		return receiverNumber;
	}


	public void setReceiverNumber(String receiverNumber) {
		this.receiverNumber = receiverNumber;
	}


	public String getSenderAddress() {
		return senderAddress;
	}


	public void setSenderAddress(String senderAddress) {
		this.senderAddress = senderAddress;
	}


	public String getReceiverAddress() {
		return receiverAddress;
	}


	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}


	public String getDataId() {
		return dataId;
	}


	public void setDataId(String dataId) {
		this.dataId = dataId;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getTimeId() {
		return timeId;
	}


	public void setTimeId(String timeId) {
		this.timeId = timeId;
	}


	public String getLength() {
		return length;
	}


	public void setLength(String length) {
		this.length = length;
	}


	public String getWidth() {
		return width;
	}


	public void setWidth(String width) {
		this.width = width;
	}


	public String getHeight() {
		return height;
	}


	public void setHeight(String height) {
		this.height = height;
	}


	public String getWeight() {
		return weight;
	}


	public void setWeight(String weight) {
		this.weight = weight;
	}


	public String getDistance() {
		return distance;
	}


	public void setDistance(String distance) {
		this.distance = distance;
	}


	public String getExpectedDelivery() {
		return expectedDelivery;
	}


	public void setExpectedDelivery(String expectedDelivery) {
		this.expectedDelivery = expectedDelivery;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getPaymentMode() {
		return paymentMode;
	}


	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}


	public String getShipmentType() {
		return shipmentType;
	}


	public void setShipmentType(String shipmentType) {
		this.shipmentType = shipmentType;
	}


	public String getAmount() {
		return amount;
	}


	public void setAmount(String amount) {
		this.amount = amount;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	
	
	

}
