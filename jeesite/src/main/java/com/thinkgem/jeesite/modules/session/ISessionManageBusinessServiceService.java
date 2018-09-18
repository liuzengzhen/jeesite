package com.thinkgem.jeesite.modules.session;

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
 * ISessionManageBusinessServiceService service = new ISessionManageBusinessServiceService();
 * ISessionManageBusinessService portType = service.getISessionManageBusinessServicePort();
 * portType.login(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "ISessionManageBusinessServiceService", targetNamespace = "http://business.ccpws.com/", wsdlLocation = "http://10.50.8.1:7001/SGECM/ws/SessionManageBusinessService?wsdl")
public class ISessionManageBusinessServiceService extends Service {

	private final static URL ISESSIONMANAGEBUSINESSSERVICESERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger
			.getLogger(com.thinkgem.jeesite.modules.session.ISessionManageBusinessServiceService.class
					.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = com.thinkgem.jeesite.modules.session.ISessionManageBusinessServiceService.class
					.getResource(".");
			url = new URL(baseUrl,
					"http://10.50.8.1:7001/SGECM/ws/SessionManageBusinessService?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://10.50.8.1:7001/SGECM/ws/SessionManageBusinessService?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		ISESSIONMANAGEBUSINESSSERVICESERVICE_WSDL_LOCATION = url;
	}

	public ISessionManageBusinessServiceService(URL wsdlLocation,
			QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public ISessionManageBusinessServiceService() {
		super(ISESSIONMANAGEBUSINESSSERVICESERVICE_WSDL_LOCATION, new QName(
				"http://business.ccpws.com/",
				"ISessionManageBusinessServiceService"));
	}

	/**
	 * 
	 * @return returns ISessionManageBusinessService
	 */
	@WebEndpoint(name = "ISessionManageBusinessServicePort")
	public ISessionManageBusinessService getISessionManageBusinessServicePort() {
		return super.getPort(new QName("http://business.ccpws.com/",
				"ISessionManageBusinessServicePort"),
				ISessionManageBusinessService.class);
	}

}
