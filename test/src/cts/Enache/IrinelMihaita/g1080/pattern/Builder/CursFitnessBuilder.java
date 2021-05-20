package cts.Enache.IrinelMihaita.g1080.pattern.Builder;

public class CursFitnessBuilder implements AbstractBuilder{

	private CursFitness cursFitness;
	
	public CursFitnessBuilder(){
		super();
		this.cursFitness = new CursFitness(0, 0, null, 0, 0, "", "", "", "");
	}
	
	public CursFitnessBuilder(int id) {
		this.cursFitness = new CursFitness(id, 0, null, 0, 0, "", "", "", "");
	}
	
	public CursFitnessBuilder setId(int id) {
		cursFitness.setId(id);
		return this;
	}
	public CursFitnessBuilder setDurata(int durata) {
		cursFitness.setDurata(durata);
		return this;
	}

	public CursFitnessBuilder setNivelDificultate(NivelDificultate nivelDificultate) {
		cursFitness.setNivelDificultate(nivelDificultate);
		return this;
	}

	public CursFitnessBuilder setNrMaximParticipanti(int nrMaximParticipanti) {
		cursFitness.setNrMaximParticipanti(nrMaximParticipanti);
		return this;
	}

	public CursFitnessBuilder setPret(int pret) {
		cursFitness.setPret(pret);
		return this;
	}

	public CursFitnessBuilder setExercitiu1(String exercitiu1) {
		cursFitness.setExercitiu1(exercitiu1);
		return this;
	}

	public CursFitnessBuilder setExercitiu2(String exercitiu2) {
		cursFitness.setExercitiu2(exercitiu2);		
		return this;
	}

	public CursFitnessBuilder setExercitiu3(String exercitiu3) {
		cursFitness.setExercitiu3(exercitiu3);
		return this;
	}

	public CursFitnessBuilder setExercitiu4(String exercitiu4) {
		cursFitness.setExercitiu4(exercitiu4);
		return this;
	}

	
	@Override
	public CursFitness build() {
		// TODO Auto-generated method stub
		return this.cursFitness;
	}

}
