package com.thinkgem.jeesite.modules.session;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for wssmLoginBodyVo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="wssmLoginBodyVo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="downUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serverUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uploadUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wssmLoginBodyVo", propOrder = { "downUrl", "serverUrl",
		"sessionId", "uploadUrl" })
public class WssmLoginBodyVo {

	protected String downUrl;
	protected String serverUrl;
	protected String sessionId;
	protected String uploadUrl;

	/**
	 * Gets the value of the downUrl property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDownUrl() {
		return downUrl;
	}

	/**
	 * Sets the value of the downUrl property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDownUrl(String value) {
		this.downUrl = value;
	}

	/**
	 * Gets the value of the serverUrl property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getServerUrl() {
		return serverUrl;
	}

	/**
	 * Sets the value of the serverUrl property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setServerUrl(String value) {
		this.serverUrl = value;
	}

	/**
	 * Gets the value of the sessionId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSessionId() {
		return sessionId;
	}

	/**
	 * Sets the value of the sessionId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSessionId(String value) {
		this.sessionId = value;
	}

	/**
	 * Gets the value of the uploadUrl property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUploadUrl() {
		return uploadUrl;
	}

	/**
	 * Sets the value of the uploadUrl property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUploadUrl(String value) {
		this.uploadUrl = value;
	}

}
