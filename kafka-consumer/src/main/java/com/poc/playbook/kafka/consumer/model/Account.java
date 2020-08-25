package com.poc.playbook.kafka.consumer.model;

@SuppressWarnings({ "pmd:ImplementEqualsHashCodeOnValueObjects", "squid:S1068", "pmd:SingularField" })
public class Account {

    private String accountId;
    private String bic;
    private String currency;
    private String format;
    private String accountProfileEdo;
    private String type;

    public Account(String accountId, String bic, String currency, String format, String accountProfileEdo, String type) {
        this.accountId = accountId;
        this.bic = bic;
        this.currency = currency;
        this.format = format;
        this.accountProfileEdo = accountProfileEdo;
        this.type = type;
    }

    public Account() {
    }

    public String getAccountProfileEdo() {
        return accountProfileEdo;
    }

    public void setAccountProfileEdo(String accountProfileEdo) {
        this.accountProfileEdo = accountProfileEdo;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Account{" + "accountId='" + accountId + '\'' + ", bic='" + bic + '\'' + ", currency='" + currency + '\'' + ", format='" + format
                + '\'' + ", accountProfileEdo='" + accountProfileEdo + '\'' + ", type='" + type + '\'' + '}';
    }
}
