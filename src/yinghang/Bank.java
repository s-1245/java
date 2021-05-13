package yinghang;

public class Bank {
    private long kahao;
    private String name;

    public long getKahao() {
        return kahao;
    }

    public void setKahao(long kahao) {
        this.kahao = kahao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bank(long kahao, String name) {
        this.kahao = kahao;
        this.name = name;
    }
}
