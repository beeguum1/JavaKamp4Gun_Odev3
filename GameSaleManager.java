package gameDemo;

public class GameSaleManager implements GameService {

	@Override
	public void sell(Player player, GameCampaign gameCampaign, Game game) {
		System.out.println(player.getFirstName()+" "+player.getLastName()+" isimli oyuncu "+ game.getGameName()+ " oyununu "+ gameCampaign.getCampaignName()+" kampanyas� ile " 
				+ Game.gamePrice+" TL yerine "+ gameCampaign.getLastPrice()+" TL'ye sat�n ald�.");
		
	}

}
