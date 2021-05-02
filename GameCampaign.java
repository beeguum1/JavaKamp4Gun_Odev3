package gameDemo;

public class GameCampaign {
	private int id;
	private String campaignName;
	private double lastPrice;
	private String detail;
	Game gamePrice;
	


	public GameCampaign() {
	
	}



	public GameCampaign(int id, String campaignName, double lastPrice, double gamePrice, String detail) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.lastPrice = lastPrice;
		this.detail = detail;
		
	}





	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCampaignName() {
		return campaignName;
	}


	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}


	public double getLastPrice() {
		
		 lastPrice= Game.gamePrice - (Game.gamePrice/2);
		 return lastPrice;
	}



	public String getDetail() {
		return detail;
	}



	public void setDetail(String detail) {
		this.detail = detail;
	}




	
	
	
	
	
	
	
	
}
