package com.duvernois.ppmtool.services;

import com.duvernois.ppmtool.domain.Project;
import com.duvernois.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project){

        // add logic for later

        return projectRepository.save(project);
    }
}
