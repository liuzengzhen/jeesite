package com.thinkgem.jeesite.modules.session;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.session package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _Logoff_QNAME = new QName(
			"http://business.ccpws.com/", "logoff");
	private final static QName _Login_QNAME = new QName(
			"http://business.ccpws.com/", "login");
	private final static QName _LogoffResponse_QNAME = new QName(
			"http://business.ccpws.com/", "logoffResponse");
	private final static QName _LoginResponse_QNAME = new QName(
			"http://business.ccpws.com/", "loginResponse");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.session
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link WssmLoginBodyVo }
	 * 
	 */
	public WssmLoginBodyVo createWssmLoginBodyVo() {
		return new WssmLoginBodyVo();
	}

	/**
	 * Create an instance of {@link LogoffResponse }
	 * 
	 */
	public LogoffResponse createLogoffResponse() {
		return new LogoffResponse();
	}

	/**
	 * Create an instance of {@link WssmLogoffBodyVo }
	 * 
	 */
	public WssmLogoffBodyVo createWssmLogoffBodyVo() {
		return new WssmLogoffBodyVo();
	}

	/**
	 * Create an instance of {@link LoginResponse }
	 * 
	 */
	public LoginResponse createLoginResponse() {
		return new LoginResponse();
	}

	/**
	 * Create an instance of {@link Logoff }
	 * 
	 */
	public Logoff createLogoff() {
		return new Logoff();
	}

	/**
	 * Create an instance of {@link WsHeaderVo }
	 * 
	 */
	public WsHeaderVo createWsHeaderVo() {
		return new WsHeaderVo();
	}

	/**
	 * Create an instance of {@link WsBaseResultVo }
	 * 
	 */
	public WsBaseResultVo createWsBaseResultVo() {
		return new WsBaseResultVo();
	}

	/**
	 * Create an instance of {@link WssmLogoffResultVo }
	 * 
	 */
	public WssmLogoffResultVo createWssmLogoffResultVo() {
		return new WssmLogoffResultVo();
	}

	/**
	 * Create an instance of {@link WssmLoginResultVo }
	 * 
	 */
	public WssmLoginResultVo createWssmLoginResultVo() {
		return new WssmLoginResultVo();
	}

	/**
	 * Create an instance of {@link Login }
	 * 
	 */
	public Login createLogin() {
		return new Login();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Logoff }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://business.ccpws.com/", name = "logoff")
	public JAXBElement<Logoff> createLogoff(Logoff value) {
		return new JAXBElement<Logoff>(_Logoff_QNAME, Logoff.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://business.ccpws.com/", name = "login")
	public JAXBElement<Login> createLogin(Login value) {
		return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link LogoffResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://business.ccpws.com/", name = "logoffResponse")
	public JAXBElement<LogoffResponse> createLogoffResponse(LogoffResponse value) {
		return new JAXBElement<LogoffResponse>(_LogoffResponse_QNAME,
				LogoffResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://business.ccpws.com/", name = "loginResponse")
	public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
		return new JAXBElement<LoginResponse>(_LoginResponse_QNAME,
				LoginResponse.class, null, value);
	}

}
