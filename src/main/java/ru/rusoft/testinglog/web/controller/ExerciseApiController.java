package ru.rusoft.testinglog.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.rusoft.testinglog.data.model.Exercise;
import ru.rusoft.testinglog.data.repo.ExerciseRepository;
import ru.rusoft.testinglog.web.dto.ExerciseDto;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/exercises")
public class ExerciseApiController {

    private final ExerciseRepository repository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Long add(@RequestBody ExerciseDto exerciseDto) {
        System.out.println(exerciseDto);
        Exercise saved = this.repository.save(
                new Exercise(exerciseDto.title(), exerciseDto.description(), exerciseDto.complexity()));
        return saved.getId();
    }
}
