package com.example.tugaspertemuan2.data.remote;

import com.google.gson.annotations.SerializedName;

public class Chariot{

	@SerializedName("Thor")
	private Thor thor;

	@SerializedName("Chi You")
	private ChiYou chiYou;

	@SerializedName("Ara Mitama")
	private AraMitama araMitama;

	@SerializedName("Shiisaa")
	private Shiisaa shiisaa;

	@SerializedName("Cerberus")
	private Cerberus cerberus;

	@SerializedName("Slime")
	private Slime slime;

	@SerializedName("White Rider")
	private WhiteRider whiteRider;

	@SerializedName("Kin-Ki")
	private KinKi kinKi;

	@SerializedName("Agathion")
	private Agathion agathion;

	@SerializedName("Shiki-Ouji")
	private ShikiOuji shikiOuji;

	public void setThor(Thor thor){
		this.thor = thor;
	}

	public Thor getThor(){
		return thor;
	}

	public void setChiYou(ChiYou chiYou){
		this.chiYou = chiYou;
	}

	public ChiYou getChiYou(){
		return chiYou;
	}

	public void setAraMitama(AraMitama araMitama){
		this.araMitama = araMitama;
	}

	public AraMitama getAraMitama(){
		return araMitama;
	}

	public void setShiisaa(Shiisaa shiisaa){
		this.shiisaa = shiisaa;
	}

	public Shiisaa getShiisaa(){
		return shiisaa;
	}

	public void setCerberus(Cerberus cerberus){
		this.cerberus = cerberus;
	}

	public Cerberus getCerberus(){
		return cerberus;
	}

	public void setSlime(Slime slime){
		this.slime = slime;
	}

	public Slime getSlime(){
		return slime;
	}

	public void setWhiteRider(WhiteRider whiteRider){
		this.whiteRider = whiteRider;
	}

	public WhiteRider getWhiteRider(){
		return whiteRider;
	}

	public void setKinKi(KinKi kinKi){
		this.kinKi = kinKi;
	}

	public KinKi getKinKi(){
		return kinKi;
	}

	public void setAgathion(Agathion agathion){
		this.agathion = agathion;
	}

	public Agathion getAgathion(){
		return agathion;
	}

	public void setShikiOuji(ShikiOuji shikiOuji){
		this.shikiOuji = shikiOuji;
	}

	public ShikiOuji getShikiOuji(){
		return shikiOuji;
	}
}