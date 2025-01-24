package org.example.stream;

public class Transaction {
    private String transactionId;
    private String description;
    private double amount;
    private String date; // You could also use LocalDate or LocalDateTime for better date handling
    private TransactionType type;

    public Transaction(String transactionId, String description, double amount, String date, TransactionType type) {
        this.transactionId = transactionId;
        this.description = description;
        this.amount = amount;
        this.date = date;
        this.type = type;
    }

    // Getters and Setters
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                ", date='" + date + '\'' +
                ", type=" + type +
                '}';
    }
}
enum TransactionType {
    GROCERY,
    UTILITIES,
    ENTERTAINMENT,
    TRANSPORTATION,
    OTHER
}


