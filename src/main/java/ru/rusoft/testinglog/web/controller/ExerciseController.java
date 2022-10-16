package ru.rusoft.testinglog.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.rusoft.testinglog.data.model.Exercise;
import ru.rusoft.testinglog.data.repo.ExerciseRepository;
import ru.rusoft.testinglog.web.dto.ExerciseDto;

@RequiredArgsConstructor
@Controller
@RequestMapping("/exercises")
public class ExerciseController {

    private final ExerciseRepository repository;

    @GetMapping
    public String getAll(Model model) {
        var testDescriptions = this.repository.findAll();
        model.addAttribute("exercises", testDescriptions);
        return "exercises";
    }

    @PostMapping
    public ExerciseDto add(@RequestBody ExerciseDto exerciseDto) {
        System.out.println(exerciseDto);
        Exercise saved = this.repository.save(
                new Exercise(exerciseDto.title(), exerciseDto.description(), exerciseDto.complexity()));
        return new ExerciseDto(saved.getId(), saved.getTitle(), saved.getDescription(), saved.getComplexity());
    }
}
