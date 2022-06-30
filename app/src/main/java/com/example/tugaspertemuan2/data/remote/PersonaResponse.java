package com.example.tugaspertemuan2.data.remote;

import com.google.gson.annotations.SerializedName;

public class PersonaResponse{

	@SerializedName("persona")
	private Persona persona;

	public void setPersona(Persona persona){
		this.persona = persona;
	}

	public Persona getPersona(){
		return persona;
	}
}