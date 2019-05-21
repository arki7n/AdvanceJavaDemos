package com.cdac.customermvc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdac.customermvc.model.Customer;

/**
 * Servlet implementation class CustomerController
 */
@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerController() {
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
	//step 1:fetch req param
	//step 2: create customer object and store req param in it.
		//customer.setFirstName(request.getparameter("firstName"));
		//step 3:call service to add the customer
		/*step 4: once the customer added now add it to the requestScope
		and forward to the jsp page to show the added customer record
		doGet(request,response)
		setAttribute(String name,object customerobject)
		reuest.setAttribute("customer",customer);
		
				*/
		
	Customer obj = new Customer(request.getParameter("firstName"),request.getParameter("lastName"),request.getParameter("mobileNo"),request.getParameter("email"));
	RequestDispatcher rd = null;
	request.setAttribute("customer",obj);
	if(obj!=null) {
	 rd= request.getRequestDispatcher("AddCustomerSuccess.jsp");
	rd.forward(request, response);
	}

	//	doGet(request, response);
	}

}
