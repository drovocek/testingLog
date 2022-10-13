package ru.rusoft.testinglog.data.model;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "EXERCISE")
public class Exercise {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "TITLE", unique = true, nullable = false)
    private String title;

    @Column(name = "DESCRIPTION", nullable = false)
    private String description;

    @Column(name = "COMPLEXITY", nullable = false)
    private Integer complexity;

    public Exercise(String title, String description, Integer complexity) {
        this.title = title;
        this.description = description;
        this.complexity = complexity;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
