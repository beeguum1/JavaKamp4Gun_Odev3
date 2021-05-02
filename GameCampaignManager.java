package gameDemo;

public class GameCampaignManager implements GameCampaignService {

	@Override
	public void add(GameCampaign gameCampaign) {
		System.out.println(gameCampaign.getId()+" numaralı "+ gameCampaign.getCampaignName()+" kampanyası sisteme eklenmiştir."+ gameCampaign.getDetail());
		
	}

	@Override
	public void delete(GameCampaign gameCampaign) {
		System.out.println(gameCampaign.getId()+" numaralı "+ gameCampaign.getCampaignName()+" kampanyası sistemden silinmiştir."+ gameCampaign.getDetail());
		
	}

	@Override
	public void update(GameCampaign gameCampaign) {
		System.out.println(gameCampaign.getId()+" numaralı "+ gameCampaign.getCampaignName()+" kampanyası güncellenmiştir."+gameCampaign.getDetail());
		
	}

}
