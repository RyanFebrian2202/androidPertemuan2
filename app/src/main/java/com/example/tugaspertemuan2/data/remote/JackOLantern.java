package com.example.tugaspertemuan2.data.remote;

import com.google.gson.annotations.SerializedName;

public class JackOLantern{

	@SerializedName("fusion")
	private Fusion fusion;

	@SerializedName("skills")
	private String skills;

	@SerializedName("data")
	private Data data;

	@SerializedName("base_cost")
	private String baseCost;

	@SerializedName("author_info")
	private String authorInfo;

	public void setFusion(Fusion fusion){
		this.fusion = fusion;
	}

	public Fusion getFusion(){
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