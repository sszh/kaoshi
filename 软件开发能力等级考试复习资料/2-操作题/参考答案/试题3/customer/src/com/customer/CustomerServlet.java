package com.customer;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CustomerServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		CustomerBean cb=new CustomerBean();
		List<Customer> list=cb.getCustomers();
		HttpSession session = request.getSession(true);
		session.setAttribute("list", list);
		response.sendRedirect("listCustomer.jsp");
	}

	public void init() throws ServletException {

	}

	public void destroy() {
		
	}
}
