package com.example.tugaspertemuan2.data.remote;

import com.google.gson.annotations.SerializedName;

public class Devil{

	@SerializedName("Flauros")
	private Flauros flauros;

	@SerializedName("Baphomet")
	private Baphomet baphomet;

	@SerializedName("Lilim")
	private Lilim lilim;

	@SerializedName("Pazuzu")
	private Pazuzu pazuzu;

	@SerializedName("Andras")
	private Andras andras;

	@SerializedName("Beelzebub")
	private Beelzebub beelzebub;

	@SerializedName("Belial")
	private Belial belial;

	@SerializedName("Incubus")
	private Incubus incubus;

	@SerializedName("Nebiros")
	private Nebiros nebiros;

	public void setFlauros(Flauros flauros){
		this.flauros = flauros;
	}

	public Flauros getFlauros(){
		return flauros;
	}

	public void setBaphomet(Baphomet baphomet){
		this.baphomet = baphomet;
	}

	public Baphomet getBaphomet(){
		return baphomet;
	}

	public void setLilim(Lilim lilim){
		this.lilim = lilim;
	}

	public Lilim getLilim(){
		return lilim;
	}

	public void setPazuzu(Pazuzu pazuzu){
		this.pazuzu = pazuzu;
	}

	public Pazuzu getPazuzu(){
		return pazuzu;
	}

	public void setAndras(Andras andras){
		this.andras = andras;
	}

	public Andras getAndras(){
		return andras;
	}

	public void setBeelzebub(Beelzebub beelzebub){
		this.beelzebub = beelzebub;
	}

	public Beelzebub getBeelzebub(){
		return beelzebub;
	}

	public void setBelial(Belial belial){
		this.belial = belial;
	}

	public Belial getBelial(){
		return belial;
	}

	public void setIncubus(Incubus incubus){
		this.incubus = incubus;
	}

	public Incubus getIncubus(){
		return incubus;
	}

	public void setNebiros(Nebiros nebiros){
		this.nebiros = nebiros;
	}

	public Nebiros getNebiros(){
		return nebiros;
	}
}