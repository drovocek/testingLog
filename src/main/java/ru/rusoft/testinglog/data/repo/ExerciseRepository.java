package ru.rusoft.testinglog.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rusoft.testinglog.data.model.Exercise;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
}
