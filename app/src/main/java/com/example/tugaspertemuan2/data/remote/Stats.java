package com.example.tugaspertemuan2.data.remote;

import com.google.gson.annotations.SerializedName;

public class Stats{

	@SerializedName("magic")
	private String magic;

	@SerializedName("luck")
	private String luck;

	@SerializedName("strength")
	private String strength;

	@SerializedName("endurance")
	private String endurance;

	@SerializedName("agility")
	private String agility;

	public void setMagic(String magic){
		this.magic = magic;
	}

	public String getMagic(){
		return magic;
	}

	public void setLuck(String luck){
		this.luck = luck;
	}

	public String getLuck(){
		return luck;
	}

	public void setStrength(String strength){
		this.strength = strength;
	}

	public String getStrength(){
		return strength;
	}

	public void setEndurance(String endurance){
		this.endurance = endurance;
	}

	public String getEndurance(){
		return endurance;
	}

	public void setAgility(String agility){
		this.agility = agility;
	}

	public String getAgility(){
		return agility;
	}
}