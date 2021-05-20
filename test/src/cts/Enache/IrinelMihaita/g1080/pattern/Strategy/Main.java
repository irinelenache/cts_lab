package cts.Enache.IrinelMihaita.g1080.pattern.Strategy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChallengeFlotari challengeFlotari = new ChallengeFlotari();
		Trainer trainer = new Trainer("John Doe", challengeFlotari);
		trainer.incepeExercitiu(100);
		
		ChallengeTractiuni challengeTractiuni = new ChallengeTractiuni();
		trainer.setTipChallenge(challengeTractiuni);
		System.out.println("S-a facut o modificare:");
		trainer.incepeExercitiu(80);
		
	}

}
