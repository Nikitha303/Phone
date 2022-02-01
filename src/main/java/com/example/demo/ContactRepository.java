package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Contact;

public interface ContactRepository extends CrudRepository<Contact, Integer> {

}
