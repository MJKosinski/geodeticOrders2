package com.geohor.geodeticordersbook.fixtures;

import com.geohor.geodeticordersbook.entity.Role;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class RoleInit {


    public Set<Role> roleList() {
        Set<Role> rolelist = new HashSet<>();
        rolelist.add(new Role("ADMIN"));
        rolelist.add(new Role("GEODESY"));
        rolelist.add(new Role("GENERAL_CONSTRUCTOR"));
        rolelist.add(new Role("SUBCONSTRUCTOR"));
        return rolelist;
    }

}
