package com.px.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.px.entity.ThreeAssetType;
import com.px.service.ThreeAssetTypeService;
@SuppressWarnings("all")
public class ChangeInfoServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ChangeInfoServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		response.setContentType("text/xml;charset=utf-8");
		//浏览器禁用缓存
				response.setHeader("Cache-Control", "no-cache");
		PrintWriter out = response.getWriter();
	
		String twoAsset = request.getParameter("twoId");
		String oneAsset = request.getParameter("oneAssetTypeId");
		System.out.println("twoAsset"+twoAsset);
		System.out.println("oneAsset"+oneAsset);
		//获取spring容器
		WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
		//从spring容器中取出，TwoAssetTypeService ；类型的bean
		ThreeAssetTypeService threeAssetTypeService =(ThreeAssetTypeService) ctx.getBean("threeAssetTypeDaoImpl");
		
		List<ThreeAssetType> threeAsset = threeAssetTypeService.getResult();
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

			this.doGet(request, response);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
