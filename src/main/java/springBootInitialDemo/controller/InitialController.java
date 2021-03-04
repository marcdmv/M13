package springBootInitialDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping(path="/{name}")
    public String helloWorld(@PathVariable("name") String name) throws Exception {
        return String.format("HELLO %s", name);
    }

    //CREATE
    @GetMapping(value="/create/{name}")
    public ResponseEntity<UserResponseDto> updatePrescription(@PathVariable("name") String name) throws Exception {
        UserResponseDto userResponseDto = userService.setUser(name);
        return new ResponseEntity<>(userResponseDto, HttpStatus.OK);
    }

    //READ
    @GetMapping(path="/read")
    public ResponseEntity<List<UserResponseDto>> getUsers() {
        List<UserResponseDto> lista = userService.findAll();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    //UPDATE
    //@GetMapping(path="/update/{id}")


    //DELETE
    @GetMapping(path="/delete/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        //productosDAO.deleteById(id);
        userService.deleteById(id);
    }

    /**
    private ProductosDAO2 productosDAO = new ProductosDAO2();

    @GetMapping
    public ResponseEntity<List<String>> getProducto() {
        List<String> productos = productosDAO.findAll();
        return new ResponseEntity<>(productos, HttpStatus.OK);
    }
    **/
}