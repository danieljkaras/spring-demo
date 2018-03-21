package com.infoshareacademy.springdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;

@Component
public class InitialNoteRepository {

    @Autowired
    private NoteRepository noteRepository;

    @PostConstruct
    public void onStartup() {

        noteRepository.save(new Note("First test note", LocalDateTime.now()));
        noteRepository.save(new Note("Second test note", LocalDateTime.now()));
        noteRepository.save(new Note("Third test note", LocalDateTime.now()));
        noteRepository.save(new Note("Fourth test note", LocalDateTime.now()));

        noteRepository.findAllByOrderByDateNowAsc();
    }

}
