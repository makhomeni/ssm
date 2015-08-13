package net.softengine.admin.service;

import net.softengine.admin.model.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: SHAHIN_PC
 * Date: 8/12/15
 * Time: 6:43 PM
 * To change this template use File | Settings | File Templates.
 */
public interface AdminService {


    //Image
    public boolean save(Image image);

    public boolean update(Image image);

    public boolean delete(Image image);

    public Image getImage(Long imageId);

    public Image getImage(String query);

    public List<Image> findAllImage();

    public List<Image> findAllImage(String query);


    //Klass
    public boolean save(Klass klass);

    public boolean update(Klass klass);

    public boolean delete(Klass klass);

    public Klass getKlass(Long klassId);

    public Klass getKlass(String query);

    public List<Klass> findAllKlass();

    public List<Klass> findAllKlass(String query);


    //Student
    public boolean save(Student student);

    public boolean update(Student student);

    public boolean delete(Student student);

    public Student getStudent(Long studentId);

    public Student getStudent(String query);

    public List<Student> findAllStudent();

    public List<Student> findAllStudent(String query);


    //Subject
    public boolean save(Subject subject);

    public boolean update(Subject subject);

    public boolean delete(Subject subject);

    public Subject getSubject(Long subjectId);

    public Subject getSubject(String query);

    public List<Subject> findAllSubject();

    public List<Subject> findAllSubject(String query);


    //Teacher
    public boolean save(Teacher teacher);

    public boolean update(Teacher teacher);

    public boolean delete(Teacher teacher);

    public Teacher getTeacher(Long teacherId);

    public Teacher getTeacher(String query);

    public List<Teacher> findAllTeacher();

    public List<Teacher> findAllTeacher(String query);



}
