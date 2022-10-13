package ru.rusoft.testinglog.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.rusoft.testinglog.data.repo.ExerciseRepository;
import ru.rusoft.testinglog.data.repo.TestRepository;

@RequiredArgsConstructor
@Controller
@RequestMapping("/exercises")
public class ExerciseController {

    private final ExerciseRepository repository;

    @GetMapping
    public String mainWithParam(Model model) {
        var testDescriptions = this.repository.findAll();
        model.addAttribute("exercises", testDescriptions);
        return "exercises";
    }
}
