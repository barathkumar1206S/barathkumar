package com.chainsys.mavenlessons.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity; import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="Passports")
public class Passport {
    @Id
    @Column(name="PASSPORT_NUMBER")
    private int id;
    @Column(name="PASSPORT_DATE")
    private Date date;
    @Column(name="User_NO")
    private int userId;
    
    @OneToOne
    @JoinColumn(name="USER_NO" , nullable = false, insertable = false,updatable = false)
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}