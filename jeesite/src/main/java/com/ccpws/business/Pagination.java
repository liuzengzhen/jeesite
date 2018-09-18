/**
 * Pagination.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccpws.business;

public class Pagination  implements java.io.Serializable {
    private int currentPage;

    private int objectsPerpage;

    private int totalObjects;

    private int totalPages;

    public Pagination() {
    }

    public Pagination(
           int currentPage,
           int objectsPerpage,
           int totalObjects,
           int totalPages) {
           this.currentPage = currentPage;
           this.objectsPerpage = objectsPerpage;
           this.totalObjects = totalObjects;
           this.totalPages = totalPages;
    }


    /**
     * Gets the currentPage value for this Pagination.
     * 
     * @return currentPage
     */
    public int getCurrentPage() {
        return currentPage;
    }


    /**
     * Sets the currentPage value for this Pagination.
     * 
     * @param currentPage
     */
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }


    /**
     * Gets the objectsPerpage value for this Pagination.
     * 
     * @return objectsPerpage
     */
    public int getObjectsPerpage() {
        return objectsPerpage;
    }


    /**
     * Sets the objectsPerpage value for this Pagination.
     * 
     * @param objectsPerpage
     */
    public void setObjectsPerpage(int objectsPerpage) {
        this.objectsPerpage = objectsPerpage;
    }


    /**
     * Gets the totalObjects value for this Pagination.
     * 
     * @return totalObjects
     */
    public int getTotalObjects() {
        return totalObjects;
    }


    /**
     * Sets the totalObjects value for this Pagination.
     * 
     * @param totalObjects
     */
    public void setTotalObjects(int totalObjects) {
        this.totalObjects = totalObjects;
    }


    /**
     * Gets the totalPages value for this Pagination.
     * 
     * @return totalPages
     */
    public int getTotalPages() {
        return totalPages;
    }


    /**
     * Sets the totalPages value for this Pagination.
     * 
     * @param totalPages
     */
    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Pagination)) return false;
        Pagination other = (Pagination) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.currentPage == other.getCurrentPage() &&
            this.objectsPerpage == other.getObjectsPerpage() &&
            this.totalObjects == other.getTotalObjects() &&
            this.totalPages == other.getTotalPages();
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
        _hashCode += getCurrentPage();
        _hashCode += getObjectsPerpage();
        _hashCode += getTotalObjects();
        _hashCode += getTotalPages();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Pagination.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://business.ccpws.com/", "pagination"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentPage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currentPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectsPerpage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "objectsPerpage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalObjects");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalObjects"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPages");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalPages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
