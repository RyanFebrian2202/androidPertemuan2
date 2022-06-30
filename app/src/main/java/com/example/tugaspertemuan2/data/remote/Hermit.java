package com.example.tugaspertemuan2.data.remote;

import com.google.gson.annotations.SerializedName;

public class Hermit{

	@SerializedName("Kurama Tengu")
	private KuramaTengu kuramaTengu;

	@SerializedName("Sudama")
	private Sudama sudama;

	@SerializedName("Ongyo-Ki")
	private OngyoKi ongyoKi;

	@SerializedName("Koumokuten")
	private Koumokuten koumokuten;

	@SerializedName("Koropokkuru")
	private Koropokkuru koropokkuru;

	@SerializedName("Arahabaki")
	private Arahabaki arahabaki;

	@SerializedName("Naga")
	private Naga naga;

	@SerializedName("Bicorn")
	private Bicorn bicorn;

	@SerializedName("Ippon-Datara")
	private IpponDatara ipponDatara;

	@SerializedName("Kumbhanda")
	private Kumbhanda kumbhanda;

	public void setKuramaTengu(KuramaTengu kuramaTengu){
		this.kuramaTengu = kuramaTengu;
	}

	public KuramaTengu getKuramaTengu(){
		return kuramaTengu;
	}

	public void setSudama(Sudama sudama){
		this.sudama = sudama;
	}

	public Sudama getSudama(){
		return sudama;
	}

	public void setOngyoKi(OngyoKi ongyoKi){
		this.ongyoKi = ongyoKi;
	}

	public OngyoKi getOngyoKi(){
		return ongyoKi;
	}

	public void setKoumokuten(Koumokuten koumokuten){
		this.koumokuten = koumokuten;
	}

	public Koumokuten getKoumokuten(){
		return koumokuten;
	}

	public void setKoropokkuru(Koropokkuru koropokkuru){
		this.koropokkuru = koropokkuru;
	}

	public Koropokkuru getKoropokkuru(){
		return koropokkuru;
	}

	public void setArahabaki(Arahabaki arahabaki){
		this.arahabaki = arahabaki;
	}

	public Arahabaki getArahabaki(){
		return arahabaki;
	}

	public void setNaga(Naga naga){
		this.naga = naga;
	}

	public Naga getNaga(){
		return naga;
	}

	public void setBicorn(Bicorn bicorn){
		this.bicorn = bicorn;
	}

	public Bicorn getBicorn(){
		return bicorn;
	}

	public void setIpponDatara(IpponDatara ipponDatara){
		this.ipponDatara = ipponDatara;
	}

	public IpponDatara getIpponDatara(){
		return ipponDatara;
	}

	public void setKumbhanda(Kumbhanda kumbhanda){
		this.kumbhanda = kumbhanda;
	}

	public Kumbhanda getKumbhanda(){
		return kumbhanda;
	}
}