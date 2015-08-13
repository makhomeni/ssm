package net.softengine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MyEntity {
    @Id
    @GeneratedValue
    private Long id;


}
