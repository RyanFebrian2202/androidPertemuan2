package com.example.tugaspertemuan2.data.remote;

import com.google.gson.annotations.SerializedName;

public class Judgement{

	@SerializedName("Yamata--Orochi")
	private YamataOrochi yamataOrochi;

	@SerializedName("Michael")
	private Michael michael;

	@SerializedName("Abaddon")
	private Abaddon abaddon;

	@SerializedName("Trumpeter")
	private Trumpeter trumpeter;

	@SerializedName("Anubis")
	private Anubis anubis;

	@SerializedName("Satan")
	private Satan satan;

	@SerializedName("Shiva")
	private Shiva shiva;

	public void setYamataOrochi(YamataOrochi yamataOrochi){
		this.yamataOrochi = yamataOrochi;
	}

	public YamataOrochi getYamataOrochi(){
		return yamataOrochi;
	}

	public void setMichael(Michael michael){
		this.michael = michael;
	}

	public Michael getMichael(){
		return michael;
	}

	public void setAbaddon(Abaddon abaddon){
		this.abaddon = abaddon;
	}

	public Abaddon getAbaddon(){
		return abaddon;
	}

	public void setTrumpeter(Trumpeter trumpeter){
		this.trumpeter = trumpeter;
	}

	public Trumpeter getTrumpeter(){
		return trumpeter;
	}

	public void setAnubis(Anubis anubis){
		this.anubis = anubis;
	}

	public Anubis getAnubis(){
		return anubis;
	}

	public void setSatan(Satan satan){
		this.satan = satan;
	}

	public Satan getSatan(){
		return satan;
	}

	public void setShiva(Shiva shiva){
		this.shiva = shiva;
	}

	public Shiva getShiva(){
		return shiva;
	}
}