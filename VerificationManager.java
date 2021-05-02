package gameDemo;

public class VerificationManager implements Verification {

	@Override
	public boolean checkPlayer(Player player) {
		if (player.getNationalId().length() == 11) {
			System.out.println("Do�rulama ba�ar�l�.");
			return true;
		}
		else 
			System.out.println("Do�rulama ba�ar�s�z.");
			return false;
	}

}
