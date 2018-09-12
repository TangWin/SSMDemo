package com.tang.model;

import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author TW
 */
public class Users {

    private int userId;
    private String username;
    private String password;
    private String phone;
    private String enabled;
    private String accountNonExpired;
    private String accountNonLocked;
    private String credentialsNonExpired;
    private String createBy;
    private Timestamp createTime;
    private String remark;
    private Timestamp lastLoginTime;
    private Timestamp vipValidDate;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public String getAccountNonExpired() {
        return accountNonExpired;
    }

    public void setAccountNonExpired(String accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    public String getAccountNonLocked() {
        return accountNonLocked;
    }

    public void setAccountNonLocked(String accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    public String getCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    public void setCredentialsNonExpired(String credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Timestamp getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Timestamp lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Timestamp getVipValidDate() {
        return vipValidDate;
    }

    public void setVipValidDate(Timestamp vipValidDate) {
        this.vipValidDate = vipValidDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return userId == users.userId &&
                Objects.equals(username, users.username) &&
                Objects.equals(password, users.password) &&
                Objects.equals(phone, users.phone) &&
                Objects.equals(enabled, users.enabled) &&
                Objects.equals(accountNonExpired, users.accountNonExpired) &&
                Objects.equals(accountNonLocked, users.accountNonLocked) &&
                Objects.equals(credentialsNonExpired, users.credentialsNonExpired) &&
                Objects.equals(createBy, users.createBy) &&
                Objects.equals(createTime, users.createTime) &&
                Objects.equals(remark, users.remark) &&
                Objects.equals(lastLoginTime, users.lastLoginTime) &&
                Objects.equals(vipValidDate, users.vipValidDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userId, username, password, phone, enabled, accountNonExpired, accountNonLocked, credentialsNonExpired, createBy, createTime, remark, lastLoginTime, vipValidDate);
    }
}
