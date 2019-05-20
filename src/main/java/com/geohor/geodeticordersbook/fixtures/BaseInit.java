package com.geohor.geodeticordersbook.fixtures;


import com.geohor.geodeticordersbook.repository.RoleRepository;
import com.geohor.geodeticordersbook.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Component
public class BaseInit {


    @Autowired
    RoleRepository roleRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleInit roleInit;

    @Autowired
    UserInit userInit;


    @PostConstruct
    public void insertIntoDB() {
        roleRepository.save(roleInit.roleList());
        userRepository.save(userInit.createUsers());


    }


}
