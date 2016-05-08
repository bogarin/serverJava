package mercado.server;

import javax.xml.ws.Endpoint;


public class Principal {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8181/WS/Mercado",new ProductoCatalogo());
	}

}
