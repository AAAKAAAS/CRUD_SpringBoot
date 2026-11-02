
package com.example.CRUDSpring.Service;

import com.example.CRUDSpring.Entity.Student;
import com.example.CRUDSpring.Repo.StudentRepo;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepo studentRepo;

    // Constructor Injection
    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    // CREATE STUDENT
    public Student createStudent(Student student) {

        return studentRepo.save(student);
    }

    // GET STUDENT BY ID
    public Student getStudentById(int id) {

        Optional<Student> student = studentRepo.findById(id);

        return student.orElse(null);
    }

    // GET ALL STUDENTS
    public List<Student> getAllStudents() {

        return studentRepo.findAll();
    }

    // UPDATE STUDENT
    public Student updateStudent(int id, Student updatedStudent) {

        Optional<Student> existingStudent = studentRepo.findById(id);

        if (existingStudent.isEmpty()) {
            return null;
        }

        Student student = existingStudent.get();

        student.setName(updatedStudent.getName());
        student.setAge(updatedStudent.getAge());
        student.setEmail(updatedStudent.getEmail());
        student.setSubject(updatedStudent.getSubject());
        student.setRollNo(updatedStudent.getRollNo());

        return studentRepo.save(student);
    }

    // DELETE STUDENT
    public boolean deleteStudent(int id) {

        if (!studentRepo.existsById(id)) {
            return false;
        }

        studentRepo.deleteById(id);

        return true;
    }
}
