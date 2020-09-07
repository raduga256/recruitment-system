package ug.go.ups.recruitment.domain;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@NoArgsConstructor
@Entity
public class RecruitmentStage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String descriptions;

    @ManyToOne
    @JoinColumn(name = "applicant_id")
    private Applicant applicant;

    public RecruitmentStage(Long id, String name, String descriptions) {
        this.id = id;
        this.name = name;
        this.descriptions = descriptions;
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

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecruitmentStage that = (RecruitmentStage) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "RecruitmentStage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", descriptions='" + descriptions + '\'' +
                '}';
    }
}
