package springBootInitialDemo.repository;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import springBootInitialDemo.dto.UserResponseDto;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class UserRepository implements IRepository, JpaRepository {

    @Autowired
    private UserResponseDto userResponseDto;

    List<UserResponseDto> lista = new ArrayList<UserResponseDto>();

    public UserResponseDto setUser (String name){
        userResponseDto.setName(name);
        lista.add(userResponseDto);
        return userResponseDto;
    }

    @Override
    public List<UserResponseDto> findAll(){
        return lista;
    }

    public void deleteById(Integer id){
        lista.remove(id);
    }

    @Override
    public List<UserResponseDto> findAll(Sort sort) {
        return lista;
    }

    @Override
    public List findAllById(Iterable iterable) {
        return null;
    }

    @Override
    public List saveAll(Iterable entities) {
        return null;
    }

    @Override
    public void flush() {

    }

    @Override
    public Object saveAndFlush(Object entity) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable entities) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Object getOne(Object o) {
        return null;
    }

    @Override
    public List findAll(Example example) {
        return null;
    }

    @Override
    public List findAll(Example example, Sort sort) {
        return null;
    }

    @Override
    public Page findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Object save(Object entity) {
        return null;
    }

    @Override
    public Optional findById(Object o) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Object o) {
        return false;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Object o) {

    }

    @Override
    public void delete(Object entity) {

    }

    @Override
    public void deleteAll(Iterable entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public Optional findOne(Example example) {
        return Optional.empty();
    }

    @Override
    public Page findAll(Example example, Pageable pageable) {
        return null;
    }

    @Override
    public long count(Example example) {
        return 0;
    }

    @Override
    public boolean exists(Example example) {
        return false;
    }
}
