package com.geohor.geodeticordersbook.fixtures;

import com.geohor.geodeticordersbook.entity.Role;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RoleInit {


// TODO: 2019-05-16
    public Set<Role> roleList() {
        Set<Role> rolelist = new HashSet<>();
        rolelist.add(new Role("ADMIN"));
        rolelist.add(new Role("GEODESY"));
        rolelist.add(new Role("GENERAL_CONSTRUCTOR"));
        rolelist.add(new Role("SUBCONSTRUCTOR"));
        return rolelist;
    }


}
