package javabasic;

public class Owner {

    private String idNum;
    private String name;
    private String address;
    private String sex;

    public Owner(String idNum, String name, String address, String sex) {
        this.idNum = idNum;
        this.name = name;
        this.address = address;
        this.sex = sex;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}
