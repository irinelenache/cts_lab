package cts.Enache.IrinelMihaita.g1080.pattern.Builder;


enum NivelDificultate{
	INCEPATOR,
	MEDIU,
	AVANSAT
}
public class CursFitness {
	private int id;
	private int durata;
	private NivelDificultate nivelDificultate;
	private int nrMaximParticipanti;
	private int pret;
	private String exercitiu1;
	private String exercitiu2;
	private String exercitiu3;
	private String exercitiu4;
	
	public CursFitness(int id, int durata, NivelDificultate nivelDificultate, int nrMaximParticipanti, int pret,
			String exercitiu1, String exercitiu2, String exercitiu3, String exercitiu4) {
		super();
		this.id = id;
		this.durata = durata;
		this.nivelDificultate = nivelDificultate;
		this.nrMaximParticipanti = nrMaximParticipanti;
		this.pret = pret;
		this.exercitiu1 = exercitiu1;
		this.exercitiu2 = exercitiu2;
		this.exercitiu3 = exercitiu3;
		this.exercitiu4 = exercitiu4;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void setDurata(int durata) {
		this.durata = durata;
	}

	public void setNivelDificultate(NivelDificultate nivelDificultate) {
		this.nivelDificultate = nivelDificultate;
	}

	public void setNrMaximParticipanti(int nrMaximParticipanti) {
		this.nrMaximParticipanti = nrMaximParticipanti;
	}

	public void setPret(int pret) {
		this.pret = pret;
	}

	public void setExercitiu1(String exercitiu1) {
		this.exercitiu1 = exercitiu1;
	}

	public void setExercitiu2(String exercitiu2) {
		this.exercitiu2 = exercitiu2;
	}

	public void setExercitiu3(String exercitiu3) {
		this.exercitiu3 = exercitiu3;
	}

	public void setExercitiu4(String exercitiu4) {
		this.exercitiu4 = exercitiu4;
	}

	@Override
	public String toString() {
		return "CursFitness [durata=" + durata + ", nivelDificultate=" + nivelDificultate + ", nrMaximParticipanti="
				+ nrMaximParticipanti + ", pret=" + pret + ", exercitiu1=" + exercitiu1 + ", exercitiu2=" + exercitiu2
				+ ", exercitiu3=" + exercitiu3 + ", exercitiu4=" + exercitiu4 + "]";
	}

	
	
	
}
