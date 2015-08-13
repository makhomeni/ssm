package net.softengine.admin.model;

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
@Table(name= "AD_SUBJECT")
public class Subject implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;

    private String name;

    private Long subjectCode;

    @ManyToOne
    List<Klass> klassList = new ArrayList<Klass>();
}
