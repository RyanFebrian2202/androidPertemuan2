package com.example.tugaspertemuan2.data.remote;

import com.google.gson.annotations.SerializedName;

public class Fortune{

	@SerializedName("Atropos")
	private Atropos atropos;

	@SerializedName("Fortuna")
	private Fortuna fortuna;

	@SerializedName("Norn")
	private Norn norn;

	@SerializedName("Stone of Scone")
	private StoneOfScone stoneOfScone;

	@SerializedName("Lachesis")
	private Lachesis lachesis;

	@SerializedName("Lakshmi")
	private Lakshmi lakshmi;

	@SerializedName("Clotho")
	private Clotho clotho;

	public void setAtropos(Atropos atropos){
		this.atropos = atropos;
	}

	public Atropos getAtropos(){
		return atropos;
	}

	public void setFortuna(Fortuna fortuna){
		this.fortuna = fortuna;
	}

	public Fortuna getFortuna(){
		return fortuna;
	}

	public void setNorn(Norn norn){
		this.norn = norn;
	}

	public Norn getNorn(){
		return norn;
	}

	public void setStoneOfScone(StoneOfScone stoneOfScone){
		this.stoneOfScone = stoneOfScone;
	}

	public StoneOfScone getStoneOfScone(){
		return stoneOfScone;
	}

	public void setLachesis(Lachesis lachesis){
		this.lachesis = lachesis;
	}

	public Lachesis getLachesis(){
		return lachesis;
	}

	public void setLakshmi(Lakshmi lakshmi){
		this.lakshmi = lakshmi;
	}

	public Lakshmi getLakshmi(){
		return lakshmi;
	}

	public void setClotho(Clotho clotho){
		this.clotho = clotho;
	}

	public Clotho getClotho(){
		return clotho;
	}
}