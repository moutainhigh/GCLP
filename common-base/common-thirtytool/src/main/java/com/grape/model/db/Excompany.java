package com.grape.model.db;

import java.io.Serializable;

public class Excompany implements Serializable {
    private String comno;

    private String comname;

    private String username;

    private String password;

    private String userkeyid;

    private String accesskey;

    private String conid;

    private String url1;

    private String url2;

    private String url3;

    private String url4;

    private String url5;

    private static final long serialVersionUID = 1L;

    public String getComno() {
        return comno;
    }

    public void setComno(String comno) {
        this.comno = comno == null ? null : comno.trim();
    }

    public String getComname() {
        return comname;
    }

    public void setComname(String comname) {
        this.comname = comname == null ? null : comname.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUserkeyid() {
        return userkeyid;
    }

    public void setUserkeyid(String userkeyid) {
        this.userkeyid = userkeyid == null ? null : userkeyid.trim();
    }

    public String getAccesskey() {
        return accesskey;
    }

    public void setAccesskey(String accesskey) {
        this.accesskey = accesskey == null ? null : accesskey.trim();
    }

    public String getConid() {
        return conid;
    }

    public void setConid(String conid) {
        this.conid = conid == null ? null : conid.trim();
    }

    public String getUrl1() {
        return url1;
    }

    public void setUrl1(String url1) {
        this.url1 = url1 == null ? null : url1.trim();
    }

    public String getUrl2() {
        return url2;
    }

    public void setUrl2(String url2) {
        this.url2 = url2 == null ? null : url2.trim();
    }

    public String getUrl3() {
        return url3;
    }

    public void setUrl3(String url3) {
        this.url3 = url3 == null ? null : url3.trim();
    }

    public String getUrl4() {
        return url4;
    }

    public void setUrl4(String url4) {
        this.url4 = url4 == null ? null : url4.trim();
    }

    public String getUrl5() {
        return url5;
    }

    public void setUrl5(String url5) {
        this.url5 = url5 == null ? null : url5.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Excompany other = (Excompany) that;
        return (this.getComno() == null ? other.getComno() == null : this.getComno().equals(other.getComno()))
            && (this.getComname() == null ? other.getComname() == null : this.getComname().equals(other.getComname()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getUserkeyid() == null ? other.getUserkeyid() == null : this.getUserkeyid().equals(other.getUserkeyid()))
            && (this.getAccesskey() == null ? other.getAccesskey() == null : this.getAccesskey().equals(other.getAccesskey()))
            && (this.getConid() == null ? other.getConid() == null : this.getConid().equals(other.getConid()))
            && (this.getUrl1() == null ? other.getUrl1() == null : this.getUrl1().equals(other.getUrl1()))
            && (this.getUrl2() == null ? other.getUrl2() == null : this.getUrl2().equals(other.getUrl2()))
            && (this.getUrl3() == null ? other.getUrl3() == null : this.getUrl3().equals(other.getUrl3()))
            && (this.getUrl4() == null ? other.getUrl4() == null : this.getUrl4().equals(other.getUrl4()))
            && (this.getUrl5() == null ? other.getUrl5() == null : this.getUrl5().equals(other.getUrl5()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getComno() == null) ? 0 : getComno().hashCode());
        result = prime * result + ((getComname() == null) ? 0 : getComname().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getUserkeyid() == null) ? 0 : getUserkeyid().hashCode());
        result = prime * result + ((getAccesskey() == null) ? 0 : getAccesskey().hashCode());
        result = prime * result + ((getConid() == null) ? 0 : getConid().hashCode());
        result = prime * result + ((getUrl1() == null) ? 0 : getUrl1().hashCode());
        result = prime * result + ((getUrl2() == null) ? 0 : getUrl2().hashCode());
        result = prime * result + ((getUrl3() == null) ? 0 : getUrl3().hashCode());
        result = prime * result + ((getUrl4() == null) ? 0 : getUrl4().hashCode());
        result = prime * result + ((getUrl5() == null) ? 0 : getUrl5().hashCode());
        return result;
    }
}