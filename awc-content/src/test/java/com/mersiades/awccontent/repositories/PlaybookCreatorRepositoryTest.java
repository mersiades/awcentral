package com.mersiades.awccontent.repositories;

import com.mersiades.awccontent.enums.PlaybookType;
import com.mersiades.awccontent.models.PlaybookCreator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@Disabled
@ExtendWith({SpringExtension.class})
//@SpringBootApplication
class PlaybookCreatorRepositoryTest {

    @Autowired
    private PlaybookCreatorRepository playbookCreatorRepository;

    @BeforeEach
    public void setup() {
        PlaybookCreator angelCreator = PlaybookCreator.builder()
                .playbookType(PlaybookType.ANGEL)
                .improvementInstructions("Whenever you roll ...")
                .movesInstructions("You get all ...")
                .hxInstructions("Everyone introduces ...")
                .defaultMoveCount(1)
                .moveChoiceCount(2)
                .build();

        PlaybookCreator battlebabePlaybookCreator = PlaybookCreator.builder()
                .playbookType(PlaybookType.BATTLEBABE)
                .improvementInstructions("Whenever you roll ...")
                .movesInstructions("You get all...")
                .hxInstructions("Everyone introduces ...")
                .defaultMoveCount(1)
                .moveChoiceCount(2)
                .build();

        playbookCreatorRepository.deleteAll();
        playbookCreatorRepository.saveAll(List.of(angelCreator, battlebabePlaybookCreator));
//                .thenMany(Flux.just(angelCreator, battlebabePlaybookCreator))
//                .flatMap(playbookCreatorRepository::save)
//                .doOnNext(System.out::println)
//                .blockLast();
    }

//    @Test
//    public void shouldFindPlaybookCreatorForAPlaybook() {
//        StepVerifier.create(playbookCreatorRepository.findByPlaybookType(PlaybookType.ANGEL))
//                .expectSubscription()
//                .expectNextMatches(playbookCreator -> playbookCreator.getPlaybookType().equals(PlaybookType.ANGEL))
//                .verifyComplete();
//    }
}