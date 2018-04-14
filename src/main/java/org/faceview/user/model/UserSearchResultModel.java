package org.faceview.user.model;

import javax.validation.constraints.NotEmpty;

public class UserSearchResultModel {

    @NotEmpty
    private String username;

    @NotEmpty
    private String id;

    public UserSearchResultModel() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
