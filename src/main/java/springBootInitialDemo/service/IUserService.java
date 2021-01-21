package springBootInitialDemo.service;

import springBootInitialDemo.dto.UserResponseDto;

public interface IUserService {

    UserResponseDto setUser(String uuid, String name, String surname, String dateOfBirth, String gender);

    //List<UserResponseDto> getUsers();

    //UserResponseDto addUser(UserResponseDto user);

    //String deleteUser(Long uuid);

    //String updateUser(UserResponseDto userNew);

}
