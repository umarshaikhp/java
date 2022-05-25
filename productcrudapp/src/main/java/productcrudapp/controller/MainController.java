package productcrudapp.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import productcrudapp.dao.ProductDao;
import productcrudapp.model.Product;

@Controller
public class MainController {
	
@Autowired
private ProductDao productDao;	
	
	@RequestMapping("/")
	public String home(Model model) {
	List<Product> products =	productDao.getProducts();
	System.out.println(products);
	model.addAttribute("products", products);
		return "index";
	}
	
	@RequestMapping("/add-product")
	public String addProduct(Model model) {
		model.addAttribute("title", "Add Product");
		return "add_product_form";
	}
	
	@RequestMapping(value = "/handle-product",method = RequestMethod.POST)
	public RedirectView addProduct(@ModelAttribute Product product,  HttpServletRequest request) {
//		Product product = new Product();
//		product.setId(Integer.parseInt(request.getParameter("id")));
//		product.setName(request.getParameter("name"));
//		product.setDescription(request.getParameter("description"));
//		product.setPrice(Long.parseLong(request.getParameter("price")));
		System.out.println(product);
		productDao.createProduct(product);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}
	
//	uri template variable we take like this {} to get url value
	@RequestMapping("/delete/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId")int productId,HttpServletRequest request) {
		this.productDao.deleteProduct(productId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
		
	}
	
	@RequestMapping("/update/{productId}")
	public String updateForm(@PathVariable("productId")int pid,Model model) {
	Product product = 	this.productDao.getSingleProduct(pid);
	model.addAttribute("product", product);
		return "update_Form";
	}

}
