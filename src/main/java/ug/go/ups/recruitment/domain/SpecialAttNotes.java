package ug.go.ups.recruitment.domain;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@NoArgsConstructor
@Entity
public class SpecialAttNotes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String notes;

    @OneToOne
    private Applicant applicant ;

    public SpecialAttNotes(String notes, Applicant applicant) {
        this.notes = notes;
        this.applicant = applicant;
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

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    @Override
    public String toString() {
        return "SpecialAttNotes{" +
                "id=" + id +
                ", notes='" + notes + '\'' +
                ", applicant=" + applicant +
                '}';
    }
}

