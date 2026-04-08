package com.raysi.springmappingrestfullapiiii.repository;

import com.raysi.springmappingrestfullapiiii.entity.StudentProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentProfileRepository extends JpaRepository<StudentProfile, Long> {
}
