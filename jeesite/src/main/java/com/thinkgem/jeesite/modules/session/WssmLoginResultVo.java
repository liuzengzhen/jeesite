package com.thinkgem.jeesite.modules.session;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for wssmLoginResultVo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="wssmLoginResultVo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://business.ccpws.com/}wsBaseResultVo">
 *       &lt;sequence>
 *         &lt;element name="body" type="{http://business.ccpws.com/}wssmLoginBodyVo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wssmLoginResultVo", propOrder = { "body" })
public class WssmLoginResultVo extends WsBaseResultVo {

	protected WssmLoginBodyVo body;

	/**
	 * Gets the value of the body property.
	 * 
	 * @return possible object is {@link WssmLoginBodyVo }
	 * 
	 */
	public WssmLoginBodyVo getBody() {
		return body;
	}

	/**
	 * Sets the value of the body property.
	 * 
	 * @param value
	 *            allowed object is {@link WssmLoginBodyVo }
	 * 
	 */
	public void setBody(WssmLoginBodyVo value) {
		this.body = value;
	}

}
