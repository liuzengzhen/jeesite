/**
 * DocumentInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccpws.business;

public class DocumentInfo  implements java.io.Serializable {
    private java.lang.Double contentSize;

    private java.lang.String documentTitle;

    private java.lang.String id;

    private java.lang.String mimeType;

    private com.ccpws.business.PropertyInfo[] propertyInfos;

    private java.lang.Integer versionNum;

    private java.lang.String versionStatus;

    public DocumentInfo() {
    }

    public DocumentInfo(
           java.lang.Double contentSize,
           java.lang.String documentTitle,
           java.lang.String id,
           java.lang.String mimeType,
           com.ccpws.business.PropertyInfo[] propertyInfos,
           java.lang.Integer versionNum,
           java.lang.String versionStatus) {
           this.contentSize = contentSize;
           this.documentTitle = documentTitle;
           this.id = id;
           this.mimeType = mimeType;
           this.propertyInfos = propertyInfos;
           this.versionNum = versionNum;
           this.versionStatus = versionStatus;
    }


    /**
     * Gets the contentSize value for this DocumentInfo.
     * 
     * @return contentSize
     */
    public java.lang.Double getContentSize() {
        return contentSize;
    }


    /**
     * Sets the contentSize value for this DocumentInfo.
     * 
     * @param contentSize
     */
    public void setContentSize(java.lang.Double contentSize) {
        this.contentSize = contentSize;
    }


    /**
     * Gets the documentTitle value for this DocumentInfo.
     * 
     * @return documentTitle
     */
    public java.lang.String getDocumentTitle() {
        return documentTitle;
    }


    /**
     * Sets the documentTitle value for this DocumentInfo.
     * 
     * @param documentTitle
     */
    public void setDocumentTitle(java.lang.String documentTitle) {
        this.documentTitle = documentTitle;
    }


    /**
     * Gets the id value for this DocumentInfo.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this DocumentInfo.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the mimeType value for this DocumentInfo.
     * 
     * @return mimeType
     */
    public java.lang.String getMimeType() {
        return mimeType;
    }


    /**
     * Sets the mimeType value for this DocumentInfo.
     * 
     * @param mimeType
     */
    public void setMimeType(java.lang.String mimeType) {
        this.mimeType = mimeType;
    }


    /**
     * Gets the propertyInfos value for this DocumentInfo.
     * 
     * @return propertyInfos
     */
    public com.ccpws.business.PropertyInfo[] getPropertyInfos() {
        return propertyInfos;
    }


    /**
     * Sets the propertyInfos value for this DocumentInfo.
     * 
     * @param propertyInfos
     */
    public void setPropertyInfos(com.ccpws.business.PropertyInfo[] propertyInfos) {
        this.propertyInfos = propertyInfos;
    }

    public com.ccpws.business.PropertyInfo getPropertyInfos(int i) {
        return this.propertyInfos[i];
    }

    public void setPropertyInfos(int i, com.ccpws.business.PropertyInfo _value) {
        this.propertyInfos[i] = _value;
    }


    /**
     * Gets the versionNum value for this DocumentInfo.
     * 
     * @return versionNum
     */
    public java.lang.Integer getVersionNum() {
        return versionNum;
    }


    /**
     * Sets the versionNum value for this DocumentInfo.
     * 
     * @param versionNum
     */
    public void setVersionNum(java.lang.Integer versionNum) {
        this.versionNum = versionNum;
    }


    /**
     * Gets the versionStatus value for this DocumentInfo.
     * 
     * @return versionStatus
     */
    public java.lang.String getVersionStatus() {
        return versionStatus;
    }


    /**
     * Sets the versionStatus value for this DocumentInfo.
     * 
     * @param versionStatus
     */
    public void setVersionStatus(java.lang.String versionStatus) {
        this.versionStatus = versionStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentInfo)) return false;
        DocumentInfo other = (DocumentInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contentSize==null && other.getContentSize()==null) || 
             (this.contentSize!=null &&
              this.contentSize.equals(other.getContentSize()))) &&
            ((this.documentTitle==null && other.getDocumentTitle()==null) || 
             (this.documentTitle!=null &&
              this.documentTitle.equals(other.getDocumentTitle()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.mimeType==null && other.getMimeType()==null) || 
             (this.mimeType!=null &&
              this.mimeType.equals(other.getMimeType()))) &&
            ((this.propertyInfos==null && other.getPropertyInfos()==null) || 
             (this.propertyInfos!=null &&
              java.util.Arrays.equals(this.propertyInfos, other.getPropertyInfos()))) &&
            ((this.versionNum==null && other.getVersionNum()==null) || 
             (this.versionNum!=null &&
              this.versionNum.equals(other.getVersionNum()))) &&
            ((this.versionStatus==null && other.getVersionStatus()==null) || 
             (this.versionStatus!=null &&
              this.versionStatus.equals(other.getVersionStatus())));
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
        if (getContentSize() != null) {
            _hashCode += getContentSize().hashCode();
        }
        if (getDocumentTitle() != null) {
            _hashCode += getDocumentTitle().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getMimeType() != null) {
            _hashCode += getMimeType().hashCode();
        }
        if (getPropertyInfos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPropertyInfos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPropertyInfos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVersionNum() != null) {
            _hashCode += getVersionNum().hashCode();
        }
        if (getVersionStatus() != null) {
            _hashCode += getVersionStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://business.ccpws.com/", "documentInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contentSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mimeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyInfos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "propertyInfos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://business.ccpws.com/", "propertyInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "versionNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "versionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
