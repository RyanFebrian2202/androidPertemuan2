package com.example.tugaspertemuan2.data.remote;

import com.google.gson.annotations.SerializedName;

public class Resistance{

	@SerializedName("gun")
	private String gun;

	@SerializedName("electric")
	private String electric;

	@SerializedName("curse")
	private String curse;

	@SerializedName("fire")
	private String fire;

	@SerializedName("ice")
	private String ice;

	@SerializedName("psychic")
	private String psychic;

	@SerializedName("physical")
	private String physical;

	@SerializedName("nuclear")
	private String nuclear;

	@SerializedName("bless")
	private String bless;

	@SerializedName("wind")
	private String wind;

	public void setGun(String gun){
		this.gun = gun;
	}

	public String getGun(){
		return gun;
	}

	public void setElectric(String electric){
		this.electric = electric;
	}

	public String getElectric(){
		return electric;
	}

	public void setCurse(String curse){
		this.curse = curse;
	}

	public String getCurse(){
		return curse;
	}

	public void setFire(String fire){
		this.fire = fire;
	}

	public String getFire(){
		return fire;
	}

	public void setIce(String ice){
		this.ice = ice;
	}

	public String getIce(){
		return ice;
	}

	public void setPsychic(String psychic){
		this.psychic = psychic;
	}

	public String getPsychic(){
		return psychic;
	}

	public void setPhysical(String physical){
		this.physical = physical;
	}

	public String getPhysical(){
		return physical;
	}

	public void setNuclear(String nuclear){
		this.nuclear = nuclear;
	}

	public String getNuclear(){
		return nuclear;
	}

	public void setBless(String bless){
		this.bless = bless;
	}

	public String getBless(){
		return bless;
	}

	public void setWind(String wind){
		this.wind = wind;
	}

	public String getWind(){
		return wind;
	}
}