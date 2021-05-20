package cts.Enache.IrinelMihaita.g1080.pattern.Strategy;

public class Trainer {
	private String nume;
	private IChallenge tipChallenge;
	
	
	public Trainer(String nume, IChallenge tipChallenge) {
		super();
		this.nume = nume;
		this.tipChallenge = tipChallenge;
	}


	public void setTipChallenge(IChallenge tipChallenge) {
		this.tipChallenge = tipChallenge;
	}
	
	public void incepeExercitiu(int nrRepetitii) {
		System.out.println(this.nume + " a stabilit:");
		tipChallenge.startExercitiu(nrRepetitii);
	}
	
}
