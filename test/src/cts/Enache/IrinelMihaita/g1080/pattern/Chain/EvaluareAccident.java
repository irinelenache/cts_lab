package cts.Enache.IrinelMihaita.g1080.pattern.Chain;

public abstract class EvaluareAccident {
	
	private Accident accident;
	private EvaluareAccident next;
	private boolean esteAccidentare;
	
	public EvaluareAccident(Accident accident) {
		super();
		this.next=null;
		this.accident = accident;
	}

	public EvaluareAccident getNext() {
		return next;
	}

	public void setNext(EvaluareAccident next) {
		this.next = next;
	}
	
	

	
	public Accident getAccident() {
		return accident;
	}

	public abstract void trimiteMaiDeparte();
	
	
}
