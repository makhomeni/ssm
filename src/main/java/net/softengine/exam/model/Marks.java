package net.softengine.exam.model;

import net.softengine.admin.model.Student;

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
@Table(name = "EX_MARKS")
public class Marks  implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;

    @ManyToOne
    @JoinTable(name = "EX_JT_MARKS_MARK_SHEET",
            joinColumns = @JoinColumn(name = "MARKS_ID"),
            inverseJoinColumns = @JoinColumn(name = "M_SHEET_ID"))
    private MarksSheet marksSheet;

    @ManyToMany
    @JoinTable(name = "EX_JT_MARKS_STUDENT",
            joinColumns = @JoinColumn(name = "MARKS_ID"),
            inverseJoinColumns = @JoinColumn(name = "STUDENT_ID"))
    private Student student;

    private String written;

    private String mcq;

    private String practical;

}
