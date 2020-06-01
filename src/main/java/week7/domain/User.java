package week7.domain;

import java.sql.Timestamp;

public class User {

    protected String nick_name;
    protected Boolean deleted;
    protected Timestamp created_at;
    protected Timestamp updated_at;
    protected Long id;
    protected String account;
    protected String password;

    public Long getId() {
        return id;
    }

    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }

    public String getNick_name() {
        return nick_name;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }


}

