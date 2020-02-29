package com.example.accountmanager.bean;

public class UnbackBean {
    private long backMoney;//账目金额
    private String createTime;//创建时间
    private String updateTime;//最后更新时间
    private String debtUser;//赊账人
    private String remark;//备注

    private boolean heard;//是不是头

    public UnbackBean(long backMoney, String createTime, String updateTime, String debtUser,boolean b) {
        this.backMoney = backMoney;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.debtUser = debtUser;
        heard = b;
    }

    public long getBackMoney() {
        return backMoney;
    }

    public boolean isHeard() {
        return heard;
    }

    public void setHeard(boolean heard) {
        this.heard = heard;
    }

    public void setBackMoney(long backMoney) {
        this.backMoney = backMoney;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getDebtUser() {
        return debtUser;
    }

    public void setDebtUser(String debtUser) {
        this.debtUser = debtUser;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
