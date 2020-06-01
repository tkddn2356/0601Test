package week7.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import week7.domain.User;
import week7.repository.UserMapper;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }
}
