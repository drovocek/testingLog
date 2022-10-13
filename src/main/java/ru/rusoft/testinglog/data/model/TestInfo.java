package ru.rusoft.testinglog.data.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString(exclude = "exercises")
@Entity
@Table(name = "TEST_INFO")
public class TestInfo {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "TITLE", unique = true, nullable = false)
    private String title;

    @Column(name = "DESCRIPTION", unique = true, nullable = false)
    private String description;

    @Transient
    private int complexity;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "TEST_INFO_EXERCISE",
            joinColumns = @JoinColumn(name = "TEST_INFO_ID"),
            inverseJoinColumns = @JoinColumn(name = "EXERCISE_ID"))
    private List<Exercise> exercises;

    @PostLoad
    private void calculate() {
        this.complexity = this.exercises.stream()
                .mapToInt(Exercise::getComplexity)
                .sum() / this.exercises.size();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestInfo that = (TestInfo) o;
        return id.equals(that.id) && title.equals(that.title) && description.equals(that.description) && Objects.equals(complexity, that.complexity) && Objects.equals(exercises, that.exercises);
    }
}
