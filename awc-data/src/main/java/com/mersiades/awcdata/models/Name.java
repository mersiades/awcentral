package com.mersiades.awcdata.models;

import com.mersiades.awcdata.enums.Playbooks;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@EqualsAndHashCode(exclude = "playbookCreator", callSuper = false)
@Data
@Entity
@Table(name = "names")
public class Name extends BaseEntity {

    @Enumerated(EnumType.STRING)
    @Column(name = "pb_type")
    private Playbooks playbookType;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "playbook_creator_id")
    private PlaybookCreator playbookCreator;
}
