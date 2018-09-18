/**
 * WscsSearchDocumentBodyVo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccpws.business;

public class WscsSearchDocumentBodyVo  implements java.io.Serializable {
    private com.ccpws.business.DocumentInfo[] documents;

    private com.ccpws.business.Pagination pagination;

    public WscsSearchDocumentBodyVo() {
    }

    public WscsSearchDocumentBodyVo(
           com.ccpws.business.DocumentInfo[] documents,
           com.ccpws.business.Pagination pagination) {
           this.documents = documents;
           this.pagination = pagination;
    }


    /**
     * Gets the documents value for this WscsSearchDocumentBodyVo.
     * 
     * @return documents
     */
    public com.ccpws.business.DocumentInfo[] getDocuments() {
        return documents;
    }


    /**
     * Sets the documents value for this WscsSearchDocumentBodyVo.
     * 
     * @param documents
     */
    public void setDocuments(com.ccpws.business.DocumentInfo[] documents) {
        this.documents = documents;
    }

    public com.ccpws.business.DocumentInfo getDocuments(int i) {
        return this.documents[i];
    }

    public void setDocuments(int i, com.ccpws.business.DocumentInfo _value) {
        this.documents[i] = _value;
    }


    /**
     * Gets the pagination value for this WscsSearchDocumentBodyVo.
     * 
     * @return pagination
     */
    public com.ccpws.business.Pagination getPagination() {
        return pagination;
    }


    /**
     * Sets the pagination value for this WscsSearchDocumentBodyVo.
     * 
     * @param pagination
     */
    public void setPagination(com.ccpws.business.Pagination pagination) {
        this.pagination = pagination;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WscsSearchDocumentBodyVo)) return false;
        WscsSearchDocumentBodyVo other = (WscsSearchDocumentBodyVo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.documents==null && other.getDocuments()==null) || 
             (this.documents!=null &&
              java.util.Arrays.equals(this.documents, other.getDocuments()))) &&
            ((this.pagination==null && other.getPagination()==null) || 
             (this.pagination!=null &&
              this.pagination.equals(other.getPagination())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDocuments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocuments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocuments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPagination() != null) {
            _hashCode += getPagination().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WscsSearchDocumentBodyVo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://business.ccpws.com/", "wscsSearchDocumentBodyVo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documents");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://business.ccpws.com/", "documentInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pagination");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pagination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://business.ccpws.com/", "pagination"));
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
