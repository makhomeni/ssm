package net.softengine.exam.model;

import net.softengine.admin.model.Klass;
import net.softengine.admin.model.Subject;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: SHAHIN_PC
 * Date: 8/11/15
 * Time: 11:00 PM
 * To change this template use File | Settings | File Templates.
 */
//@Entity
@Table(name ="EX_MARKS_SHEET")
public class MarksSheet implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinTable(name = "EX_JT_MARKS_SHEET_KLASS",
            joinColumns = @JoinColumn(name = "M_SHEET_ID"),
            inverseJoinColumns = @JoinColumn(name = "KLASS_ID"))
    private Klass klass;

    @OneToMany
    @JoinTable(name = "EX_JT_MARKS_SHEET_STUDENT",
            joinColumns = @JoinColumn(name = "M_SHEET_ID"),
            inverseJoinColumns = @JoinColumn(name = "STUDENT_ID"))
    private Subject subject;

    @ManyToOne
    @JoinTable(name = "EX_JT_MARKS_SHEET_EXAM",
            joinColumns = @JoinColumn(name = "M_SHEET_ID"),
            inverseJoinColumns = @JoinColumn(name = "EXAM_ID"))
    private Exam exam;
}
