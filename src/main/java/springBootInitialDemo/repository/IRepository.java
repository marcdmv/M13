package springBootInitialDemo.repository;

import springBootInitialDemo.dto.ResponseDto;

public interface IRepository {

    public ResponseDto setUser(String uuid, String name, String surname, String dateOfBirth, String gender);

}
