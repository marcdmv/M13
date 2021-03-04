package springBootInitialDemo.service;

import springBootInitialDemo.dto.UserResponseDto;

import java.util.List;

public interface IUserService {

    UserResponseDto setUser(String name);

    List<UserResponseDto> findAll();

    void deleteById(Integer id);

    //List<UserResponseDto> getUsers();

    //UserResponseDto addUser(UserResponseDto user);

    //String deleteUser(Long uuid);

    //String updateUser(UserResponseDto userNew);

}
