package springBootInitialDemo.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springBootInitialDemo.dto.UserResponseDto;
import springBootInitialDemo.repository.UserRepository;
import springBootInitialDemo.service.IUserService;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public UserResponseDto setUser(String name){
        return userRepository.setUser(name);
    }

    public List<UserResponseDto> findAll(){
        return userRepository.findAll();
    }

    public void deleteById(Integer id){}
}