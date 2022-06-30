package com.example.tugaspertemuan2.data.remote;

import com.google.gson.annotations.SerializedName;

public class Death{

	@SerializedName("Matador")
	private Matador matador;

	@SerializedName("Pale Rider")
	private PaleRider paleRider;

	@SerializedName("Mandrake")
	private Mandrake mandrake;

	@SerializedName("Mokoi")
	private Mokoi mokoi;

	@SerializedName("Mot")
	private Mot mot;

	@SerializedName("Chernobog")
	private Chernobog chernobog;

	@SerializedName("Pisaca")
	private Pisaca pisaca;

	@SerializedName("Hope Diamond")
	private HopeDiamond hopeDiamond;

	@SerializedName("Alice")
	private Alice alice;

	@SerializedName("Hell Biker")
	private HellBiker hellBiker;

	public void setMatador(Matador matador){
		this.matador = matador;
	}

	public Matador getMatador(){
		return matador;
	}

	public void setPaleRider(PaleRider paleRider){
		this.paleRider = paleRider;
	}

	public PaleRider getPaleRider(){
		return paleRider;
	}

	public void setMandrake(Mandrake mandrake){
		this.mandrake = mandrake;
	}

	public Mandrake getMandrake(){
		return mandrake;
	}

	public void setMokoi(Mokoi mokoi){
		this.mokoi = mokoi;
	}

	public Mokoi getMokoi(){
		return mokoi;
	}

	public void setMot(Mot mot){
		this.mot = mot;
	}

	public Mot getMot(){
		return mot;
	}

	public void setChernobog(Chernobog chernobog){
		this.chernobog = chernobog;
	}

	public Chernobog getChernobog(){
		return chernobog;
	}

	public void setPisaca(Pisaca pisaca){
		this.pisaca = pisaca;
	}

	public Pisaca getPisaca(){
		return pisaca;
	}

	public void setHopeDiamond(HopeDiamond hopeDiamond){
		this.hopeDiamond = hopeDiamond;
	}

	public HopeDiamond getHopeDiamond(){
		return hopeDiamond;
	}

	public void setAlice(Alice alice){
		this.alice = alice;
	}

	public Alice getAlice(){
		return alice;
	}

	public void setHellBiker(HellBiker hellBiker){
		this.hellBiker = hellBiker;
	}

	public HellBiker getHellBiker(){
		return hellBiker;
	}
}