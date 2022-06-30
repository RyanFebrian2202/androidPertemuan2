package com.example.tugaspertemuan2.data.remote;

import com.google.gson.annotations.SerializedName;

public class Data{

	@SerializedName("level")
	private String level;

	@SerializedName("stats")
	private Stats stats;

	@SerializedName("resistance")
	private Resistance resistance;

	public void setLevel(String level){
		this.level = level;
	}

	public String getLevel(){
		return level;
	}

	public void setStats(Stats stats){
		this.stats = stats;
	}

	public Stats getStats(){
		return stats;
	}

	public void setResistance(Resistance resistance){
		this.resistance = resistance;
	}

	public Resistance getResistance(){
		return resistance;
	}
}