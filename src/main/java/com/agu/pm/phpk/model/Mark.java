package com.agu.pm.phpk.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="mark")
@Getter
@Setter
public class Mark implements Serializable {

    @EmbeddedId
    private MarkEmbeddedId id;

    @Column(name = "mark")
    private Float mark;


}
