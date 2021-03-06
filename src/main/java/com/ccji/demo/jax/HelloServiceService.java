package com.ccji.demo.jax;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * <p>
 * An example of how this class may be used:
 * 
 * <pre>
 * HelloServiceService service = new HelloServiceService();
 * HelloService portType = service.getHelloServicePort();
 * portType.sayHello(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "HelloServiceService", targetNamespace = "http://jax.webservice.ccji.com/", wsdlLocation = "http://localhost:8080/helloService?wsdl")
public class HelloServiceService extends Service {

	private final static URL HELLOSERVICESERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger
			.getLogger(com.ccji.demo.jax.HelloServiceService.class.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = com.ccji.demo.jax.HelloServiceService.class
					.getResource(".");
			url = new URL(baseUrl, "http://localhost:8080/helloService?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/helloService?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		HELLOSERVICESERVICE_WSDL_LOCATION = url;
	}

	public HelloServiceService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public HelloServiceService() {
		super(HELLOSERVICESERVICE_WSDL_LOCATION, new QName(
				"http://jax.webservice.ccji.com/", "HelloServiceService"));
	}

	/**
	 * 
	 * @return returns HelloService
	 */
	@WebEndpoint(name = "HelloServicePort")
	public HelloService getHelloServicePort() {
		return super.getPort(new QName("http://jax.webservice.ccji.com/",
				"HelloServicePort"), HelloService.class);
	}

}
