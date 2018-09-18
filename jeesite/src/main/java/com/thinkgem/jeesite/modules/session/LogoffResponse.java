package com.thinkgem.jeesite.modules.session;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for logoffResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="logoffResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://business.ccpws.com/}wssmLogoffResultVo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "logoffResponse", propOrder = { "_return" })
public class LogoffResponse {

	@XmlElement(name = "return")
	protected WssmLogoffResultVo _return;

	/**
	 * Gets the value of the return property.
	 * 
	 * @return possible object is {@link WssmLogoffResultVo }
	 * 
	 */
	public WssmLogoffResultVo getReturn() {
		return _return;
	}

	/**
	 * Sets the value of the return property.
	 * 
	 * @param value
	 *            allowed object is {@link WssmLogoffResultVo }
	 * 
	 */
	public void setReturn(WssmLogoffResultVo value) {
		this._return = value;
	}

}
