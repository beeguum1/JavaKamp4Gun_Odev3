package gameDemo;

public class GameCampaignManager implements GameCampaignService {

	@Override
	public void add(GameCampaign gameCampaign) {
		System.out.println(gameCampaign.getId()+" numaral� "+ gameCampaign.getCampaignName()+" kampanyas� sisteme eklenmi�tir."+ gameCampaign.getDetail());
		
	}

	@Override
	public void delete(GameCampaign gameCampaign) {
		System.out.println(gameCampaign.getId()+" numaral� "+ gameCampaign.getCampaignName()+" kampanyas� sistemden silinmi�tir."+ gameCampaign.getDetail());
		
	}

	@Override
	public void update(GameCampaign gameCampaign) {
		System.out.println(gameCampaign.getId()+" numaral� "+ gameCampaign.getCampaignName()+" kampanyas� g�ncellenmi�tir."+gameCampaign.getDetail());
		
	}

}
