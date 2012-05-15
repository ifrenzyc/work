package me.yangc.maven_test.fastjson;

import java.util.Date;
import java.io.Serializable;

public class DemoBean implements Serializable {

    private long id;
    private String name;
    private Date birthdate;
    private String birthdateText;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getBirthdateText() {
        return "";
    }

}
