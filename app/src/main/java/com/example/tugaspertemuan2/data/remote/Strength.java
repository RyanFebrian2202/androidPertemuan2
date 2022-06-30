package com.example.tugaspertemuan2.data.remote;

import com.google.gson.annotations.SerializedName;

public class Strength{

	@SerializedName("Siegfried")
	private Siegfried siegfried;

	@SerializedName("Valkyrie")
	private Valkyrie valkyrie;

	@SerializedName("Rakshasa")
	private Rakshasa rakshasa;

	@SerializedName("Kelpie")
	private Kelpie kelpie;

	@SerializedName("Zouchouten")
	private Zouchouten zouchouten;

	@SerializedName("Kusi Mitama")
	private KusiMitama kusiMitama;

	@SerializedName("Zaou-Gongen")
	private ZaouGongen zaouGongen;

	@SerializedName("Oni")
	private Oni oni;

	@SerializedName("Orlov")
	private Orlov orlov;

	public void setSiegfried(Siegfried siegfried){
		this.siegfried = siegfried;
	}

	public Siegfried getSiegfried(){
		return siegfried;
	}

	public void setValkyrie(Valkyrie valkyrie){
		this.valkyrie = valkyrie;
	}

	public Valkyrie getValkyrie(){
		return valkyrie;
	}

	public void setRakshasa(Rakshasa rakshasa){
		this.rakshasa = rakshasa;
	}

	public Rakshasa getRakshasa(){
		return rakshasa;
	}

	public void setKelpie(Kelpie kelpie){
		this.kelpie = kelpie;
	}

	public Kelpie getKelpie(){
		return kelpie;
	}

	public void setZouchouten(Zouchouten zouchouten){
		this.zouchouten = zouchouten;
	}

	public Zouchouten getZouchouten(){
		return zouchouten;
	}

	public void setKusiMitama(KusiMitama kusiMitama){
		this.kusiMitama = kusiMitama;
	}

	public KusiMitama getKusiMitama(){
		return kusiMitama;
	}

	public void setZaouGongen(ZaouGongen zaouGongen){
		this.zaouGongen = zaouGongen;
	}

	public ZaouGongen getZaouGongen(){
		return zaouGongen;
	}

	public void setOni(Oni oni){
		this.oni = oni;
	}

	public Oni getOni(){
		return oni;
	}

	public void setOrlov(Orlov orlov){
		this.orlov = orlov;
	}

	public Orlov getOrlov(){
		return orlov;
	}
}