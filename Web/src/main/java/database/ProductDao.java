package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.Product;
import bean.User;

public class ProductDao implements IProductDao {

	@Override
	public List<Product> all() {
		Connection connect;
		List<Product> res = new ArrayList<Product>();
		String sql = "SELECT * FROM product p join product_detail pd on p.id=pd.product_id";
		try {
			connect = DatabaseConnection.getConnection();
			Statement statment = connect.createStatement();
			ResultSet rs = statment.executeQuery(sql);
			while (rs.next()) {
				res.add(new Product(rs.getString("id"), rs.getString("name"), rs.getString("image_link"),
						rs.getString("detail"), rs.getDouble("cost")));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int insert(Product product) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Product product) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Product product) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Product findById(String id) {
		// TODO Auto-generated method stub
		Connection connect;
		String sql = "SELECT p.id, p.name, p.cost, p.image_link, pd.listImg, pd.detail " + "FROM product "
				+ "LEFT JOIN product_detail pd ON p.id = pd.product_id where if= ?";
		Product res = null;
		try {
			connect = DatabaseConnection.getConnection();
			PreparedStatement prs = connect.prepareStatement(sql);
			prs.setString(1, id);
			ResultSet rs = prs.executeQuery();
			if (rs.next())
				res = new Product(id, rs.getString("name"), rs.getString("image_link"), rs.getString("detail"),
						rs.getDouble("cost"));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}

}
