package sg.edu.nus.iss.spring_api_trial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.spring_api_trial.exception.ResourceNotFoundException;
import sg.edu.nus.iss.spring_api_trial.model.Course;
import sg.edu.nus.iss.spring_api_trial.model.Lecturer;
import sg.edu.nus.iss.spring_api_trial.model.LecturerCourse;
import sg.edu.nus.iss.spring_api_trial.model.LecturerCourseKey;
import sg.edu.nus.iss.spring_api_trial.model.Student;
import sg.edu.nus.iss.spring_api_trial.model.StudentCourse;
import sg.edu.nus.iss.spring_api_trial.model.StudentCourseKey;
import sg.edu.nus.iss.spring_api_trial.repository.CourseRepository;
import sg.edu.nus.iss.spring_api_trial.repository.LecturerCourseRepository;
import sg.edu.nus.iss.spring_api_trial.repository.LecturerRepository;
import sg.edu.nus.iss.spring_api_trial.repository.StudentCourseRepository;
import sg.edu.nus.iss.spring_api_trial.repository.StudentRepository;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private LecturerRepository lecturerRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private StudentCourseRepository studentCourseRepository;

    @Autowired
    private LecturerCourseRepository lecturerCourseRepository;
    
    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void deleteStudent(String id) {
        studentRepository.deleteById(id);
    }

    @Override
    public void saveLecturer(Lecturer lecturer) {
        lecturerRepository.save(lecturer);
    }

    @Override
    public void deleteLecturer(String id) {
        lecturerRepository.deleteById(id);
    }

    @Override
    public void saveCourse(Course course) {
        courseRepository.save(course);
    }

    @Override
    public void deleteCourse(Integer id) {
        courseRepository.deleteById(id);
    }

    @Override
    public void enrollStudentInCourse(String studentId, Integer courseId) {
        Student student = studentRepository.findById(studentId)
            .orElseThrow(() -> new IllegalArgumentException("Student not found"));

        Course course = courseRepository.findById(courseId)
            .orElseThrow(() -> new IllegalArgumentException("Course not found"));

        StudentCourseKey id = new StudentCourseKey();
        id.setStuId(studentId);
        id.setCourseId(courseId);

        StudentCourse studentCourse = new StudentCourse();
        studentCourse.setId(id);
        studentCourse.setStudent(student);
        studentCourse.setCourse(course);
        studentCourse.setEnrollStatus("1");

        studentCourseRepository.save(studentCourse);
    }

    @Override
    public void assignLecturerToCourse(String lecturerId, Integer courseId) {
        Lecturer lecturer = lecturerRepository.findById(lecturerId)
            .orElseThrow(() -> new IllegalArgumentException("Lecturer not found"));

        Course course = courseRepository.findById(courseId)
            .orElseThrow(() -> new IllegalArgumentException("Course not found"));

        LecturerCourseKey id = new LecturerCourseKey();
        id.setLecturerId(lecturerId);
        id.setCourseId(courseId);

        LecturerCourse lecturerCourse = new LecturerCourse();
        lecturerCourse.setId(id);
        lecturerCourse.setLecturer(lecturer);
        lecturerCourse.setCourse(course);

        lecturerCourseRepository.save(lecturerCourse);
    }

    @Override
    public void removeStudentFromCourse(String studentId, Integer courseId) {
        StudentCourseKey id = new StudentCourseKey();
        id.setStuId(studentId);
        id.setCourseId(courseId);
        
        StudentCourse studentCourse = studentCourseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("StudentCourse not found for this id :: " + id));
                
        studentCourse.setEnrollStatus("0");
        studentCourseRepository.save(studentCourse);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudent(String id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found for this id :: " + id));
    }

    @Override
    public List<Lecturer> getAllLecturers() {
        return lecturerRepository.findAll();
    }

    @Override
    public Lecturer getLecturer(String id) {
        return lecturerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Lecturer not found for this id :: " + id));
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course getCourse(Integer id) {
        return courseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Course not found for this id :: " + id));
    }
}
