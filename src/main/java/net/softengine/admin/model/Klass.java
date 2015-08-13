package net.softengine.admin.model;

import net.softengine.security.model.User;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: SHAHIN_PC
 * Date: 8/11/15
 * Time: 10:58 PM
 * To change this template use File | Settings | File Templates.
 */
//@Entity
@Table(name = "AD_CLASS")
public class Klass extends User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToMany
    @JoinTable(name = "AD_JT_CLASS_STUDENT",
            joinColumns = @JoinColumn(name = "CLASS_ID"),
            inverseJoinColumns = @JoinColumn(name = "STUDENT_ID"))
    List<Student> studentList = new ArrayList<Student>();

    @OneToMany
    @JoinTable(name = "AD_JT_CLASS_SUBJECT",
            joinColumns = @JoinColumn(name = "CLASS_ID"),
            inverseJoinColumns = @JoinColumn(name = "SUBJECT_ID"))
    List<Subject> subjectList = new ArrayList<Subject>();

    @ManyToMany
    @JoinTable(name = "AD_JT_CLASS_TEACHER",
            joinColumns = @JoinColumn(name = "CLASS_ID"),
            inverseJoinColumns = @JoinColumn(name = "TEACHER_ID"))
    private Teacher classTeacher;

    private Long gpDevidedBy;



}
