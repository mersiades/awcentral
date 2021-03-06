package com.mersiades.awcdata.models.uniques;

import com.mersiades.awccontent.enums.UniqueType;
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
public class Weapons {

    @Id
    private String id;

    @Builder.Default
    private UniqueType uniqueType = UniqueType.WEAPONS;

    @Builder.Default
    private List<String> weapons = new ArrayList<>();
}
