package com.charter.ews.store.data.logging;

public interface TransactionRequest {
    String getTransactionId();
    String getClientId();
    String getSessionId();
    String getUserId();

    void setTransactionId(String transactionId);
    
    void setClientId(String clientId);
    
    void setSessionId(String sessionId);
    
    void setUserId(String userId);
}