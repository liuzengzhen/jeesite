package com.ccpws.business;

public class ICommonContentManageBusinessServiceProxy implements com.ccpws.business.ICommonContentManageBusinessService {
  private String _endpoint = null;
  private com.ccpws.business.ICommonContentManageBusinessService iCommonContentManageBusinessService = null;
  
  public ICommonContentManageBusinessServiceProxy() {
    _initICommonContentManageBusinessServiceProxy();
  }
  
  public ICommonContentManageBusinessServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initICommonContentManageBusinessServiceProxy();
  }
  
  private void _initICommonContentManageBusinessServiceProxy() {
    try {
      iCommonContentManageBusinessService = (new com.ccpws.business.ICommonContentManageBusinessServiceServiceLocator()).getICommonContentManageBusinessServicePort();
      if (iCommonContentManageBusinessService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iCommonContentManageBusinessService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iCommonContentManageBusinessService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iCommonContentManageBusinessService != null)
      ((javax.xml.rpc.Stub)iCommonContentManageBusinessService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ccpws.business.ICommonContentManageBusinessService getICommonContentManageBusinessService() {
    if (iCommonContentManageBusinessService == null)
      _initICommonContentManageBusinessServiceProxy();
    return iCommonContentManageBusinessService;
  }
  
  public com.ccpws.business.WscsDocumentPermissionResultVo setDocumentPermission(java.lang.String callId, java.lang.String sessionId, java.lang.String id, com.ccpws.business.Grantee[] granteeList) throws java.rmi.RemoteException{
    if (iCommonContentManageBusinessService == null)
      _initICommonContentManageBusinessServiceProxy();
    return iCommonContentManageBusinessService.setDocumentPermission(callId, sessionId, id, granteeList);
  }
  
  public com.ccpws.business.WscsUpdateDocumentContentResultVo updateDocumentContent(java.lang.String callId, java.lang.String sessionId, java.lang.String id, byte[] fileData) throws java.rmi.RemoteException{
    if (iCommonContentManageBusinessService == null)
      _initICommonContentManageBusinessServiceProxy();
    return iCommonContentManageBusinessService.updateDocumentContent(callId, sessionId, id, fileData);
  }
  
  public com.ccpws.business.WscsBulkUploadResultVo bulkUpload4DocumentWithProps(java.lang.String callId, java.lang.String sessionId, java.lang.String symbolicName, byte[] fileData, com.ccpws.business.PropertyInfo[] propertyInfos, java.lang.String path, java.lang.String documentTitle) throws java.rmi.RemoteException{
    if (iCommonContentManageBusinessService == null)
      _initICommonContentManageBusinessServiceProxy();
    return iCommonContentManageBusinessService.bulkUpload4DocumentWithProps(callId, sessionId, symbolicName, fileData, propertyInfos, path, documentTitle);
  }
  
  public com.ccpws.business.WscsSearchDocumentResultVo getDocumentHistory(java.lang.String callId, java.lang.String sessionId, java.lang.String id) throws java.rmi.RemoteException{
    if (iCommonContentManageBusinessService == null)
      _initICommonContentManageBusinessServiceProxy();
    return iCommonContentManageBusinessService.getDocumentHistory(callId, sessionId, id);
  }
  
  public com.ccpws.business.WscsDeleteDocumentResultVo deleteDocument(java.lang.String callId, java.lang.String sessionId, java.lang.String id) throws java.rmi.RemoteException{
    if (iCommonContentManageBusinessService == null)
      _initICommonContentManageBusinessServiceProxy();
    return iCommonContentManageBusinessService.deleteDocument(callId, sessionId, id);
  }
  
  public com.ccpws.business.WscsRetrieveDocumentpropertysResultVo updateDocumentProperties(java.lang.String callId, java.lang.String sessionId, java.lang.String id, com.ccpws.business.PropertyInfo[] propertyInfos) throws java.rmi.RemoteException{
    if (iCommonContentManageBusinessService == null)
      _initICommonContentManageBusinessServiceProxy();
    return iCommonContentManageBusinessService.updateDocumentProperties(callId, sessionId, id, propertyInfos);
  }
  
  public com.ccpws.business.WscsSearchDocumentResultVo searchDocumentInfos(java.lang.String callId, java.lang.String sessionId, com.ccpws.business.SearchConditionVo[] searchConditionVos, com.ccpws.business.Pagination pagination, java.lang.String symbolicName) throws java.rmi.RemoteException{
    if (iCommonContentManageBusinessService == null)
      _initICommonContentManageBusinessServiceProxy();
    return iCommonContentManageBusinessService.searchDocumentInfos(callId, sessionId, searchConditionVos, pagination, symbolicName);
  }
  
  public com.ccpws.business.WscsBulkDownloadResultVo bulkDownload(java.lang.String callId, java.lang.String sessionId, java.lang.String id) throws java.rmi.RemoteException{
    if (iCommonContentManageBusinessService == null)
      _initICommonContentManageBusinessServiceProxy();
    return iCommonContentManageBusinessService.bulkDownload(callId, sessionId, id);
  }
  
  
}