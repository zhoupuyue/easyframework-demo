package demo.service;

import demo.entity.User;

public interface UserService {

	public int getUserCount();

	public User getUserById(Long id);

	public void saveUser(User user);

	public void testTransactional(User user);

}
