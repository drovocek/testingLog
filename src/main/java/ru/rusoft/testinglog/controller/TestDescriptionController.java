package ru.rusoft.testinglog.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.rusoft.testinglog.data.model.TestDescription;
import ru.rusoft.testinglog.data.repo.TestRepository;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/tests")
public class TestDescriptionController {

    private final TestRepository repository;

    @GetMapping
    private List<TestDescription> getAll(){
        return this.repository.findAll();
    }
}
