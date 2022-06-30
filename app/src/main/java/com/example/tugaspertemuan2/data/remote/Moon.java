package com.example.tugaspertemuan2.data.remote;

import com.google.gson.annotations.SerializedName;

public class Moon{

	@SerializedName("Onmoraki")
	private Onmoraki onmoraki;

	@SerializedName("Lilith")
	private Lilith lilith;

	@SerializedName("Sui-Ki")
	private SuiKi suiKi;

	@SerializedName("Mothman")
	private Mothman mothman;

	@SerializedName("Succubus")
	private Succubus succubus;

	@SerializedName("Black Ooze")
	private BlackOoze blackOoze;

	@SerializedName("Sandalphon")
	private Sandalphon sandalphon;

	@SerializedName("Girimehkala")
	private Girimehkala girimehkala;

	@SerializedName("Nue")
	private Nue nue;

	public void setOnmoraki(Onmoraki onmoraki){
		this.onmoraki = onmoraki;
	}

	public Onmoraki getOnmoraki(){
		return onmoraki;
	}

	public void setLilith(Lilith lilith){
		this.lilith = lilith;
	}

	public Lilith getLilith(){
		return lilith;
	}

	public void setSuiKi(SuiKi suiKi){
		this.suiKi = suiKi;
	}

	public SuiKi getSuiKi(){
		return suiKi;
	}

	public void setMothman(Mothman mothman){
		this.mothman = mothman;
	}

	public Mothman getMothman(){
		return mothman;
	}

	public void setSuccubus(Succubus succubus){
		this.succubus = succubus;
	}

	public Succubus getSuccubus(){
		return succubus;
	}

	public void setBlackOoze(BlackOoze blackOoze){
		this.blackOoze = blackOoze;
	}

	public BlackOoze getBlackOoze(){
		return blackOoze;
	}

	public void setSandalphon(Sandalphon sandalphon){
		this.sandalphon = sandalphon;
	}

	public Sandalphon getSandalphon(){
		return sandalphon;
	}

	public void setGirimehkala(Girimehkala girimehkala){
		this.girimehkala = girimehkala;
	}

	public Girimehkala getGirimehkala(){
		return girimehkala;
	}

	public void setNue(Nue nue){
		this.nue = nue;
	}

	public Nue getNue(){
		return nue;
	}
}