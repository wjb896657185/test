package com.itgaoshu.service.impl;
import com.itgaoshu.bean.User;
import com.itgaoshu.mapper.UserMapper;
import com.itgaoshu.service.UserService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Cacheable("selectuser")
    public List<User> selectuser(){
       System.out.println("第一次走,第二次没走");
        return  userMapper.selectAll();
    }

}
