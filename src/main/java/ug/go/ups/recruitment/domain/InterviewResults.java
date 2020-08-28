package ug.go.ups.recruitment.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class InterviewResults {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Applicant applicant;
    private String sectionA;
    private String sectionB;
    private String orals;
    private String remark;

    public InterviewResults(Long id, Applicant applicant, String sectionA, String sectionB, String orals, String remark) {
        this.id = id;
        this.applicant = applicant;
        this.sectionA = sectionA;
        this.sectionB = sectionB;
        this.orals = orals;
        this.remark = remark;
    }

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

    public String getSectionA() {
        return sectionA;
    }

    public void setSectionA(String sectionA) {
        this.sectionA = sectionA;
    }

    public String getSectionB() {
        return sectionB;
    }

    public void setSectionB(String sectionB) {
        this.sectionB = sectionB;
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
                ", sectionA='" + sectionA + '\'' +
                ", sectionB='" + sectionB + '\'' +
                ", orals='" + orals + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
