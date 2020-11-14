package com.mersiades.awcdata.repositories;

import com.mersiades.awcdata.models.Game;
import com.mersiades.awcdata.models.GameRole;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface GameRepository extends ReactiveMongoRepository<Game, String> {
    Mono<Game> findByGameRoles(GameRole gameRole);

    Mono<Game> deleteGameByTextChannelId(String textChannelId);

    Mono<Game> findGameByTextChannelId(String textChannelId);
}
