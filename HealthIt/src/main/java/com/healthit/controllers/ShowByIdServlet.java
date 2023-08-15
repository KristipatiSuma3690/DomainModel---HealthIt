package com.healthit.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.healthit.exceptions.FruitNotFoundException;
import com.healthit.model.Fruits;
import com.healthit.service.FruitServiceImpl;
import com.healthit.service.IFruitService;

/**
 * Servlet implementation class ShowByIdServlet
 */
@WebServlet("/showbyid")
public class ShowByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowByIdServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
	int fruitId=Integer.parseInt(request.getParameter("fruitId"));
	Fruits fruit=null;
	IFruitService iFruitService=new FruitServiceImpl();
	try {
	fruit=iFruitService.getById(fruitId);
	}catch(FruitNotFoundException e) {
		e.printStackTrace();
	}
	
	
	if(fruit==null) {
		request.setAttribute("message", "Fruit Not found");
	}
	else {
	request.setAttribute("fruit", fruit);
	RequestDispatcher dispatcher =request.getRequestDispatcher("finalclient.jsp");
	dispatcher.include(request, response);
	
	}}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
