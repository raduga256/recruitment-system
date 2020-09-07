package ug.go.ups.recruitment.services;

import org.springframework.boot.actuate.health.ReactiveHealthContributorRegistry;
import ug.go.ups.recruitment.domain.RecruitmentCenter;

import java.util.Set;

public class RecruitmentCenterServiceImpl implements RecruitmentCenterService {


    @Override
    public Set<RecruitmentCenter> getCenters() {
        return null;
    }
}
