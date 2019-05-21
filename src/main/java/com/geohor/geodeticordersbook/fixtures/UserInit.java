package com.geohor.geodeticordersbook.fixtures;


import com.geohor.geodeticordersbook.entity.Role;
import com.geohor.geodeticordersbook.entity.User;
import com.geohor.geodeticordersbook.myenum.UserType;
import com.geohor.geodeticordersbook.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class UserInit {
    
@Autowired
BCryptPasswordEncoder passwordEncoder;

@Autowired
RoleRepository roleRepository;

@Autowired
RoleInit roleInit;


    public List<User> createUsers() {

        List<User> users = new ArrayList<>();
        Role admin = roleRepository.findByName("ROLE_ADMIN");
        Role geodesy = roleRepository.findByName("ROLE_GEODESY");
        Role gw = roleRepository.findByName("ROLE_GENERAL_CONSTRUCTOR");
        Role sub = roleRepository.findByName("ROLE_SUBCONSTRUCTOR");

        User geoUser = new User();
        geoUser.setName("geo");
        geoUser.setEmail("geo@geo.pl");
        geoUser.setPassword(passwordEncoder.encode("geo"));
        geoUser.setEnabled(1);
        Set<Role> geoUserSet = new HashSet<>();
        geoUserSet.add(geodesy);
        geoUser.setRoles(geoUserSet);
        users.add(geoUser);

        User adminUser = new User();
        adminUser.setName("admin");
        adminUser.setEmail("admin@admin.pl");
        adminUser.setPassword(passwordEncoder.encode("admin"));
        adminUser.setEnabled(1);
        Set<Role> adminUserSet = new HashSet<>();
        adminUserSet.add(admin);
        adminUser.setRoles(adminUserSet);
        users.add(adminUser);

        return users;
    }
    
    
    
}
