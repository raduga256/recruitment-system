package ug.go.ups.recruitment.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class RecruitmentCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private District district;
    private LocalDate date;
    private Long targetOpenings;
    private Long filledPositions;
    private Long variance;

    public RecruitmentCenter(String code, District district, LocalDate date, Long targetOpenings, Long filledPositions, Long variance) {
        this.code = code;
        this.district = district;
        this.date = date;
        this.targetOpenings = targetOpenings;
        this.filledPositions = filledPositions;
        this.variance = variance;
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

    public Long getVariance() {
        return variance;
    }

    public void setVariance(Long variance) {
        this.variance = variance;
    }
}
