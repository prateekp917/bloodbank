package com.virtusa.bloodbank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ListOfUsersServlet
 */
@WebServlet("/ListOfUsersServlet")
public class ListOfUsersServlet extends HttpServlet {
	AdminsService adminservice =new AdminsService();
	UsersListDAO dao= new UsersListDAOImpl();
	private static final long serialVersionUID = 1L;
	//UsersListDAO dao=new UsersListDAOImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListOfUsersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession(false);
		List<UsersList> list = new ArrayList<>();
		String username=(String) request.getSession().getAttribute("username");
		request.setAttribute("user_id", adminservice.findAll());
		

		//doGet(request, response);
		
	}

}
