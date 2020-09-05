package ug.go.ups.recruitment.domain;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@NoArgsConstructor
@Entity
public class RecruitmentCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private District district;
    private LocalDate date;
    private Long targetOpenings;
    private Long filledPositions;
    private Long unFilled;

    @OneToMany(mappedBy = "center")
    private Set<Applicant> applicants = new HashSet<>();

    public RecruitmentCenter(String code, District district, LocalDate date, Long targetOpenings,
                             Long filledPositions, Long unFilled) {
        this.code = code;
        this.district = district;
        this.date = date;
        this.targetOpenings = targetOpenings;
        this.filledPositions = filledPositions;
        this.unFilled = unFilled;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Long getTargetOpenings() {
        return targetOpenings;
    }

    public void setTargetOpenings(Long targetOpenings) {
        this.targetOpenings = targetOpenings;
    }

    public Long getFilledPositions() {
        return filledPositions;
    }

    public void setFilledPositions(Long filledPositions) {
        this.filledPositions = filledPositions;
    }

    public Long getUnFilled() {
        return unFilled;
    }

    public void setUnFilled(Long unFilled) {
        this.unFilled = unFilled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecruitmentCenter that = (RecruitmentCenter) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "RecruitmentCenter{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", district=" + district +
                ", date=" + date +
                ", targetOpenings=" + targetOpenings +
                ", filledPositions=" + filledPositions +
                ", unFilled=" + unFilled +
                '}';
    }
}
