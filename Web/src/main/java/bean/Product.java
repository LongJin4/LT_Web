package bean;

import java.util.ArrayList;
import java.util.List;

public class Product {
	String id;
	String name;
	ArrayList<String> listimg;
	String detail;
	double cost;
	String category;

	public Product(String id, String name, String detail, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.detail = detail;
		this.cost = cost;
		listimg = new ArrayList();
	}
	public String getFirstImage() {
		return listimg.get(0);
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

	public ArrayList<String> getListimg() {
		return listimg;
	}

	public void setListimg(ArrayList<String> listimg) {
		this.listimg = listimg;
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
