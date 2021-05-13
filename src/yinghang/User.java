package yinghang;

/*
*  角色
*  任务
*  交易
*
* */

public class User {
    private String id;
    private String passwd;
    private Bank band;
    private float maney;

    public float getManey() {
        return maney;
    }

    public void setManey(float maney) {
        this.maney = maney;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Bank getBand() {
        return band;
    }

    public void setBand(Bank band) {
        this.band = band;
    }

    public User(String id, String passwd, Bank band,float maney) {
        this.id = id;
        this.passwd = passwd;
        this.band = band;
    }
}
