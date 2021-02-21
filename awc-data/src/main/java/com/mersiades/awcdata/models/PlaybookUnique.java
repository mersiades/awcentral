package com.mersiades.awcdata.models;

import com.mersiades.awccontent.enums.UniqueType;
import com.mersiades.awcdata.models.uniques.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlaybookUnique {

    @Id
    private String id;

    private UniqueType type;

    private AngelKit angelKit;

    private BrainerGear brainerGear;

    private CustomWeapons customWeapons;

    private Establishment establishment;

    private Followers followers;

    private Gang gang;

    private Holding holding;

    private SkinnerGear skinnerGear;

    private Weapons weapons;

    private Workspace workspace;
}
