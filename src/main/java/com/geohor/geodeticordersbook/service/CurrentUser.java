package com.geohor.geodeticordersbook.service;


import org.springframework.security.core.userdetails.User;
import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;


public class CurrentUser extends User {

    private final com.geohor.geodeticordersbook.entity.User user;


    public CurrentUser(String username, String password, Collection<? extends GrantedAuthority> authorities,
                       com.geohor.geodeticordersbook.entity.User user) {
        super(username, password, authorities);
        this.user = user;
    }

    public com.geohor.geodeticordersbook.entity.User getUser() {return user;}

}
