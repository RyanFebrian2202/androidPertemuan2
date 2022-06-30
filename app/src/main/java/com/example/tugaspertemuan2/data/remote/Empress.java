package com.example.tugaspertemuan2.data.remote;

import com.google.gson.annotations.SerializedName;

public class Empress{

	@SerializedName("Kali")
	private Kali kali;

	@SerializedName("Queen's Necklace")
	private QueenSNecklace queenSNecklace;

	@SerializedName("Dakini")
	private Dakini dakini;

	@SerializedName("Mother Harlot")
	private MotherHarlot motherHarlot;

	@SerializedName("Titania")
	private Titania titania;

	@SerializedName("Hariti")
	private Hariti hariti;

	@SerializedName("Lamia")
	private Lamia lamia;

	@SerializedName("Yaksini")
	private Yaksini yaksini;

	public void setKali(Kali kali){
		this.kali = kali;
	}

	public Kali getKali(){
		return kali;
	}

	public void setQueenSNecklace(QueenSNecklace queenSNecklace){
		this.queenSNecklace = queenSNecklace;
	}

	public QueenSNecklace getQueenSNecklace(){
		return queenSNecklace;
	}

	public void setDakini(Dakini dakini){
		this.dakini = dakini;
	}

	public Dakini getDakini(){
		return dakini;
	}

	public void setMotherHarlot(MotherHarlot motherHarlot){
		this.motherHarlot = motherHarlot;
	}

	public MotherHarlot getMotherHarlot(){
		return motherHarlot;
	}

	public void setTitania(Titania titania){
		this.titania = titania;
	}

	public Titania getTitania(){
		return titania;
	}

	public void setHariti(Hariti hariti){
		this.hariti = hariti;
	}

	public Hariti getHariti(){
		return hariti;
	}

	public void setLamia(Lamia lamia){
		this.lamia = lamia;
	}

	public Lamia getLamia(){
		return lamia;
	}

	public void setYaksini(Yaksini yaksini){
		this.yaksini = yaksini;
	}

	public Yaksini getYaksini(){
		return yaksini;
	}
}