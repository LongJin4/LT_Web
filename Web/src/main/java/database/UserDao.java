package database;

import java.util.List;

import bean.User;

public interface UserDao {
	public List<User> all();

	public int insert(User user);

	public int update(User user);

	public int delete(User user);

	public User findById(User user);
}
