package com.example.tugaspertemuan2.data.remote;

import com.google.gson.annotations.SerializedName;

public class Lovers{

	@SerializedName("Ishtar")
	private Ishtar ishtar;

	@SerializedName("Kushinada-Hime")
	private KushinadaHime kushinadaHime;

	@SerializedName("Raphael")
	private Raphael raphael;

	@SerializedName("Pixie")
	private Pixie pixie;

	@SerializedName("Ame--Uzume")
	private AmeUzume ameUzume;

	@SerializedName("Parvati")
	private Parvati parvati;

	@SerializedName("Saki Mitama")
	private SakiMitama sakiMitama;

	@SerializedName("Narcissus")
	private Narcissus narcissus;

	@SerializedName("Leanan Sidhe")
	private LeananSidhe leananSidhe;

	public void setIshtar(Ishtar ishtar){
		this.ishtar = ishtar;
	}

	public Ishtar getIshtar(){
		return ishtar;
	}

	public void setKushinadaHime(KushinadaHime kushinadaHime){
		this.kushinadaHime = kushinadaHime;
	}

	public KushinadaHime getKushinadaHime(){
		return kushinadaHime;
	}

	public void setRaphael(Raphael raphael){
		this.raphael = raphael;
	}

	public Raphael getRaphael(){
		return raphael;
	}

	public void setPixie(Pixie pixie){
		this.pixie = pixie;
	}

	public Pixie getPixie(){
		return pixie;
	}

	public void setAmeUzume(AmeUzume ameUzume){
		this.ameUzume = ameUzume;
	}

	public AmeUzume getAmeUzume(){
		return ameUzume;
	}

	public void setParvati(Parvati parvati){
		this.parvati = parvati;
	}

	public Parvati getParvati(){
		return parvati;
	}

	public void setSakiMitama(SakiMitama sakiMitama){
		this.sakiMitama = sakiMitama;
	}

	public SakiMitama getSakiMitama(){
		return sakiMitama;
	}

	public void setNarcissus(Narcissus narcissus){
		this.narcissus = narcissus;
	}

	public Narcissus getNarcissus(){
		return narcissus;
	}

	public void setLeananSidhe(LeananSidhe leananSidhe){
		this.leananSidhe = leananSidhe;
	}

	public LeananSidhe getLeananSidhe(){
		return leananSidhe;
	}
}