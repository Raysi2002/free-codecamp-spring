package com.raysi.springmappingrestfullapiiii.service;

import com.raysi.springmappingrestfullapiiii.entity.School;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SchoolService {
    void saveSchool(School school);
    List<School> getSchools();
}
