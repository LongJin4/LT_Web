package database;

import java.util.List;

import bean.User;

public interface UserDao {
	public List<User> all();

	public void insert(User user);

	public void uddate(User user);

	public void delete(User user);

	public User findById(User user);
}
