package com.rui.fwb.vo;

public class Student {
    private Integer id;
    private String name;
    private String passwd;
    private Integer cla;
    private String realName;
    private String file;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Integer getCla() {
        return cla;
    }

    public void setCla(Integer cla) {
        this.cla = cla;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", passwd='" + passwd + '\'' +
                ", cla=" + cla +
                ", realName='" + realName + '\'' +
                '}';
    }
}
