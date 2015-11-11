package com.statravel.qa.domain;

public enum Page {
	CHEAP_FLIGHTS("cheap.flights.url"),
	INSURANCE_LANDING("insurance.landing.url"),
	CONTACT_US("contact.us.url"),
	CALL_US("call.us.url"),
	EMAIL_US("email.us.url"),
	FIND_STORE("find.store.url"),
	EXISTING_BOOKING("existing.booking.url"),
	CUSTOMER_SERVICES("customer.services.url"),
	STORES("stores.url"),
	APPOINTMENT("book.appointment"),
	AIR_BNB("airbnb.url");

	private String urlProperty;
	
	private Page(String url){
		this.urlProperty = url;
	}
	
	public String getPageUrl() {
		return this.urlProperty;
	}

	public void setPageUrlProperty(String urlProperty) {
		this.urlProperty = urlProperty;
	}
}
