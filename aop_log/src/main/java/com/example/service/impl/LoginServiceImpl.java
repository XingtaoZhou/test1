package com.example.service.impl;

import com.example.domain.Permissions;
import com.example.domain.Role;
import com.example.domain.User;
import com.example.service.LoginService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class LoginServiceImpl implements LoginService {
    @Override
    public User getUserByName(String getMapByName) {
        return getMapByName(getMapByName);
    }

    private User getMapByName(String userName) {

        //创建权限
        Permissions permissions1 = new Permissions("1","query");
        Permissions permissions2 = new Permissions("2","add");
        Set<Permissions> permissionsSet1 = new HashSet<>();
        permissionsSet1.add(permissions1);
        permissionsSet1.add(permissions2);
        Set<Permissions> permissionsSet2 = new HashSet<>();
        permissionsSet2.add(permissions1);
        //创建admin角色,拥有query和add权限
        Role role1 = new Role("1","admin",permissionsSet1);
        Set<Role> roleSet1 = new HashSet<>();
        roleSet1.add(role1);
        //创建user角色，拥有query权限
        Role role2 = new Role("2","user",permissionsSet2);
        Set<Role> roleSet2 = new HashSet<>();
        roleSet2.add(role2);
        //创建admin用户
        User user1 = new User("1","zs","123",roleSet1);
        //创建user用户
        User user2 = new User("2","ls","456",roleSet2);

        //将两个用户放到map中，根据name模拟从数据库中取得用户
        Map<String ,User> map = new HashMap<>();
        map.put(user1.getUserName(),user1);
        map.put(user2.getUserName(),user2);

        return map.get(userName);
    }
}














