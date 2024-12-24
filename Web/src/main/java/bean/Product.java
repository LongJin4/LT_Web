package bean;

import java.util.List;

public class Product {
	String id;
	String name;
	String img;
	String detail;
	double cost;

	public Product(String id, String name, String img, String detail, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.img = img;
		this.detail = detail;
		this.cost = cost;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

}
