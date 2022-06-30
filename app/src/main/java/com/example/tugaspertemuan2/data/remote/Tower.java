package com.example.tugaspertemuan2.data.remote;

import com.google.gson.annotations.SerializedName;

public class Tower{

	@SerializedName("Seth")
	private Seth seth;

	@SerializedName("Belphegor")
	private Belphegor belphegor;

	@SerializedName("Jatayu")
	private Jatayu jatayu;

	@SerializedName("Mada")
	private Mada mada;

	@SerializedName("Yoshitsune")
	private Yoshitsune yoshitsune;

	@SerializedName("Mara")
	private Mara mara;

	@SerializedName("Black Rider")
	private BlackRider blackRider;

	@SerializedName("Red Rider")
	private RedRider redRider;

	public void setSeth(Seth seth){
		this.seth = seth;
	}

	public Seth getSeth(){
		return seth;
	}

	public void setBelphegor(Belphegor belphegor){
		this.belphegor = belphegor;
	}

	public Belphegor getBelphegor(){
		return belphegor;
	}

	public void setJatayu(Jatayu jatayu){
		this.jatayu = jatayu;
	}

	public Jatayu getJatayu(){
		return jatayu;
	}

	public void setMada(Mada mada){
		this.mada = mada;
	}

	public Mada getMada(){
		return mada;
	}

	public void setYoshitsune(Yoshitsune yoshitsune){
		this.yoshitsune = yoshitsune;
	}

	public Yoshitsune getYoshitsune(){
		return yoshitsune;
	}

	public void setMara(Mara mara){
		this.mara = mara;
	}

	public Mara getMara(){
		return mara;
	}

	public void setBlackRider(BlackRider blackRider){
		this.blackRider = blackRider;
	}

	public BlackRider getBlackRider(){
		return blackRider;
	}

	public void setRedRider(RedRider redRider){
		this.redRider = redRider;
	}

	public RedRider getRedRider(){
		return redRider;
	}
}