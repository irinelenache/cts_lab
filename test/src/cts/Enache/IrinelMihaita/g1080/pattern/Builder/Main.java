package cts.Enache.IrinelMihaita.g1080.pattern.Builder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CursFitness curs1 = new CursFitnessBuilder()
				.setId(1)
				.setDurata(30)
				.setExercitiu1("flotari")
				.setExercitiu2("dans")
				.setNrMaximParticipanti(15)
				.build();
		
		CursFitness curs2 = new CursFitnessBuilder()
				.setId(2)
				.setDurata(45)
				.setExercitiu1("tractiuni")
				.setExercitiu2("paralele")
				.setExercitiu3("abdomene")
				.setNrMaximParticipanti(8)
				.build();
		
		CursFitness curs3 = new CursFitnessBuilder()
				.setId(3)
				.setNivelDificultate(NivelDificultate.INCEPATOR)
				.setExercitiu1("incalzire")
				.setExercitiu2("cardio")
				.setNrMaximParticipanti(20)
				.build();
		
		CursFitness curs4 = new CursFitnessBuilder()
				.setId(4)
				.setNivelDificultate(NivelDificultate.AVANSAT)
				.setExercitiu1("incalzire")
				.setExercitiu2("gantere")
				.setExercitiu3("flotari")
				.setExercitiu4("abdomene")
				.setNrMaximParticipanti(6)
				.setPret(50)
				.build();
		
		
		
		System.out.println(curs1.toString());
		System.out.println(curs2.toString());
		System.out.println(curs3.toString());
		System.out.println(curs4.toString());

		
	}

}
