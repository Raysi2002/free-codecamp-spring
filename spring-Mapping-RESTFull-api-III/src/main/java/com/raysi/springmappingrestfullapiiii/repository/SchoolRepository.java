package com.raysi.springmappingrestfullapiiii.repository;

import com.raysi.springmappingrestfullapiiii.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {

}
