package gameDemo;

public class VerificationManager implements Verification {

	@Override
	public boolean checkPlayer(Player player) {
		if (player.getNationalId().length() == 11) {
			System.out.println("Doðrulama baþarýlý.");
			return true;
		}
		else 
			System.out.println("Doðrulama baþarýsýz.");
			return false;
	}

}
