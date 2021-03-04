package springBootInitialDemo.dto;

import org.springframework.stereotype.Component;

@Component
public class UserResponseDto extends ResponseDto {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}