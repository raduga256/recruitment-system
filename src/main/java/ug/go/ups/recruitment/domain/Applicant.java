package ug.go.ups.recruitment.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

@Entity
public class Applicant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nin;
    private String firstName;
    private String lastName;
    private Long applicantNo;
    private int age;
    private Gender gender;
    private String telNo;
    private LocalDate dob;
    private RecruitmentCenter center;
    private Education educationLevel;
    private InterviewResults interviewResults;
    private SpecialAttribute specialAttribute;
    private Set<RecruitmentStage> recruitmentStage;
    private Byte[] image;

    public Applicant(String nin, String firstName, String lastName, Long applicantNo,
                     int age, Gender gender, String telNo, LocalDate dob,
                     RecruitmentCenter center, Education educationLevel, InterviewResults interviewResults,
                     SpecialAttribute specialAttribute, Set<RecruitmentStage> recruitmentStage, Byte[] image) {
        this.nin = nin;
        this.firstName = firstName;
        this.lastName = lastName;
        this.applicantNo = applicantNo;
        this.age = age;
        this.gender = gender;
        this.telNo = telNo;
        this.dob = dob;
        this.center = center;
        this.educationLevel = educationLevel;
        this.interviewResults = interviewResults;
        this.specialAttribute = specialAttribute;
        this.recruitmentStage = recruitmentStage;
        this.image = image;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "id=" + id +
                ", nin='" + nin + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", applicantNo=" + applicantNo +
                ", age=" + age +
                ", gender=" + gender +
                ", telNo='" + telNo + '\'' +
                ", dob=" + dob +
                ", center=" + center +
                ", educationLevel=" + educationLevel +
                ", interviewResults=" + interviewResults +
                ", specialAttribute=" + specialAttribute +
                ", recruitmentStage=" + recruitmentStage +
                ", image=" + Arrays.toString(image) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Applicant applicant = (Applicant) o;
        return id.equals(applicant.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
