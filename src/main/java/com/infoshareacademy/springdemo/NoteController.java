package com.infoshareacademy.springdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api")
public class NoteController {

    @Autowired
    private NoteRepository noteRepository;


    @GetMapping("/notes")
    public List<Note> getAllMyNotes() {
        return noteRepository.findAllByOrderByDateNowAsc();
    }

    @GetMapping("/notes/{id}")
    public Optional<Note> getSingleNote(@PathVariable(value = "id") Long noteId) {
        return noteRepository.findById(noteId);
    }

    @PostMapping("/add-note")
    public Note addSingleNote(@RequestBody Note note) {
        return noteRepository.save(note);
    }

    @DeleteMapping("/delete-note/{id}")
    public void deleteNote(@PathVariable(value = "id") Long id) {
        noteRepository.deleteById(id);
    }
}