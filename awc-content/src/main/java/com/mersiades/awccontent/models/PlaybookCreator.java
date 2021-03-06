package com.mersiades.awccontent.models;

import com.mersiades.awccontent.enums.PlaybookType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlaybookCreator {

    @Id
    private String id;

    private PlaybookType playbookType;

    private GearInstructions gearInstructions;

    private String improvementInstructions;

    private String movesInstructions;

    private String hxInstructions;

    private PlaybookUniqueCreator playbookUniqueCreator;

    private ImprovementBlock improvementBlock;

    private int defaultVehicleCount;

    @Builder.Default
    private List<Move> optionalMoves = new ArrayList<>();

    @Builder.Default
    private List<Move> defaultMoves = new ArrayList<>();

    private int defaultMoveCount;

    private int moveChoiceCount;

    @Builder.Default
    private List<Name> names = new ArrayList<>();

    @Builder.Default
    private List<Look> looks = new ArrayList<>();

    @Builder.Default
    private List<StatsOption> statsOptions = new ArrayList<>();
}
