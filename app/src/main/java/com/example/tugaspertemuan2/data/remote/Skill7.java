package com.example.tugaspertemuan2.data.remote;

import com.google.gson.annotations.SerializedName;

public class Skill7{

	@SerializedName("skill_name")
	private String skillName;

	@SerializedName("skill_level")
	private String skillLevel;

	public void setSkillName(String skillName){
		this.skillName = skillName;
	}

	public String getSkillName(){
		return skillName;
	}

	public void setSkillLevel(String skillLevel){
		this.skillLevel = skillLevel;
	}

	public String getSkillLevel(){
		return skillLevel;
	}
}