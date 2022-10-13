package ru.rusoft.testinglog.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.rusoft.testinglog.data.model.TestInfo;
import ru.rusoft.testinglog.data.repo.TestRepository;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/tests")
public class TestDescriptionApiController {

    private final TestRepository repository;

    @GetMapping
    private List<TestInfo> getAll(){
        return this.repository.findAll();
    }
}
