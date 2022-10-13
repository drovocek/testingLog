package ru.rusoft.testinglog.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rusoft.testinglog.data.model.TestDescription;

public interface TestRepository extends JpaRepository<TestDescription,Long> {
}
