package com.raysi.springmappingrestfullapiiii.service;

import com.raysi.springmappingrestfullapiiii.entity.School;
import com.raysi.springmappingrestfullapiiii.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolServiceImp implements SchoolService {
    private SchoolRepository schoolRepository;
    @Autowired
    public SchoolServiceImp(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    @Override
    public void saveSchool(School school) {
        schoolRepository.save(school);
    }

    @Override
    public List<School> getSchools() {
        return schoolRepository.findAll();
    }
}
