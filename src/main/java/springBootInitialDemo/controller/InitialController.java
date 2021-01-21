package springBootInitialDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springBootInitialDemo.dto.ProductosDAO2;
import springBootInitialDemo.dto.UserResponseDto;
import springBootInitialDemo.service.IUserService;

import java.util.*;

@RestController
@RequestMapping("/v1")
public class InitialController {

    private final IUserService userService;

    @Autowired
    public InitialController(IUserService userService){
        this.userService = userService;
    }

    //@GetMapping("/")
    /**public String helloWorld() {
        return "HELLO WORLD";
    }**/

    @GetMapping(path="/{name}")
    public String helloWorld(@PathVariable("name") String name) throws Exception {
        return String.format("HELLO %s", name);
    }

    @GetMapping(value = "/user/{uuid}/{name}/{surname}/{dateOfBirth}/{gender}")
    public ResponseEntity<UserResponseDto> updatePrescription(@PathVariable("uuid") String uuid,
                                                              @PathVariable("name") String name,
                                                              @PathVariable("surname") String surname,
                                                              @PathVariable("dateOfBirth") @DateTimeFormat(pattern="dd-MM-yyyy") String dateOfBirth,
                                                              @PathVariable("gender") String gender)
            throws Exception {
        UserResponseDto userResponseDto = userService.setUser(uuid,name,surname,dateOfBirth,gender);

        //Solo aparece por consola
        System.out.println(userResponseDto.getName());
        System.out.println(userResponseDto.getSurname());
        System.out.println(userResponseDto.getDateOfBirth());
        System.out.println(userResponseDto.getGender());
        System.out.println(userResponseDto.getUuid());

        //Devuelve el json por localhost
        return new ResponseEntity<>(userResponseDto, HttpStatus.OK);

    }

    private ProductosDAO2 productosDAO = new ProductosDAO2();

    @GetMapping
    public ResponseEntity<List<String>> getProducto() {
        List<String> productos = productosDAO.findAll();
        return ResponseEntity.ok(productos);
    }

}