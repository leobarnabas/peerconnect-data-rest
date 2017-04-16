package org.pcg.model;

import org.springframework.data.annotation.Id;

/**
 * Created by Leo on 4/16/2017.
 */
public class Subscriber {
    @Id
    public String id;
    private String email;

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
}
