package com.university.carter.service;

import com.university.carter.model.studentmodel;
import com.university.carter.repository.studentrepo;
import org.springframework.beans.factory.annotation.Autowired;

public class implementstudent {
    @Autowired
    private studentrepo studentrepo;
    @Override
    public studentmodel registerArtist(studentmodel student) {
        return studentrepo.saveStudent;
    }

    @Override
    public student updateArtist(student student) {
        student savedStudent = studentrepo.findById(student.getId()).orElse(null);
        if (savedStudent != null) {
            student updateStudent = new student();
//            updateArtist.
//            savedArtist.getId();
            updateStudent.setId(savedStudent.getId());
            updateStudent.setName(student.getName() != null ? student.getName() : savedStudent.getName());
            updateStudent.setAge(student.getAge() != null ? student.getAge() : savedStudent.getAge());
            updateStudent.setCategory(student.getCategory() != null ? student.getCategory() : savedStudent.getCategory());
            updateStudent.setGender(student.getGender() != null ? student.getGender() : savedStudent.getGender());
            updateStudent.setPortofolio(student.getPortofolio() != null ? student.getPortofolio() : savedStudent.getPortofolio());
            updateStudent.setDescription(student.getDescription() != null ? student.getDescription() : savedStudent.getDescription());
            return studentrepo.save(updateStudent);
        }
        return null;
    }

    @Override
    public void deleteStudent(Long id) {

        student savedArtist = studentrepo.findById(id).orElse(null);
        if (savedStudent != null) {
            studentrepo.delete(savedStudent);
        }
    }

    @Override
    public List<student> StudentList() {
        return studentrepo.findAll();
    }

    @Override
    public student findArtistById(Long id) {
        return studentrepo.findById(id).orElse(null);
    }
}

}

        }
