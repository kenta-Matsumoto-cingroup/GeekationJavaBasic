package objectExercise;

public class Property {

	private String name;
	private String owner;
	private String type;
	private int price;

	public Property(String name, String owner, String type, int price) {
		super();
		this.name = name;
		this.owner = owner;
		this.type = type;
		this.price = price;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void output() {
		System.out.println("物件名：" + this.name);
		System.out.println("物件所有者名：" + this.owner);
		System.out.println("物件種別：" + this.type);
		System.out.println("物件価格：" + this.price + "円");

	}

}
