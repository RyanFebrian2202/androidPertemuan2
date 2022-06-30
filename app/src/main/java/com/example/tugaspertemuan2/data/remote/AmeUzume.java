package com.example.tugaspertemuan2.data.remote;

import com.google.gson.annotations.SerializedName;

public class AmeUzume{

	@SerializedName("fusion")
	private String fusion;

	@SerializedName("skills")
	private String skills;

	@SerializedName("data")
	private Data data;

	@SerializedName("base_cost")
	private String baseCost;

	@SerializedName("author_info")
	private String authorInfo;

	public void setFusion(String fusion){
		this.fusion = fusion;
	}

	public String getFusion(){
		return fusion;
	}

	public void setSkills(String skills){
		this.skills = skills;
	}

	public String getSkills(){
		return skills;
	}

	public void setData(Data data){
		this.data = data;
	}

	public Data getData(){
		return data;
	}

	public void setBaseCost(String baseCost){
		this.baseCost = baseCost;
	}

	public String getBaseCost(){
		return baseCost;
	}

	public void setAuthorInfo(String authorInfo){
		this.authorInfo = authorInfo;
	}

	public String getAuthorInfo(){
		return authorInfo;
	}
}