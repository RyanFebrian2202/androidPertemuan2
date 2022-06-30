package com.example.tugaspertemuan2.data.remote;

import com.google.gson.annotations.SerializedName;

public class Justice{

	@SerializedName("Uriel")
	private Uriel uriel;

	@SerializedName("Angel")
	private Angel angel;

	@SerializedName("Archangel")
	private Archangel archangel;

	@SerializedName("Metatron")
	private Metatron metatron;

	@SerializedName("Melchizedek")
	private Melchizedek melchizedek;

	@SerializedName("Principality")
	private Principality principality;

	@SerializedName("Throne")
	private Throne throne;

	@SerializedName("Dominion")
	private Dominion dominion;

	@SerializedName("Power")
	private Power power;

	public void setUriel(Uriel uriel){
		this.uriel = uriel;
	}

	public Uriel getUriel(){
		return uriel;
	}

	public void setAngel(Angel angel){
		this.angel = angel;
	}

	public Angel getAngel(){
		return angel;
	}

	public void setArchangel(Archangel archangel){
		this.archangel = archangel;
	}

	public Archangel getArchangel(){
		return archangel;
	}

	public void setMetatron(Metatron metatron){
		this.metatron = metatron;
	}

	public Metatron getMetatron(){
		return metatron;
	}

	public void setMelchizedek(Melchizedek melchizedek){
		this.melchizedek = melchizedek;
	}

	public Melchizedek getMelchizedek(){
		return melchizedek;
	}

	public void setPrincipality(Principality principality){
		this.principality = principality;
	}

	public Principality getPrincipality(){
		return principality;
	}

	public void setThrone(Throne throne){
		this.throne = throne;
	}

	public Throne getThrone(){
		return throne;
	}

	public void setDominion(Dominion dominion){
		this.dominion = dominion;
	}

	public Dominion getDominion(){
		return dominion;
	}

	public void setPower(Power power){
		this.power = power;
	}

	public Power getPower(){
		return power;
	}
}