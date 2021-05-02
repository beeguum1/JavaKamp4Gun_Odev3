package gameDemo;

public class PlayerManager implements PlayerService {
	
	private VerificationManager verificationManager;
	
	public PlayerManager(VerificationManager verificationManager) {
		this.verificationManager=verificationManager;
	}

	@Override
	public void signUp(Player player) {
		if(verificationManager.checkPlayer(player)==true) {
			System.out.println("Kayd�n�z tamamland�. HO�GELD�N "+ player.getFirstName()+" "+ player.getLastName()+"!");
		}
		else
			System.out.println("Bilgilerinizi do�ru girdi�inizden emin misiniz "+ player.getFirstName()+" "+ player.getLastName()+ " ?");
		
	}

	@Override
	public void update(Player player) {
		if(verificationManager.checkPlayer(player)==true) {
			System.out.println("Kayd�n�z g�ncellendi "+ player.getFirstName()+" "+ player.getLastName()+"!");
		}
		else
			System.out.println("Kay�t g�ncellenemedi!");
		
	}

	@Override
	public void delete(Player player) {
		if(verificationManager.checkPlayer(player)==true) {
			System.out.println("Kayd�n�z silindi!");
		}
		else
			System.out.println("Kay�t silinemedi!");
		
		
	}
	
	
	
	

	

}
