package com.sumanth.placementportal.repository;

import com.sumanth.placementportal.entity.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sumanth.placementportal.entity.Resume;
import com.sumanth.placementportal.repository.ResumeRepository;
import org.springframework.web.multipart.MultipartFile;

@Repository
public interface ResumeRepository
        extends JpaRepository<Resume, Long> {

}