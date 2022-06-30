package com.example.tugaspertemuan2.data.remote;

import com.google.gson.annotations.SerializedName;

public class Sun{

	@SerializedName("Asura-Ou")
	private AsuraOu asuraOu;

	@SerializedName("Horus")
	private Horus horus;

	@SerializedName("Mithras")
	private Mithras mithras;

	@SerializedName("Ganesha")
	private Ganesha ganesha;

	@SerializedName("Suzaku")
	private Suzaku suzaku;

	@SerializedName("Yatagarasu")
	private Yatagarasu yatagarasu;

	@SerializedName("Quetzalcoatl")
	private Quetzalcoatl quetzalcoatl;

	@SerializedName("Yurlungur")
	private Yurlungur yurlungur;

	public void setAsuraOu(AsuraOu asuraOu){
		this.asuraOu = asuraOu;
	}

	public AsuraOu getAsuraOu(){
		return asuraOu;
	}

	public void setHorus(Horus horus){
		this.horus = horus;
	}

	public Horus getHorus(){
		return horus;
	}

	public void setMithras(Mithras mithras){
		this.mithras = mithras;
	}

	public Mithras getMithras(){
		return mithras;
	}

	public void setGanesha(Ganesha ganesha){
		this.ganesha = ganesha;
	}

	public Ganesha getGanesha(){
		return ganesha;
	}

	public void setSuzaku(Suzaku suzaku){
		this.suzaku = suzaku;
	}

	public Suzaku getSuzaku(){
		return suzaku;
	}

	public void setYatagarasu(Yatagarasu yatagarasu){
		this.yatagarasu = yatagarasu;
	}

	public Yatagarasu getYatagarasu(){
		return yatagarasu;
	}

	public void setQuetzalcoatl(Quetzalcoatl quetzalcoatl){
		this.quetzalcoatl = quetzalcoatl;
	}

	public Quetzalcoatl getQuetzalcoatl(){
		return quetzalcoatl;
	}

	public void setYurlungur(Yurlungur yurlungur){
		this.yurlungur = yurlungur;
	}

	public Yurlungur getYurlungur(){
		return yurlungur;
	}
}