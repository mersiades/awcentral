package com.mersiades.awcdata.models;

import com.mersiades.awcdata.enums.Playbooks;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@Document
public class Character {

    @Id
    private String id;

    private String name;

    // TODO: add stats

    // TODO: add harm

    private Playbooks playbook;

    private String gear;

    private GameRole gameRole;

    public Character() {
        this.id = UUID.randomUUID().toString();
    }

    public Character(String id, String name, GameRole gameRole, Playbooks playbook, String gear) {
        this.id = id;
        this.name = name;
        this.gameRole = gameRole;
        this.playbook = playbook;
        this.gear = gear;
    }
}
