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
 * Servlet implementation class UpdateFruitServlet
 */
@WebServlet("/updatefruit")
public class UpdateFruitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IFruitService fruitService=new FruitServiceImpl();

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateFruitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double price=Double.parseDouble(request.getParameter("price"));
		int fruitId=Integer.parseInt(request.getParameter("fruitId"));
		Fruits fruit=new Fruits();
		//List<Fruits> fruitList=new ArrayList<>();
		//fruit.setFruitName(fruitName);
		//fruit.setFruitId(fruitId);
		//fruit.setFruitType(fruitType);
		//fruit.setCategory(category);
		//fruit.setRegion(region);
		//fruit.setPrice(price);
		
		fruitService.updateFruit(price, fruitId);
		request.setAttribute("price", price);
		fruit=fruitService.getById(fruitId);

		request.setAttribute("fruit",fruit);
		request.setAttribute("message", "Fruit successfully updated...");
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
