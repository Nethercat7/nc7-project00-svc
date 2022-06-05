package com.nc7.project00.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Bill {
    private String id;
    private String tag;
    private BigDecimal amount;
    private String addUsername;
    private String status;
    private Date billDate;
    private String billType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getAddUsername() {
        return addUsername;
    }

    public void setAddUsername(String addUsername) {
        this.addUsername = addUsername;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }
}
