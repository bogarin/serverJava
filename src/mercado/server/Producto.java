package mercado.server;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService
public class Producto {
	List<String> books;
	List<String> music;
	List<String> movies;
	List<String> categories;
	
	public Producto(){
		books = new ArrayList<String>();
		music = new ArrayList<String>();
		movies = new ArrayList<String>();
		categories = new ArrayList<String>();
		
		books.add("the name of the wind");
		books.add("the wise mans fear");
		books.add("harry poter");
		
		music.add("queen");
		music.add("pxndx");
		music.add("creedence");
		
		movies.add("narnia");
		movies.add("avengers");
		movies.add("generation z");
		
		categories.add("books");
		categories.add("music");
		categories.add("movies");
	}
	
	public List<String> getCategoriesProduct(){
		return categories;
	}
	
	public List<String> getProduct(String categories){
		switch (categories.toLowerCase()){
		case "books":
			return books;
		case "music":
			return music;
		case "movies":
			return movies;
		}
		return null;
	}
	
	public boolean addProduct(String category, String product){
		switch (category.toLowerCase()){
		case "books":
			books.add(product);
			return true;
		case "music":
			music.add(product);
			return true;
		case "movies":
			movies.add(product);
			return true;
		}
		return false;
	}
}
