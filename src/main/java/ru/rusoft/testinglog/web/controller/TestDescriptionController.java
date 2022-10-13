package ru.rusoft.testinglog.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.rusoft.testinglog.data.repo.TestRepository;

@RequiredArgsConstructor
@Controller
@RequestMapping("/tests")
public class TestDescriptionController {

    private final TestRepository repository;

    @GetMapping
    public String mainWithParam(Model model) {
        var testDescriptions = this.repository.findAll();
        model.addAttribute("testInfos", testDescriptions);
        return "tests";
    }
}
