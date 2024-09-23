package com.courier.controller.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class CourierEntity{

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
	
	
	public CourierEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CourierEntity(String trackId, String currentUser, String senderName, String receieverName,
			String senderNumber, String receiverNumber, String senderAddress, String receiverAddress, String dataId,
			String category, String timeId, String length, String width, String height) {
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
	}

	public String getCurrentUser() {
		return currentUser;
	}
	public void setCurrentUser(String currentUser) {
		this.currentUser = currentUser;
	}
	public String getTrackId() {
		return trackId;
	}
	public void setTrackId(String trackId) {
		this.trackId = trackId;
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
	
	

}
