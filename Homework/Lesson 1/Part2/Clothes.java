public class Clothes {
				private String fabric;
				private String style;
				private String size;
				private String type;
				private String seasonKind;
				private String forWhom;
				private String color;
				private double price;

	public String getFabric() {
		return fabric;
		}
	public void setFabric(String newFabric) {
		fabric=newFabric;
		}
	public String getStyle() {
		return style;
		}
	public void setStyle(String newStyle) {
		style=newStyle;
		}
	public String getSize() {
		return size;
		}
	public void setSize(String newSize) {
		size=newSize;
		}
	public String getType() {
		return type;
		}
	public void setType(String newType) {
		type=newType;
		}
	public String getSeasonKind() {
		return seasonKind;
		}
	public void setSeasonKind(String newSeasonKind) {
		seasonKind=newSeasonKind;
		}
	public String getForWhom() {
		return forWhom;
		}
	public void setForWhom(String newForWhom) {
		forWhom=newForWhom;
		}
	public String getColor() {
		return color;
		}
	public void setColor(String newColor) {
		color=newColor;}
	public double getPrice() {
		return price;
	}
	public void setPrice(double newPrice) {
		price=newPrice;
	}
	public void wash() {}
	public void dry() {}
	public void wear() {}
	
						//CONSTRUCTOR//
	public Clothes() {    
		fabric="Nylon";
		style="Sport";
		size="S";
		type="T-shirt";
		seasonKind="Summer";
		forWhom="Adult";
		color="Orange";
		price=9.99;
}	

	public static void main(String[] args){
		
		Clothes TShirt=new Clothes();
		
		System.out.println(">>Constructor<<");
		System.out.println(TShirt.fabric);
		System.out.println(TShirt.style);
		System.out.println(TShirt.size);
		System.out.println(TShirt.type);
		System.out.println(TShirt.seasonKind);
		System.out.println(TShirt.forWhom);
		System.out.println(TShirt.color);
		System.out.println(TShirt.price);
		
		}
}
	







