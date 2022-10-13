package ru.rusoft.testinglog.data.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Getter
@Setter
@ToString
@Entity
@Table(name = "EXERCISE")
public class Exercise {

    @Id
    private Long id;

    @Column(name = "TITLE", unique = true, nullable = false)
    private String title;

    @Column(name = "DESCRIPTION", unique = true, nullable = false)
    private String description;

    @Column(name = "COMPLEXITY", unique = true, nullable = false)
    private Integer complexity;

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
