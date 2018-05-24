package de.dytanic.cloudnet.lib.player.permission;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Tareko on 28.07.2017.
 */
@Getter
@AllArgsConstructor
public class GroupEntityData {

    private String group;

    @Setter
    private long timeout;

}