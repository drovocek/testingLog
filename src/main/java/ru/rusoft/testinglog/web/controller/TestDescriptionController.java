package ru.rusoft.testinglog.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.rusoft.testinglog.data.model.Exercise;
import ru.rusoft.testinglog.data.model.TestInfo;
import ru.rusoft.testinglog.data.repo.TestRepository;
import ru.rusoft.testinglog.web.dto.ExerciseDto;
import ru.rusoft.testinglog.web.dto.TestInfoDto;

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

    @PostMapping
    public ModelAndView mainWithParam(TestInfoDto testInfoDto) {
        this.repository.save(
                new TestInfo(testInfoDto.title(), testInfoDto.description()));
        return new ModelAndView("redirect:/tests");
    }
}
