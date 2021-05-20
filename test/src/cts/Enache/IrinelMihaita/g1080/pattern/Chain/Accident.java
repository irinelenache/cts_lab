package cts.Enache.IrinelMihaita.g1080.pattern.Chain;

enum NivelAccident{
	PRESUPUNERE,
	REALITATE,
	USOARA,
	MEDIE,
	GRAVA
}
public class Accident {

	public NivelAccident nivelAccident;
	public Accident(NivelAccident nivelAccident) {
		this.nivelAccident = nivelAccident;
	}
	
	public NivelAccident getNivelAccident() {
		return nivelAccident;
	}
	
	
}
