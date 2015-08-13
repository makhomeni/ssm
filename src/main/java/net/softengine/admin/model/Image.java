package net.softengine.admin.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

//@Entity
@Table(name = "AD_IMAGE")
public class Image implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String docOf;

    private String originalName;

    private String givenName;

    private String resourceDirectory;

    private String extension;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "record_date")
    private Date recordDate;

    @OneToOne(mappedBy = "image")
    private Student student;


}