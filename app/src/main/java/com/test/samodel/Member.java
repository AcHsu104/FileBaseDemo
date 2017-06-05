package com.test.samodel;

/**
 * Created by ac on 2016/11/11.
 */

public class Member {

    /**
     * id : cp_member_id
     * email : cp_member_id@gmail.com
     * name : null
     * avatar_url : null
     * personal_url : null
     * membership_type : free
     */

    private String id;
    private String email;
    private String name;
    private String avatar_url;
    private String personal_url;
    private String membership_type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getPersonal_url() {
        return personal_url;
    }

    public void setPersonal_url(String personal_url) {
        this.personal_url = personal_url;
    }

    public String getMembership_type() {
        return membership_type;
    }

    public void setMembership_type(String membership_type) {
        this.membership_type = membership_type;
    }
}
