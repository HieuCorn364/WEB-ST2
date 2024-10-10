package vn.iostar.controller.admin;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.iostar.entity.CategoryEntity;
import vn.iostar.service.ICategoryService;
import vn.iostar.service.Impl.CategoryServiceImpl;
@WebServlet("/admin/categories")
public class CategoryController extends HttpServlet {

	ICategoryService categoryService = new CategoryServiceImpl();
	
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<CategoryEntity> list = categoryService.findAll();
		//sau khi nhan list thi se day ra view
		req.setAttribute("listcate", list);
		// đẩy
		req.getRequestDispatcher("/views/admin/category-list.jsp").forward(req, resp);
	}
}
