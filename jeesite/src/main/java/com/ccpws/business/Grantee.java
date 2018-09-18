/**
 * Grantee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccpws.business;

public class Grantee  implements java.io.Serializable {
    private int accessMask;

    private java.lang.String accessMasks;

    private java.lang.String accessType;

    private java.lang.String displayName;

    private java.lang.String distinguishedName;

    private java.lang.String granteeType;

    private int inheritableDepth;

    private java.lang.String name;

    private int permissionSource;

    private java.lang.String shortName;

    public Grantee() {
    }

    public Grantee(
           int accessMask,
           java.lang.String accessMasks,
           java.lang.String accessType,
           java.lang.String displayName,
           java.lang.String distinguishedName,
           java.lang.String granteeType,
           int inheritableDepth,
           java.lang.String name,
           int permissionSource,
           java.lang.String shortName) {
           this.accessMask = accessMask;
           this.accessMasks = accessMasks;
           this.accessType = accessType;
           this.displayName = displayName;
           this.distinguishedName = distinguishedName;
           this.granteeType = granteeType;
           this.inheritableDepth = inheritableDepth;
           this.name = name;
           this.permissionSource = permissionSource;
           this.shortName = shortName;
    }


    /**
     * Gets the accessMask value for this Grantee.
     * 
     * @return accessMask
     */
    public int getAccessMask() {
        return accessMask;
    }


    /**
     * Sets the accessMask value for this Grantee.
     * 
     * @param accessMask
     */
    public void setAccessMask(int accessMask) {
        this.accessMask = accessMask;
    }


    /**
     * Gets the accessMasks value for this Grantee.
     * 
     * @return accessMasks
     */
    public java.lang.String getAccessMasks() {
        return accessMasks;
    }


    /**
     * Sets the accessMasks value for this Grantee.
     * 
     * @param accessMasks
     */
    public void setAccessMasks(java.lang.String accessMasks) {
        this.accessMasks = accessMasks;
    }


    /**
     * Gets the accessType value for this Grantee.
     * 
     * @return accessType
     */
    public java.lang.String getAccessType() {
        return accessType;
    }


    /**
     * Sets the accessType value for this Grantee.
     * 
     * @param accessType
     */
    public void setAccessType(java.lang.String accessType) {
        this.accessType = accessType;
    }


    /**
     * Gets the displayName value for this Grantee.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this Grantee.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the distinguishedName value for this Grantee.
     * 
     * @return distinguishedName
     */
    public java.lang.String getDistinguishedName() {
        return distinguishedName;
    }


    /**
     * Sets the distinguishedName value for this Grantee.
     * 
     * @param distinguishedName
     */
    public void setDistinguishedName(java.lang.String distinguishedName) {
        this.distinguishedName = distinguishedName;
    }


    /**
     * Gets the granteeType value for this Grantee.
     * 
     * @return granteeType
     */
    public java.lang.String getGranteeType() {
        return granteeType;
    }


    /**
     * Sets the granteeType value for this Grantee.
     * 
     * @param granteeType
     */
    public void setGranteeType(java.lang.String granteeType) {
        this.granteeType = granteeType;
    }


    /**
     * Gets the inheritableDepth value for this Grantee.
     * 
     * @return inheritableDepth
     */
    public int getInheritableDepth() {
        return inheritableDepth;
    }


    /**
     * Sets the inheritableDepth value for this Grantee.
     * 
     * @param inheritableDepth
     */
    public void setInheritableDepth(int inheritableDepth) {
        this.inheritableDepth = inheritableDepth;
    }


    /**
     * Gets the name value for this Grantee.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Grantee.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the permissionSource value for this Grantee.
     * 
     * @return permissionSource
     */
    public int getPermissionSource() {
        return permissionSource;
    }


    /**
     * Sets the permissionSource value for this Grantee.
     * 
     * @param permissionSource
     */
    public void setPermissionSource(int permissionSource) {
        this.permissionSource = permissionSource;
    }


    /**
     * Gets the shortName value for this Grantee.
     * 
     * @return shortName
     */
    public java.lang.String getShortName() {
        return shortName;
    }


    /**
     * Sets the shortName value for this Grantee.
     * 
     * @param shortName
     */
    public void setShortName(java.lang.String shortName) {
        this.shortName = shortName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Grantee)) return false;
        Grantee other = (Grantee) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.accessMask == other.getAccessMask() &&
            ((this.accessMasks==null && other.getAccessMasks()==null) || 
             (this.accessMasks!=null &&
              this.accessMasks.equals(other.getAccessMasks()))) &&
            ((this.accessType==null && other.getAccessType()==null) || 
             (this.accessType!=null &&
              this.accessType.equals(other.getAccessType()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.distinguishedName==null && other.getDistinguishedName()==null) || 
             (this.distinguishedName!=null &&
              this.distinguishedName.equals(other.getDistinguishedName()))) &&
            ((this.granteeType==null && other.getGranteeType()==null) || 
             (this.granteeType!=null &&
              this.granteeType.equals(other.getGranteeType()))) &&
            this.inheritableDepth == other.getInheritableDepth() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.permissionSource == other.getPermissionSource() &&
            ((this.shortName==null && other.getShortName()==null) || 
             (this.shortName!=null &&
              this.shortName.equals(other.getShortName())));
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
        _hashCode += getAccessMask();
        if (getAccessMasks() != null) {
            _hashCode += getAccessMasks().hashCode();
        }
        if (getAccessType() != null) {
            _hashCode += getAccessType().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getDistinguishedName() != null) {
            _hashCode += getDistinguishedName().hashCode();
        }
        if (getGranteeType() != null) {
            _hashCode += getGranteeType().hashCode();
        }
        _hashCode += getInheritableDepth();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += getPermissionSource();
        if (getShortName() != null) {
            _hashCode += getShortName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Grantee.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://business.ccpws.com/", "grantee"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessMask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accessMask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessMasks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accessMasks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accessType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distinguishedName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "distinguishedName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("granteeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "granteeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inheritableDepth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inheritableDepth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionSource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "permissionSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shortName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shortName"));
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
