/**
 * ICommonContentManageBusinessServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccpws.business;

public class ICommonContentManageBusinessServiceServiceLocator extends org.apache.axis.client.Service implements com.ccpws.business.ICommonContentManageBusinessServiceService {

    public ICommonContentManageBusinessServiceServiceLocator() {
    }


    public ICommonContentManageBusinessServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ICommonContentManageBusinessServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ICommonContentManageBusinessServicePort
    private java.lang.String ICommonContentManageBusinessServicePort_address = "http://10.50.8.1:7001/SGECM/ws/CommonContentManageBusinessService";

    public java.lang.String getICommonContentManageBusinessServicePortAddress() {
        return ICommonContentManageBusinessServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ICommonContentManageBusinessServicePortWSDDServiceName = "ICommonContentManageBusinessServicePort";

    public java.lang.String getICommonContentManageBusinessServicePortWSDDServiceName() {
        return ICommonContentManageBusinessServicePortWSDDServiceName;
    }

    public void setICommonContentManageBusinessServicePortWSDDServiceName(java.lang.String name) {
        ICommonContentManageBusinessServicePortWSDDServiceName = name;
    }

    public com.ccpws.business.ICommonContentManageBusinessService getICommonContentManageBusinessServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ICommonContentManageBusinessServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getICommonContentManageBusinessServicePort(endpoint);
    }

    public com.ccpws.business.ICommonContentManageBusinessService getICommonContentManageBusinessServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ccpws.business.ICommonContentManageBusinessServiceServiceSoapBindingStub _stub = new com.ccpws.business.ICommonContentManageBusinessServiceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getICommonContentManageBusinessServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setICommonContentManageBusinessServicePortEndpointAddress(java.lang.String address) {
        ICommonContentManageBusinessServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ccpws.business.ICommonContentManageBusinessService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ccpws.business.ICommonContentManageBusinessServiceServiceSoapBindingStub _stub = new com.ccpws.business.ICommonContentManageBusinessServiceServiceSoapBindingStub(new java.net.URL(ICommonContentManageBusinessServicePort_address), this);
                _stub.setPortName(getICommonContentManageBusinessServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ICommonContentManageBusinessServicePort".equals(inputPortName)) {
            return getICommonContentManageBusinessServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://business.ccpws.com/", "ICommonContentManageBusinessServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://business.ccpws.com/", "ICommonContentManageBusinessServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ICommonContentManageBusinessServicePort".equals(portName)) {
            setICommonContentManageBusinessServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
