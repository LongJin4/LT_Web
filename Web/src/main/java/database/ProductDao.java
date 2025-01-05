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
		String sqlimgage = "SELECT * FROM product p join product_image pi on p.id=pi.product_id where p.id = ?";
		try {
			connect = DatabaseConnection.getConnection();
			Statement statment = connect.createStatement();
			ResultSet rs = statment.executeQuery(sql);
			while (rs.next()) {
				Product product = new Product(rs.getString("id"), rs.getString("name"), rs.getString("detail"),
						rs.getDouble("cost"));

//				thêm danh sách ảnh
				PreparedStatement pre = connect.prepareStatement(sqlimgage);
				pre.setString(1, rs.getString("id"));
				ResultSet rsimg = pre.executeQuery();
				while (rsimg.next()) {
					product.getListimg().add(rsimg.getString("image"));
				}
				res.add(product);
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
		String sql = "SELECT *" + "FROM product p "
				+ "LEFT JOIN product_detail pd ON p.id = pd.product_id where p.id= ?";
		String imageSql = "SELECT * FROM product_image where product_id = ?";
		Product res = null;
		try {
			connect = DatabaseConnection.getConnection();
			PreparedStatement prs = connect.prepareStatement(sql);
			prs.setString(1, id);
			ResultSet rs = prs.executeQuery();
			if (rs.next()) {
				res = new Product(id, rs.getString("name"), rs.getString("detail"), rs.getDouble("cost"));
				PreparedStatement preImage = connect.prepareStatement(imageSql);
				preImage.setString(1, id);
				ResultSet rsImage = preImage.executeQuery();
				while (rsImage.next()) {
					res.getListimg().add(rsImage.getString("image"));
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}

	public List<String> getCategories() {
		Connection connect;
		List<String> res = new ArrayList<String>();
		String sql = "select * from categories";
		try {
			connect = DatabaseConnection.getConnection();
			Statement st = connect.createStatement();
			ResultSet resultset = st.executeQuery(sql);
			while (resultset.next()) {
				res.add(resultset.getString("category"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}

}