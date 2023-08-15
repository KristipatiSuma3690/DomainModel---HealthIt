package com.healthit.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.healthit.service.FruitServiceImpl;
import com.healthit.service.IFruitService;

/**
 * Servlet implementation class DeleteFruitServlet
 */
@WebServlet("/deletefruit")
public class DeleteFruitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IFruitService iFruitService=new FruitServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteFruitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int fruitId=Integer.parseInt(request.getParameter("fruitId"));
		iFruitService.deleteFruit(fruitId);
		request.setAttribute("message", "Fruit Successfully Deleted");
		
		RequestDispatcher dispatcher =request.getRequestDispatcher("final.jsp");
		dispatcher.forward(request, response);
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
