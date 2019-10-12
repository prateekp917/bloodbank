package com.virtusa.bloodbank;

import java.util.List;

public class AdminsService {
	UsersListDAO dao=new UsersListDAOImpl();
	public boolean checkLogin(String username,String password)
	{
		UsersList user=dao.findusername(username);
		if(user==null||user.getPassword().equals(password))
			return false;
		else return true;
	}
	
	public List<UsersList> findAll()
	{
		return dao.findAll();
	}
}
