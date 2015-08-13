package net.softengine.admin.model;

import net.softengine.security.model.User;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: SHAHIN_PC
 * Date: 8/11/15
 * Time: 10:58 PM
 * To change this template use File | Settings | File Templates.
 */

@DiscriminatorValue("student")
public class Student extends User implements Serializable {

    private Long rol;

    private String fatherName;

    private String motherName;

    private String bloodGroup;

    private String sex;

    private String district;

    @ManyToOne
    private Klass klass;

    @OneToOne
    private Image image;

}
