package net.softengine.exam.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: SHAHIN_PC
 * Date: 8/11/15
 * Time: 10:59 PM
 * To change this template use File | Settings | File Templates.
 */

//@Entity
@Table( name = "EX_EXAM")
public class Exam implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    private String name;

    @OneToMany
    @JoinTable(name = "EX_JT_EXAM_MARKS_CONFIG",
                joinColumns = @JoinColumn(name = "EXAM_ID"),
                    inverseJoinColumns = @JoinColumn(name = "CONFIG_ID"))
    List<MarksConfig> marksConfigList = new ArrayList<MarksConfig>();

    @OneToMany
    @JoinTable(name = "EX_JT_EXAM_MARKS_M_SHEET",
            joinColumns = @JoinColumn(name = "EXAM_ID"),
            inverseJoinColumns = @JoinColumn(name = "SHEET_ID"))
    List<MarksSheet> marksSheetList = new ArrayList<MarksSheet>();

}
