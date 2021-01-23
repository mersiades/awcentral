package com.mersiades.awccontent.services;

import com.mersiades.awccontent.enums.MoveType;
import com.mersiades.awccontent.enums.PlaybookType;
import com.mersiades.awccontent.models.Move;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MoveService extends ReactiveCrudService<Move, String>{

    Flux<Move> findAllByPlaybookAndKind(PlaybookType playbookType, MoveType kind);

    Mono<Move> findByName(String moveName);
}
