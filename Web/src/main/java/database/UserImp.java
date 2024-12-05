package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.User;

public class UserImp implements UserDao {

	@Override
	public List<User> all() {
		Connection conn = null;
		List<User> resultList = new ArrayList<User>();
		try {
//ket noi database
			conn = DatabaseConnection.getConnection();
//tao statement
			Statement stmt = conn.createStatement();
//ResulSet Lấy kq trả về
			ResultSet result = stmt.executeQuery("SELECT * FROM USERS;");
			while (result.next()) {
				String name = result.getString("USERNAME");
				String pass = result.getString("PASSWORD");
				resultList.add(new User(name,pass));
			}
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return resultList;
	}

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void uddate(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public User findById(User user) {
	    Connection conn = null;
	    User userTemp = null;
	    try {
	        conn = DatabaseConnection.getConnection();
	        String sql = "SELECT * FROM USERS WHERE USERNAME = ? AND PASSWORD = ?";
	        PreparedStatement pstmt = conn.prepareStatement(sql);
	        pstmt.setString(1, user.getEmail());
	        pstmt.setString(2, user.getPassword());
	        ResultSet result = pstmt.executeQuery();
	        
	        if (result.next()) {
	            String name = result.getString("USERNAME");
	            String pass = result.getString("PASSWORD");
	            userTemp = new User(name, pass);
	        }
	        pstmt.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return null;
	    } finally {
	        try {
	            if (conn != null) conn.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    return userTemp;
	}
}
