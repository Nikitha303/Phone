package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Mobile;

public interface MobileRepository extends CrudRepository<Mobile, Integer> {

}
