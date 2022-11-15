package com.codegym.service.classroom;


import com.codegym.model.Classroom;

import com.codegym.repository.classroom.IClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClassroomService implements IClassroomService{
    @Autowired
    IClassroomRepository classroomRepository;
    @Override
    public Iterable<Classroom> findAll() {
        return classroomRepository.findAll();
    }

    @Override
    public Optional<Classroom> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Classroom save(Classroom classroom) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }
}