package ug.go.ups.recruitment.domain;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@NoArgsConstructor
@Entity
public class SpecialAttribute {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    @OneToOne
    private Applicant applicant;

    public SpecialAttribute(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpecialAttribute that = (SpecialAttribute) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "SpecialAttribute{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
