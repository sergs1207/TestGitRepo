
public class RPG_game {
			private String form;
			private String type;
			private String activity;
			private String ageLimit;
			private double price;
			
	public String getForm() {
		return form;
		}
	public void setForm(String newForm) {
		form=newForm;
		}
	
	public String getType() {
		return type;
		}
	public void setType(String newType) {
		type=newType;
		}
	
	public String getActivity() {
		return activity;
		}
	public void setActivity(String newActivity) {
		activity=newActivity;
		}
	
	public String getAgeLimit() {
		return ageLimit;
		}
	public void setAgeLimit(String newAgeLimit) {
		ageLimit = newAgeLimit;
		}
	
	public double getPrice(){
		return price;
	}
	public void setPrice(double newPrice){
		price = newPrice;
	}
	
	public void buy() {}
	public void play() {}
	
	
	public RPG_game() {
		form = "Computer game";
		type = "Adult";
		activity = "Not active";
		ageLimit = "Pegi 18+";
		price = 29.99;
	}
	
public static void main(String[] args){
		
	RPG_game Stalker = new RPG_game();
		
		System.out.println("   Stalker:");
		System.out.println("Form: "+ Stalker.form);
		System.out.println("Type: "+ Stalker.type);
		System.out.println("Activity: "+ Stalker.activity);
		System.out.println("Age limit: "+ Stalker.ageLimit);
		System.out.println("Price: "+ Stalker.price +"$");
	}
		
}