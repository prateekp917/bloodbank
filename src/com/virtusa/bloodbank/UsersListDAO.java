package com.virtusa.bloodbank;

import java.util.List;

public interface UsersListDAO {
	UsersList findByID(long userid);
	UsersList findusername(String username);
	List<UsersList> findAll();
	//List<UsersList> findAllUsers();
	//UsersList update(UsersList user);
	//UsersList add(UsersList user);
	//boolean delete(UsersList user);
}
