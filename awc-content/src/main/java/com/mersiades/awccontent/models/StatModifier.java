package com.mersiades.awccontent.models;

import com.mersiades.awccontent.enums.StatType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StatModifier {

    @Id
    private String id;

    private StatType statToModify;

    private int modification;

    private int maxLimit;
}
