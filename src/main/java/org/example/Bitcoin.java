    package org.example;

    import java.util.Date;

    public class Bitcoin {
    private String transactionId;
    private Date transactionDate;

    public Bitcoin(String transactionId) {
        this.transactionId = transactionId;
        this.transactionDate = new Date();
    }

    public String getTransactionId() {
        return transactionId;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    @Override
     public String toString() {
        return "Bitcoin Transaction ID: " + transactionId + " on " + transactionDate.toString();
    }
    }


