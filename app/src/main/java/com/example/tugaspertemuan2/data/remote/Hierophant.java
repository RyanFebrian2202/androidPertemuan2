package com.example.tugaspertemuan2.data.remote;

import com.google.gson.annotations.SerializedName;

public class Hierophant{

	@SerializedName("Orobas")
	private Orobas orobas;

	@SerializedName("Kohryu")
	private Kohryu kohryu;

	@SerializedName("Unicorn")
	private Unicorn unicorn;

	@SerializedName("Forneus")
	private Forneus forneus;

	@SerializedName("Anzu")
	private Anzu anzu;

	@SerializedName("Phoenix")
	private Phoenix phoenix;

	@SerializedName("Berith")
	private Berith berith;

	@SerializedName("Bishamonten")
	private Bishamonten bishamonten;

	@SerializedName("Daisoujou")
	private Daisoujou daisoujou;

	public void setOrobas(Orobas orobas){
		this.orobas = orobas;
	}

	public Orobas getOrobas(){
		return orobas;
	}

	public void setKohryu(Kohryu kohryu){
		this.kohryu = kohryu;
	}

	public Kohryu getKohryu(){
		return kohryu;
	}

	public void setUnicorn(Unicorn unicorn){
		this.unicorn = unicorn;
	}

	public Unicorn getUnicorn(){
		return unicorn;
	}

	public void setForneus(Forneus forneus){
		this.forneus = forneus;
	}

	public Forneus getForneus(){
		return forneus;
	}

	public void setAnzu(Anzu anzu){
		this.anzu = anzu;
	}

	public Anzu getAnzu(){
		return anzu;
	}

	public void setPhoenix(Phoenix phoenix){
		this.phoenix = phoenix;
	}

	public Phoenix getPhoenix(){
		return phoenix;
	}

	public void setBerith(Berith berith){
		this.berith = berith;
	}

	public Berith getBerith(){
		return berith;
	}

	public void setBishamonten(Bishamonten bishamonten){
		this.bishamonten = bishamonten;
	}

	public Bishamonten getBishamonten(){
		return bishamonten;
	}

	public void setDaisoujou(Daisoujou daisoujou){
		this.daisoujou = daisoujou;
	}

	public Daisoujou getDaisoujou(){
		return daisoujou;
	}
}