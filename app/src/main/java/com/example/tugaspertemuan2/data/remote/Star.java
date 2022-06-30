package com.example.tugaspertemuan2.data.remote;

import com.google.gson.annotations.SerializedName;

public class Star{

	@SerializedName("Lucifer")
	private Lucifer lucifer;

	@SerializedName("Hanuman")
	private Hanuman hanuman;

	@SerializedName("Ananta")
	private Ananta ananta;

	@SerializedName("Kaiwan")
	private Kaiwan kaiwan;

	@SerializedName("Kodama")
	private Kodama kodama;

	@SerializedName("Cu Chulainn")
	private CuChulainn cuChulainn;

	@SerializedName("Sraosha")
	private Sraosha sraosha;

	@SerializedName("Neko Shogun")
	private NekoShogun nekoShogun;

	@SerializedName("Fuu-Ki")
	private FuuKi fuuKi;

	@SerializedName("Garuda")
	private Garuda garuda;

	public void setLucifer(Lucifer lucifer){
		this.lucifer = lucifer;
	}

	public Lucifer getLucifer(){
		return lucifer;
	}

	public void setHanuman(Hanuman hanuman){
		this.hanuman = hanuman;
	}

	public Hanuman getHanuman(){
		return hanuman;
	}

	public void setAnanta(Ananta ananta){
		this.ananta = ananta;
	}

	public Ananta getAnanta(){
		return ananta;
	}

	public void setKaiwan(Kaiwan kaiwan){
		this.kaiwan = kaiwan;
	}

	public Kaiwan getKaiwan(){
		return kaiwan;
	}

	public void setKodama(Kodama kodama){
		this.kodama = kodama;
	}

	public Kodama getKodama(){
		return kodama;
	}

	public void setCuChulainn(CuChulainn cuChulainn){
		this.cuChulainn = cuChulainn;
	}

	public CuChulainn getCuChulainn(){
		return cuChulainn;
	}

	public void setSraosha(Sraosha sraosha){
		this.sraosha = sraosha;
	}

	public Sraosha getSraosha(){
		return sraosha;
	}

	public void setNekoShogun(NekoShogun nekoShogun){
		this.nekoShogun = nekoShogun;
	}

	public NekoShogun getNekoShogun(){
		return nekoShogun;
	}

	public void setFuuKi(FuuKi fuuKi){
		this.fuuKi = fuuKi;
	}

	public FuuKi getFuuKi(){
		return fuuKi;
	}

	public void setGaruda(Garuda garuda){
		this.garuda = garuda;
	}

	public Garuda getGaruda(){
		return garuda;
	}
}