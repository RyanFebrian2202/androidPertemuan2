package com.example.tugaspertemuan2.data.remote;

import com.google.gson.annotations.SerializedName;

public class Magician{

	@SerializedName("Jack Frost")
	private JackFrost jackFrost;

	@SerializedName("Rangda")
	private Rangda rangda;

	@SerializedName("Surt")
	private Surt surt;

	@SerializedName("Queen Mab")
	private QueenMab queenMab;

	@SerializedName("Futsunushi")
	private Futsunushi futsunushi;

	@SerializedName("Nekomata")
	private Nekomata nekomata;

	@SerializedName("Jack-o'-Lantern")
	private JackOLantern jackOLantern;

	@SerializedName("Choronzon")
	private Choronzon choronzon;

	@SerializedName("Sandman")
	private Sandman sandman;

	public void setJackFrost(JackFrost jackFrost){
		this.jackFrost = jackFrost;
	}

	public JackFrost getJackFrost(){
		return jackFrost;
	}

	public void setRangda(Rangda rangda){
		this.rangda = rangda;
	}

	public Rangda getRangda(){
		return rangda;
	}

	public void setSurt(Surt surt){
		this.surt = surt;
	}

	public Surt getSurt(){
		return surt;
	}

	public void setQueenMab(QueenMab queenMab){
		this.queenMab = queenMab;
	}

	public QueenMab getQueenMab(){
		return queenMab;
	}

	public void setFutsunushi(Futsunushi futsunushi){
		this.futsunushi = futsunushi;
	}

	public Futsunushi getFutsunushi(){
		return futsunushi;
	}

	public void setNekomata(Nekomata nekomata){
		this.nekomata = nekomata;
	}

	public Nekomata getNekomata(){
		return nekomata;
	}

	public void setJackOLantern(JackOLantern jackOLantern){
		this.jackOLantern = jackOLantern;
	}

	public JackOLantern getJackOLantern(){
		return jackOLantern;
	}

	public void setChoronzon(Choronzon choronzon){
		this.choronzon = choronzon;
	}

	public Choronzon getChoronzon(){
		return choronzon;
	}

	public void setSandman(Sandman sandman){
		this.sandman = sandman;
	}

	public Sandman getSandman(){
		return sandman;
	}
}