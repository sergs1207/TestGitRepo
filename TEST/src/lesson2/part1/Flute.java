
public class Flute extends MusicInstruments {
			private String typeOfInstrument;
			private String material;
			private String powerSource;
			private int weight;
			private int valve;
			private String logo;
			private double price;
			
	public String getTypeOfInstrument() {
				return typeOfInstrument;
				}
	public void setTypeOfInstrument(String newTypeOfInstrument) {
				typeOfInstrument=newTypeOfInstrument;
				}

	public String getMaterial() {
				return material;
				}
	public void setMaterial(String newMaterial) {
				material=newMaterial;
				}
	
	public String getPowerSource() {
			return powerSource;
		}
	public void setPowerSource(String newPowerSource) {
				powerSource=newPowerSource;
				}
	
	public int getWeight() {
				return weight;
				}
	public void setWeight(int newWeight) {
				weight=newWeight;
				}
		
	public int getValve() {
		return valve;
		}
	public void setValve(int newValve) {
		valve = newValve;
		}	
			
	public String getLogo() {
		return logo;
		}
	public void setLogo(String newLogo) {
		logo = newLogo;
		}
		
	public double getPrice(){
		return price;
	}
	public void setPrice(double newPrice){
		price = newPrice;
	}		
			
	public void makeSound() {}
	public void startPlay() {}	
	
		
	public Flute(){
		typeOfInstrument = "Wind instrument";
		material = "Metal";
		powerSource = "Non-Electric";
		weight = 420;
		valve = 4;
		logo = "Gemeinhardt";
		price = 300.0;
	}
	
	public static void main(String[] args){
		
		Flute Gemeinhardt_2SP = new Flute();
			
			System.out.println("   Gemeinhardt 2SP:");
			System.out.println("Type Of Instrument: "+ Gemeinhardt_2SP.typeOfInstrument);
			System.out.println("Material: "+ Gemeinhardt_2SP.material);
			System.out.println("PowerSource: "+ Gemeinhardt_2SP.powerSource);
			System.out.println("Weight: "+ Gemeinhardt_2SP.weight +"g");
			System.out.println("Valve: "+ Gemeinhardt_2SP.valve);
			System.out.println("Logo: "+ Gemeinhardt_2SP.logo);
			System.out.println("Price: "+ Gemeinhardt_2SP.price +"$");
			
		}
	
}