package ug.go.ups.recruitment.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;
import java.util.Set;

@Entity
public class SpecialAttNotes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String notes;
    private SpecialAttribute specialAttribute;

    public SpecialAttNotes(String notes, SpecialAttribute specialAttribute) {
        this.notes = notes;
        this.specialAttribute = specialAttribute;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public SpecialAttribute getSpecialAttribute() {
        return specialAttribute;
    }

    public void setSpecialAttribute(SpecialAttribute specialAttribute) {
        this.specialAttribute = specialAttribute;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpecialAttNotes that = (SpecialAttNotes) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "SpecialAttNotes{" +
                "id=" + id +
                ", notes='" + notes + '\'' +
                ", specialAttribute=" + specialAttribute +
                '}';
    }
}

