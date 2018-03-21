package com.infoshareacademy.springdemo;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;


@Entity
@Table(name = "NOTES")
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "CONTENT")
    @NotNull
    private String content;


    @Column(name = "DATE")
    @NotNull
    private LocalDateTime dateNow;

    public Note() {

    }

    public Note(@NotNull String content, @NotNull LocalDateTime dateNow) {
        this.content = content;
        this.dateNow = dateNow;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getDateNow() {
        return dateNow;
    }

    public void setDateNow(LocalDateTime dateNow) {
        this.dateNow = dateNow;
    }
}
