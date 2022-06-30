package com.example.tugaspertemuan2.data.remote;

import com.google.gson.annotations.SerializedName;

public class Priestess{

	@SerializedName("Apsaras")
	private Apsaras apsaras;

	@SerializedName("Scathach")
	private Scathach scathach;

	@SerializedName("Kikuri-Hime")
	private KikuriHime kikuriHime;

	@SerializedName("Isis")
	private Isis isis;

	@SerializedName("Silky")
	private Silky silky;

	@SerializedName("Cybele")
	private Cybele cybele;

	@SerializedName("Sarasvati")
	private Sarasvati sarasvati;

	@SerializedName("Skadi")
	private Skadi skadi;

	@SerializedName("Koh-i-Noor")
	private KohINoor kohINoor;

	public void setApsaras(Apsaras apsaras){
		this.apsaras = apsaras;
	}

	public Apsaras getApsaras(){
		return apsaras;
	}

	public void setScathach(Scathach scathach){
		this.scathach = scathach;
	}

	public Scathach getScathach(){
		return scathach;
	}

	public void setKikuriHime(KikuriHime kikuriHime){
		this.kikuriHime = kikuriHime;
	}

	public KikuriHime getKikuriHime(){
		return kikuriHime;
	}

	public void setIsis(Isis isis){
		this.isis = isis;
	}

	public Isis getIsis(){
		return isis;
	}

	public void setSilky(Silky silky){
		this.silky = silky;
	}

	public Silky getSilky(){
		return silky;
	}

	public void setCybele(Cybele cybele){
		this.cybele = cybele;
	}

	public Cybele getCybele(){
		return cybele;
	}

	public void setSarasvati(Sarasvati sarasvati){
		this.sarasvati = sarasvati;
	}

	public Sarasvati getSarasvati(){
		return sarasvati;
	}

	public void setSkadi(Skadi skadi){
		this.skadi = skadi;
	}

	public Skadi getSkadi(){
		return skadi;
	}

	public void setKohINoor(KohINoor kohINoor){
		this.kohINoor = kohINoor;
	}

	public KohINoor getKohINoor(){
		return kohINoor;
	}
}