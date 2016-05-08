package mercado.server;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ProductoCatalogo {
	private Producto producto = new Producto();

	@WebMethod(exclude = false)
	public List<String> getProduct(String categories) {
		return producto.getProduct(categories);
	}
	
	@WebMethod(exclude = false)
	public List<String> setCategoria() {
		return producto.getCategoriesProduct();
	}

	@WebMethod(exclude = false)
	public boolean addProduct(String category, String product) {
		return producto.addProduct(category, product);
	}
}
