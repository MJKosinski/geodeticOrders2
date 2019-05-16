package com.geohor.geodeticordersbook.fixtures;


import com.geohor.geodeticordersbook.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Component
public class BaseInit {


    @Autowired
    RoleRepository roleRepository;
    public RoleInit roleInit = new RoleInit();


    @PostConstruct
    public void insertIntoDB() {
        roleRepository.save(roleInit.roleList());

    }


}
