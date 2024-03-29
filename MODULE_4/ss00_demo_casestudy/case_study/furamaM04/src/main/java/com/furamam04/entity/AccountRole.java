package com.furamam04.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class AccountRole {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "account_name")
    private Account account;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    public AccountRole() {
    }

    public AccountRole(Account account, Role role) {
        this.account = account;
        this.role = role;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
