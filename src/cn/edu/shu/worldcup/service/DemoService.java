package cn.edu.shu.worldcup.service;

import cn.edu.shu.worldcup.domain.User;

public interface DemoService {
	int getId(String name);

	void update(User user);
	void delete(User user);
}
