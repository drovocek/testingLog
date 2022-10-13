package ru.rusoft.testinglog.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rusoft.testinglog.data.model.TestInfo;

public interface TestRepository extends JpaRepository<TestInfo,Long> {
}
