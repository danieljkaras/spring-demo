package com.infoshareacademy.springdemo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface NoteRepository extends CrudRepository<Note, Long> {

    List<Note> findAllByOrderByDateNowAsc();

}
