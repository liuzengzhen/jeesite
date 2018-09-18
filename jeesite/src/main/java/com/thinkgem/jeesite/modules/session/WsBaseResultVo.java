package com.thinkgem.jeesite.modules.session;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for wsBaseResultVo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="wsBaseResultVo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{http://business.ccpws.com/}wsHeaderVo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsBaseResultVo", propOrder = { "header" })
public class WsBaseResultVo {

	protected WsHeaderVo header;

	/**
	 * Gets the value of the header property.
	 * 
	 * @return possible object is {@link WsHeaderVo }
	 * 
	 */
	public WsHeaderVo getHeader() {
		return header;
	}

	/**
	 * Sets the value of the header property.
	 * 
	 * @param value
	 *            allowed object is {@link WsHeaderVo }
	 * 
	 */
	public void setHeader(WsHeaderVo value) {
		this.header = value;
	}

}
