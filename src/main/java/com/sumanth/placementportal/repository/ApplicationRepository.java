package com.sumanth.placementportal.repository;

import com.sumanth.placementportal.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository
        extends JpaRepository<Application, Long> {
}