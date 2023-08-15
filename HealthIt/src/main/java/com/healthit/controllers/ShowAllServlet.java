package com.healthit.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.healthit.model.Fruits;
import com.healthit.service.FruitServiceImpl;
import com.healthit.service.IFruitService;

/**
 * Servlet implementation class ShowAllServlet
 */
@WebServlet("/showall")
public class ShowAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IFruitService iFruitService=new FruitServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowAllServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IFruitService iFruitService=new FruitServiceImpl();
		List<Fruits> fruitList=iFruitService.getAllFruits();
		request.setAttribute("fruitList", fruitList);
		
		RequestDispatcher dispatcher =request.getRequestDispatcher("finalclient.jsp");
		dispatcher.include(request, response);
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
