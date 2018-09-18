package com.thinkgem.jeesite.modules.session;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for wssmLogoffResultVo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="wssmLogoffResultVo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://business.ccpws.com/}wsBaseResultVo">
 *       &lt;sequence>
 *         &lt;element name="body" type="{http://business.ccpws.com/}wssmLogoffBodyVo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wssmLogoffResultVo", propOrder = { "body" })
public class WssmLogoffResultVo extends WsBaseResultVo {

	protected WssmLogoffBodyVo body;

	/**
	 * Gets the value of the body property.
	 * 
	 * @return possible object is {@link WssmLogoffBodyVo }
	 * 
	 */
	public WssmLogoffBodyVo getBody() {
		return body;
	}

	/**
	 * Sets the value of the body property.
	 * 
	 * @param value
	 *            allowed object is {@link WssmLogoffBodyVo }
	 * 
	 */
	public void setBody(WssmLogoffBodyVo value) {
		this.body = value;
	}

}
