package com.healthit.controllers;

import java.io.IOException;

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
 * Servlet implementation class AddBookServlet
 */
@WebServlet("/addBookServlet")
public class AddFruitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IFruitService ifruitService=new FruitServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddFruitServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fruitName=request.getParameter("fruitName");
		Integer fruitId=Integer.parseInt(request.getParameter("fruitId"));
		String fruitType=request.getParameter("fruitType");
		String category=request.getParameter("category");
		String region=request.getParameter("region");
		double price=Double.parseDouble(request.getParameter("price"));
		
		Fruits fruit=new Fruits();
		fruit.setFruitName(fruitName);
		fruit.setFruitId(fruitId);
		fruit.setFruitType(fruitType);
		fruit.setCategory(category);
		fruit.setRegion(region);
		fruit.setPrice(price);
		
		ifruitService.addFruit(fruit);
		request.setAttribute("fruit", fruit);
		request.setAttribute("message", "Fruit successfully added...");
		RequestDispatcher dispatcher =request.getRequestDispatcher("final.jsp");
		dispatcher.forward(request, response);

		
		



		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
