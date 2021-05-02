package gameDemo;

public class Main {

	public static void main(String[] args) {
		Player player1=new Player();
		player1.setNationalId("12345678910");
		player1.setYearOfBirth("1999");
		player1.setFirstName("Begüm");
		player1.setLastName("Güven");
		
		Player player2=new Player();
		player2.setNationalId("12345");
		player2.setYearOfBirth("1999");
		player2.setFirstName("Ceyda");
		player2.setLastName("Özcan");
		
		Game game1= new Game();
		game1.setId(1);
		game1.setGameName("League of Legends");
		game1.setGamePrice(120);
		
		Game game2= new Game();
		game2.setId(2);
		game2.setGameName("Valorant");
		game2.setGamePrice(100);
		
		Game game3= new Game();
		game3.setId(3);
		game3.setGameName("SIMS");
		game3.setGamePrice(540);
		
		GameCampaign gameCampaign1 = new GameCampaign();
		gameCampaign1.setId(1);
		gameCampaign1.setCampaignName("Never stop playing");
		gameCampaign1.setDetail("Bu kampanya %50 indirim saðlar!");
		
		
		
		
		PlayerManager playerManager=new PlayerManager(new VerificationManager());
		playerManager.signUp(player1);
		playerManager.update(player1);
		System.out.println("********************************************************");
		
		playerManager.signUp(player2);
		System.out.println("********************************************************");
		
		GameCampaignManager gameCampaignManager=new GameCampaignManager();
		gameCampaignManager.add(gameCampaign1);
		gameCampaignManager.update(gameCampaign1);
		System.out.println("********************************************************");
		
		GameSaleManager gameSaleManager= new GameSaleManager();
		gameSaleManager.sell(player1, gameCampaign1, game3);
		
		
		
		
	}

}
