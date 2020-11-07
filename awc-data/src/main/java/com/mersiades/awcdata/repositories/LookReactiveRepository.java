package com.mersiades.awcdata.repositories;

import com.mersiades.awcdata.enums.Playbooks;
import com.mersiades.awcdata.models.Look;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface LookReactiveRepository extends ReactiveMongoRepository<Look, String> {
    Flux<Look> findAllByPlaybookType(Playbooks playbookType);
}
