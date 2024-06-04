package co.develhope.test_db.controllers;

import co.develhope.test_db.entities.Students;
import co.develhope.test_db.repositories.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentsController {

    @Autowired
    private StudentsRepository studentRepository;

    @GetMapping
    public List<Students> getAllStudents() {
        return studentRepository.findAll();
    }

    @PostMapping
    public Students createStudent(@RequestBody Students student) {
        return studentRepository.save(student);
    }

}

