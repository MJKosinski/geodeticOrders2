package com.geohor.geodeticordersbook.fixtures;


import com.geohor.geodeticordersbook.entity.Role;
import com.geohor.geodeticordersbook.entity.User;
import com.geohor.geodeticordersbook.myenum.UserType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class UserInit {
    
@Autowired
BCryptPasswordEncoder passwordEncoder;


//    public List<User> createUsers() {
//
//        List<User> users = new ArrayList<>();
//        User geoUser = new User();
//        geoUser.setName("admin");
//        geoUser.setEmail("admin@admin.pl");
//        geoUser.setPassword(passwordEncoder.encode("admin"));
//        geoUser.setEnabled(1);
//        geoUser.setRoles();
//        users.add(geoUser);

//        User generalCUser = new User();
//        generalCUser.setName("generalny_wykonawca");
//        generalCUser.setEmail("gw@gw.pl");
//        generalCUser.setPassword(BCrypt.hashpw("123", BCrypt.gensalt()));
//        generalCUser.setType(UserType.GENERAL_CONTRACTOR);
//        users.add(generalCUser);
//
//        User sub1User = new User();
//        sub1User.setName("Podwykonawca-1");
//        sub1User.setEmail("sub1@gw.pl");
//        sub1User.setPassword(BCrypt.hashpw("123", BCrypt.gensalt()));
//        sub1User.setType(UserType.SUBCONTRACTOR);
//        users.add(sub1User);
//
//        User sub2User = new User();
//        sub2User.setName("Podwykonawca-2");
//        sub2User.setEmail("sub2@gw.pl");
//        sub2User.setPassword(BCrypt.hashpw("123", BCrypt.gensalt()));
//        sub2User.setType(UserType.SUBCONTRACTOR);
//        users.add(sub2User);
//
//
//
//        return users;
//    }
    
    
    
}
