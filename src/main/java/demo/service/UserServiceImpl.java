package demo.service;

import javax.annotation.Resource;

import org.easyframework.persistence.dao.EasyDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import demo.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private EasyDao baseDao;

	public int getUserCount() {
		return baseDao.queryForObject("test.getUserCount", Integer.class);
	}

	public User getUserById(Long id) {
		return baseDao.queryForObject("test.queryUserById", User.class, id);
	}

	public void saveUser(User user) {
		baseDao.insert("test.saveUser", user);
	}

	@Transactional
	public void testTransactional(User user) {
		baseDao.insert("test.saveUser", user);
		int i = 1;
		if (i == 1) {
			throw new RuntimeException("test transactional ");
		}
	}

}
