package ug.go.ups.recruitment.domain;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@NoArgsConstructor
@Entity
public class InterviewResults {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "applicant_id")
    private Applicant applicant;
    private String written;
    private String orals;
    private String remark;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public String getWritten() {
        return written;
    }

    public void setWritten(String written) {
        this.written = written;
    }

    public String getOrals() {
        return orals;
    }

    public void setOrals(String orals) {
        this.orals = orals;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InterviewResults that = (InterviewResults) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "InterviewResults{" +
                "id=" + id +
                ", applicant=" + applicant +
                ", written='" + written + '\'' +
                ", orals='" + orals + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
