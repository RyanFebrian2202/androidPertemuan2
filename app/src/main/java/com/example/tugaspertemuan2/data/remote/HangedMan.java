package com.example.tugaspertemuan2.data.remote;

import com.google.gson.annotations.SerializedName;

public class HangedMan{

	@SerializedName("Attis")
	private Attis attis;

	@SerializedName("Orthrus")
	private Orthrus orthrus;

	@SerializedName("Hua Po")
	private HuaPo huaPo;

	@SerializedName("Take-Minakata")
	private TakeMinakata takeMinakata;

	@SerializedName("emperors Amulet")
	private EmperorsAmulet emperorsAmulet;

	@SerializedName("Vasuki")
	private Vasuki vasuki;

	@SerializedName("Inugami")
	private Inugami inugami;

	@SerializedName("Hecatoncheires")
	private Hecatoncheires hecatoncheires;

	@SerializedName("Moloch")
	private Moloch moloch;

	public void setAttis(Attis attis){
		this.attis = attis;
	}

	public Attis getAttis(){
		return attis;
	}

	public void setOrthrus(Orthrus orthrus){
		this.orthrus = orthrus;
	}

	public Orthrus getOrthrus(){
		return orthrus;
	}

	public void setHuaPo(HuaPo huaPo){
		this.huaPo = huaPo;
	}

	public HuaPo getHuaPo(){
		return huaPo;
	}

	public void setTakeMinakata(TakeMinakata takeMinakata){
		this.takeMinakata = takeMinakata;
	}

	public TakeMinakata getTakeMinakata(){
		return takeMinakata;
	}

	public void setEmperorsAmulet(EmperorsAmulet emperorsAmulet){
		this.emperorsAmulet = emperorsAmulet;
	}

	public EmperorsAmulet getEmperorsAmulet(){
		return emperorsAmulet;
	}

	public void setVasuki(Vasuki vasuki){
		this.vasuki = vasuki;
	}

	public Vasuki getVasuki(){
		return vasuki;
	}

	public void setInugami(Inugami inugami){
		this.inugami = inugami;
	}

	public Inugami getInugami(){
		return inugami;
	}

	public void setHecatoncheires(Hecatoncheires hecatoncheires){
		this.hecatoncheires = hecatoncheires;
	}

	public Hecatoncheires getHecatoncheires(){
		return hecatoncheires;
	}

	public void setMoloch(Moloch moloch){
		this.moloch = moloch;
	}

	public Moloch getMoloch(){
		return moloch;
	}
}