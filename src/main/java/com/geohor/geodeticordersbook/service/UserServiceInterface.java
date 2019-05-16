package com.geohor.geodeticordersbook.service;

import com.geohor.geodeticordersbook.entity.User;

public interface UserServiceInterface {
    User findByUserName(String name);
    void saveUser(User user);
}
