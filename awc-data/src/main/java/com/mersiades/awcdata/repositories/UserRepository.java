package com.mersiades.awcdata.repositories;

import com.mersiades.awcdata.models.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface UserRepository extends ReactiveMongoRepository<User, String> {
    Mono<User> findByDiscordId(String discordId);
}
