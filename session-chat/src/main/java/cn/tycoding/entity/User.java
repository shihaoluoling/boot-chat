package cn.tycoding.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author tycoding
 * @date 2019-06-13
 */
@Data
public class User implements Serializable {

    private Long id;

    private String name;

    private String avatar;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
