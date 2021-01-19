package com.mersiades.awccontent.services;

import com.mersiades.awccontent.enums.PlaybookType;
import com.mersiades.awccontent.models.Playbook;
import reactor.core.publisher.Mono;

public interface PlaybookService extends ReactiveCrudService<Playbook, String> {

    Mono<Playbook> findByPlaybookType(PlaybookType playbookType);
}
