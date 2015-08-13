package net.softengine.exam.model;

import net.softengine.admin.model.Klass;
import net.softengine.admin.model.Subject;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: SHAHIN_PC
 * Date: 8/11/15
 * Time: 10:59 PM
 * To change this template use File | Settings | File Templates.
 */
//@Entity
@Table(name = "EX_MARKS_CONFIG")
public class MarksConfig  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;

    @OneToMany
    @JoinTable(name = "EX_JT_MARKS_CONFIG_KLASS",
                joinColumns = @JoinColumn(name = "M_CONFIG_ID"),
                inverseJoinColumns = @JoinColumn(name = "KLASS_ID"))
    private Klass klass;

    @ManyToOne
    @JoinTable(name = "EX_JT_MARKS_CONFIG_SUBJECT",
            joinColumns = @JoinColumn(name = "M_CONFIG_ID"),
            inverseJoinColumns = @JoinColumn(name = "SUBJECT_ID"))
    private Subject subject;


    private Integer fullMarks;    // 100 | 50 | 80 etc

    private Integer countableMarks;   // 100% | 80% | 20%

    @ManyToOne
    @JoinTable(name = "EX_JT_MARKS_CONFIG_EXAM",
            joinColumns = @JoinColumn(name = "M_CONFIG_ID"),
            inverseJoinColumns = @JoinColumn(name = "EXAM_ID"))
    private Exam exam;

}
