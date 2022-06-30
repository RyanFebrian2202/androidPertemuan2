package com.example.tugaspertemuan2.data.remote;

import com.google.gson.annotations.SerializedName;

public class Emperor{

	@SerializedName("Setanta")
	private Setanta setanta;

	@SerializedName("Okuninushi")
	private Okuninushi okuninushi;

	@SerializedName("Baal")
	private Baal baal;

	@SerializedName("King Frost")
	private KingFrost kingFrost;

	@SerializedName("Barong")
	private Barong barong;

	@SerializedName("Eligor")
	private Eligor eligor;

	@SerializedName("Regent")
	private Regent regent;

	@SerializedName("Oberon")
	private Oberon oberon;

	@SerializedName("Odin")
	private Odin odin;

	@SerializedName("Thoth")
	private Thoth thoth;

	public void setSetanta(Setanta setanta){
		this.setanta = setanta;
	}

	public Setanta getSetanta(){
		return setanta;
	}

	public void setOkuninushi(Okuninushi okuninushi){
		this.okuninushi = okuninushi;
	}

	public Okuninushi getOkuninushi(){
		return okuninushi;
	}

	public void setBaal(Baal baal){
		this.baal = baal;
	}

	public Baal getBaal(){
		return baal;
	}

	public void setKingFrost(KingFrost kingFrost){
		this.kingFrost = kingFrost;
	}

	public KingFrost getKingFrost(){
		return kingFrost;
	}

	public void setBarong(Barong barong){
		this.barong = barong;
	}

	public Barong getBarong(){
		return barong;
	}

	public void setEligor(Eligor eligor){
		this.eligor = eligor;
	}

	public Eligor getEligor(){
		return eligor;
	}

	public void setRegent(Regent regent){
		this.regent = regent;
	}

	public Regent getRegent(){
		return regent;
	}

	public void setOberon(Oberon oberon){
		this.oberon = oberon;
	}

	public Oberon getOberon(){
		return oberon;
	}

	public void setOdin(Odin odin){
		this.odin = odin;
	}

	public Odin getOdin(){
		return odin;
	}

	public void setThoth(Thoth thoth){
		this.thoth = thoth;
	}

	public Thoth getThoth(){
		return thoth;
	}
}