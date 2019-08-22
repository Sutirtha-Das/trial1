package com.MongoDB.RestaurantDetails.RestaurantDetails.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Restaurant_Details {

	@Id
	private ObjectId _id;
	@Field("Restaurant ID")
	private String restaurantID;
	@Field("Restaurant Name")
	private String restaurantName;
	@Field("Cuisines")
	private String cuisines;
	@Field("Average Cost for two")
	private double averageCost;
	private String currency;
	@Field("Has table booking")
	private String hasTableBooking;
	@Field("Has online delivery")
	private String hasOnlineDelivery;
	@Field("Aggregrate Rating")
	private float rating;
	@Field("Rating color")
	private String color;
	@Field("Rating Text")
	private String ratingText;
	private int votes;
	public ObjectId get_id() {
		return _id;
	}
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	public String getRestaurantID() {
		return restaurantID;
	}
	public void setRestaurantID(String restaurantID) {
		this.restaurantID = restaurantID;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getCuisines() {
		return cuisines;
	}
	public void setCuisines(String cuisines) {
		this.cuisines = cuisines;
	}
	public double getAverageCost() {
		return averageCost;
	}
	public void setAverageCost(double averageCost) {
		this.averageCost = averageCost;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getHasTableBooking() {
		return hasTableBooking;
	}
	public void setHasTableBooking(String hasTableBooking) {
		this.hasTableBooking = hasTableBooking;
	}
	public String getHasOnlineDelivery() {
		return hasOnlineDelivery;
	}
	public void setHasOnlineDelivery(String hasOnlineDelivery) {
		this.hasOnlineDelivery = hasOnlineDelivery;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getRatingText() {
		return ratingText;
	}
	public void setRatingText(String ratingText) {
		this.ratingText = ratingText;
	}
	public int getVotes() {
		return votes;
	}
	public void setVotes(int votes) {
		this.votes = votes;
	}
	
	
}
