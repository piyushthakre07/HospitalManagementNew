package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity

public class Coin {
 
	@Id @JsonIgnore
	Integer coinId ;
	@JsonProperty("coinname")
	String coinName ; 
	
	@JsonProperty("price")
	Integer coinPrice ;
	
	
	public String getCoinName() {
		return coinName;
	}
	public void setCoinName(String coinName) {
		this.coinName = coinName;
	}
	public Integer getCoinPrice() {
		return coinPrice;
	}
	public void setCoinPrice(Integer coinPrice) {
		this.coinPrice = coinPrice;
	} 
	
}
