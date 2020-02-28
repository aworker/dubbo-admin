package org.apache.dubbo.admin.model.domain;

/**
 * @author limingyuan001
 * @createtime 2019/7/8
 * @description 配置中心实例
 */
public class Config {


    private String address;

    private String group;

    private String username;

    private String password;


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
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
}
