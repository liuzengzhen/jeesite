/**
 * ICommonContentManageBusinessService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ccpws.business;

public interface ICommonContentManageBusinessService extends java.rmi.Remote {
    public com.ccpws.business.WscsDocumentPermissionResultVo setDocumentPermission(java.lang.String callId, java.lang.String sessionId, java.lang.String id, com.ccpws.business.Grantee[] granteeList) throws java.rmi.RemoteException;
    public com.ccpws.business.WscsUpdateDocumentContentResultVo updateDocumentContent(java.lang.String callId, java.lang.String sessionId, java.lang.String id, byte[] fileData) throws java.rmi.RemoteException;
    public com.ccpws.business.WscsBulkUploadResultVo bulkUpload4DocumentWithProps(java.lang.String callId, java.lang.String sessionId, java.lang.String symbolicName, byte[] fileData, com.ccpws.business.PropertyInfo[] propertyInfos, java.lang.String path, java.lang.String documentTitle) throws java.rmi.RemoteException;
    public com.ccpws.business.WscsSearchDocumentResultVo getDocumentHistory(java.lang.String callId, java.lang.String sessionId, java.lang.String id) throws java.rmi.RemoteException;
    public com.ccpws.business.WscsDeleteDocumentResultVo deleteDocument(java.lang.String callId, java.lang.String sessionId, java.lang.String id) throws java.rmi.RemoteException;
    public com.ccpws.business.WscsRetrieveDocumentpropertysResultVo updateDocumentProperties(java.lang.String callId, java.lang.String sessionId, java.lang.String id, com.ccpws.business.PropertyInfo[] propertyInfos) throws java.rmi.RemoteException;
    public com.ccpws.business.WscsSearchDocumentResultVo searchDocumentInfos(java.lang.String callId, java.lang.String sessionId, com.ccpws.business.SearchConditionVo[] searchConditionVos, com.ccpws.business.Pagination pagination, java.lang.String symbolicName) throws java.rmi.RemoteException;
    public com.ccpws.business.WscsBulkDownloadResultVo bulkDownload(java.lang.String callId, java.lang.String sessionId, java.lang.String id) throws java.rmi.RemoteException;
}
