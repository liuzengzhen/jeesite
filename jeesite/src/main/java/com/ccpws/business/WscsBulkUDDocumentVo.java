/**
 * WscsBulkUDDocumentVo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccpws.business;

public class WscsBulkUDDocumentVo  implements java.io.Serializable {
    private byte[] fileData;

    private java.lang.String fileName;

    private java.lang.String fileType;

    private int mainfile;

    private java.lang.String message;

    private java.lang.String operation;

    private java.lang.String path;

    private com.ccpws.business.PropertyInfo[] propertyInfos;

    private java.lang.String status;

    private java.lang.String symbolicName;

    public WscsBulkUDDocumentVo() {
    }

    public WscsBulkUDDocumentVo(
           byte[] fileData,
           java.lang.String fileName,
           java.lang.String fileType,
           int mainfile,
           java.lang.String message,
           java.lang.String operation,
           java.lang.String path,
           com.ccpws.business.PropertyInfo[] propertyInfos,
           java.lang.String status,
           java.lang.String symbolicName) {
           this.fileData = fileData;
           this.fileName = fileName;
           this.fileType = fileType;
           this.mainfile = mainfile;
           this.message = message;
           this.operation = operation;
           this.path = path;
           this.propertyInfos = propertyInfos;
           this.status = status;
           this.symbolicName = symbolicName;
    }


    /**
     * Gets the fileData value for this WscsBulkUDDocumentVo.
     * 
     * @return fileData
     */
    public byte[] getFileData() {
        return fileData;
    }


    /**
     * Sets the fileData value for this WscsBulkUDDocumentVo.
     * 
     * @param fileData
     */
    public void setFileData(byte[] fileData) {
        this.fileData = fileData;
    }


    /**
     * Gets the fileName value for this WscsBulkUDDocumentVo.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this WscsBulkUDDocumentVo.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the fileType value for this WscsBulkUDDocumentVo.
     * 
     * @return fileType
     */
    public java.lang.String getFileType() {
        return fileType;
    }


    /**
     * Sets the fileType value for this WscsBulkUDDocumentVo.
     * 
     * @param fileType
     */
    public void setFileType(java.lang.String fileType) {
        this.fileType = fileType;
    }


    /**
     * Gets the mainfile value for this WscsBulkUDDocumentVo.
     * 
     * @return mainfile
     */
    public int getMainfile() {
        return mainfile;
    }


    /**
     * Sets the mainfile value for this WscsBulkUDDocumentVo.
     * 
     * @param mainfile
     */
    public void setMainfile(int mainfile) {
        this.mainfile = mainfile;
    }


    /**
     * Gets the message value for this WscsBulkUDDocumentVo.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this WscsBulkUDDocumentVo.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the operation value for this WscsBulkUDDocumentVo.
     * 
     * @return operation
     */
    public java.lang.String getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this WscsBulkUDDocumentVo.
     * 
     * @param operation
     */
    public void setOperation(java.lang.String operation) {
        this.operation = operation;
    }


    /**
     * Gets the path value for this WscsBulkUDDocumentVo.
     * 
     * @return path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this WscsBulkUDDocumentVo.
     * 
     * @param path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the propertyInfos value for this WscsBulkUDDocumentVo.
     * 
     * @return propertyInfos
     */
    public com.ccpws.business.PropertyInfo[] getPropertyInfos() {
        return propertyInfos;
    }


    /**
     * Sets the propertyInfos value for this WscsBulkUDDocumentVo.
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
     * Gets the status value for this WscsBulkUDDocumentVo.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this WscsBulkUDDocumentVo.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the symbolicName value for this WscsBulkUDDocumentVo.
     * 
     * @return symbolicName
     */
    public java.lang.String getSymbolicName() {
        return symbolicName;
    }


    /**
     * Sets the symbolicName value for this WscsBulkUDDocumentVo.
     * 
     * @param symbolicName
     */
    public void setSymbolicName(java.lang.String symbolicName) {
        this.symbolicName = symbolicName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WscsBulkUDDocumentVo)) return false;
        WscsBulkUDDocumentVo other = (WscsBulkUDDocumentVo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fileData==null && other.getFileData()==null) || 
             (this.fileData!=null &&
              java.util.Arrays.equals(this.fileData, other.getFileData()))) &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.fileType==null && other.getFileType()==null) || 
             (this.fileType!=null &&
              this.fileType.equals(other.getFileType()))) &&
            this.mainfile == other.getMainfile() &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.operation==null && other.getOperation()==null) || 
             (this.operation!=null &&
              this.operation.equals(other.getOperation()))) &&
            ((this.path==null && other.getPath()==null) || 
             (this.path!=null &&
              this.path.equals(other.getPath()))) &&
            ((this.propertyInfos==null && other.getPropertyInfos()==null) || 
             (this.propertyInfos!=null &&
              java.util.Arrays.equals(this.propertyInfos, other.getPropertyInfos()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.symbolicName==null && other.getSymbolicName()==null) || 
             (this.symbolicName!=null &&
              this.symbolicName.equals(other.getSymbolicName())));
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
        if (getFileData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFileData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFileData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getFileType() != null) {
            _hashCode += getFileType().hashCode();
        }
        _hashCode += getMainfile();
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getOperation() != null) {
            _hashCode += getOperation().hashCode();
        }
        if (getPath() != null) {
            _hashCode += getPath().hashCode();
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSymbolicName() != null) {
            _hashCode += getSymbolicName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WscsBulkUDDocumentVo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://business.ccpws.com/", "wscsBulkUDDocumentVo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainfile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mainfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("", "path"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("symbolicName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "symbolicName"));
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
