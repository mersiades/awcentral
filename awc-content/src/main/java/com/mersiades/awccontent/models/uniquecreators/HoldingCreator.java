package com.mersiades.awccontent.models.uniquecreators;

import com.mersiades.awccontent.enums.GangSize;
import com.mersiades.awccontent.enums.HoldingSize;
import com.mersiades.awccontent.models.HoldingOption;
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
public class HoldingCreator {

    @Id
    private String id;

    private HoldingSize defaultHoldingSize;

    // Souls calculated on setHolding based on HoldingSize

    private String instructions;

    private String defaultSouls;

    private String defaultWant;

    private int defaultArmorBonus;

    private int defaultSurplus;

    private int defaultVehiclesCount;

    private int defaultBattleVehicleCount;

    private GangSize defaultGangSize;

    private int defaultGangHarm;

    private int defaultGangArmor;

    private String defaultGangTag;

    private int defaultStrengthsCount;

    private int defaultWeaknessesCount;

    @Builder.Default
    private List<String> defaultGigs = new ArrayList<>();

    @Builder.Default
    private List<HoldingOption> strengthOptions = new ArrayList<>();

    @Builder.Default
    private List<HoldingOption> weaknessOptions = new ArrayList<>();


}
