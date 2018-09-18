/**
 * WscsUpdateDocumentContentResultVo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccpws.business;

public class WscsUpdateDocumentContentResultVo  extends com.ccpws.business.WsBaseResultVo  implements java.io.Serializable {
    private com.ccpws.business.WscsUpdateDocumentContentBodyVo body;

    public WscsUpdateDocumentContentResultVo() {
    }

    public WscsUpdateDocumentContentResultVo(
           com.ccpws.business.WsHeaderVo header,
           com.ccpws.business.WscsUpdateDocumentContentBodyVo body) {
        super(
            header);
        this.body = body;
    }


    /**
     * Gets the body value for this WscsUpdateDocumentContentResultVo.
     * 
     * @return body
     */
    public com.ccpws.business.WscsUpdateDocumentContentBodyVo getBody() {
        return body;
    }


    /**
     * Sets the body value for this WscsUpdateDocumentContentResultVo.
     * 
     * @param body
     */
    public void setBody(com.ccpws.business.WscsUpdateDocumentContentBodyVo body) {
        this.body = body;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WscsUpdateDocumentContentResultVo)) return false;
        WscsUpdateDocumentContentResultVo other = (WscsUpdateDocumentContentResultVo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.body==null && other.getBody()==null) || 
             (this.body!=null &&
              this.body.equals(other.getBody())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getBody() != null) {
            _hashCode += getBody().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WscsUpdateDocumentContentResultVo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://business.ccpws.com/", "wscsUpdateDocumentContentResultVo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("body");
        elemField.setXmlName(new javax.xml.namespace.QName("", "body"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://business.ccpws.com/", "wscsUpdateDocumentContentBodyVo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
