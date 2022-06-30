package com.example.tugaspertemuan2.data.remote;

import com.google.gson.annotations.SerializedName;

public class Temperance{

	@SerializedName("Jikokuten")
	private Jikokuten jikokuten;

	@SerializedName("Byakko")
	private Byakko byakko;

	@SerializedName("Ardha")
	private Ardha ardha;

	@SerializedName("Seiryu")
	private Seiryu seiryu;

	@SerializedName("Raja Naga")
	private RajaNaga rajaNaga;

	@SerializedName("Makami")
	private Makami makami;

	@SerializedName("Koppa Tengu")
	private KoppaTengu koppaTengu;

	@SerializedName("Genbu")
	private Genbu genbu;

	@SerializedName("Gabriel")
	private Gabriel gabriel;

	@SerializedName("Mithra")
	private Mithra mithra;

	@SerializedName("Nigi Mitama")
	private NigiMitama nigiMitama;

	public void setJikokuten(Jikokuten jikokuten){
		this.jikokuten = jikokuten;
	}

	public Jikokuten getJikokuten(){
		return jikokuten;
	}

	public void setByakko(Byakko byakko){
		this.byakko = byakko;
	}

	public Byakko getByakko(){
		return byakko;
	}

	public void setArdha(Ardha ardha){
		this.ardha = ardha;
	}

	public Ardha getArdha(){
		return ardha;
	}

	public void setSeiryu(Seiryu seiryu){
		this.seiryu = seiryu;
	}

	public Seiryu getSeiryu(){
		return seiryu;
	}

	public void setRajaNaga(RajaNaga rajaNaga){
		this.rajaNaga = rajaNaga;
	}

	public RajaNaga getRajaNaga(){
		return rajaNaga;
	}

	public void setMakami(Makami makami){
		this.makami = makami;
	}

	public Makami getMakami(){
		return makami;
	}

	public void setKoppaTengu(KoppaTengu koppaTengu){
		this.koppaTengu = koppaTengu;
	}

	public KoppaTengu getKoppaTengu(){
		return koppaTengu;
	}

	public void setGenbu(Genbu genbu){
		this.genbu = genbu;
	}

	public Genbu getGenbu(){
		return genbu;
	}

	public void setGabriel(Gabriel gabriel){
		this.gabriel = gabriel;
	}

	public Gabriel getGabriel(){
		return gabriel;
	}

	public void setMithra(Mithra mithra){
		this.mithra = mithra;
	}

	public Mithra getMithra(){
		return mithra;
	}

	public void setNigiMitama(NigiMitama nigiMitama){
		this.nigiMitama = nigiMitama;
	}

	public NigiMitama getNigiMitama(){
		return nigiMitama;
	}
}