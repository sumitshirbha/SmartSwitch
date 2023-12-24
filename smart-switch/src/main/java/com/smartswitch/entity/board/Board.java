package com.smartswitch.entity.board;

import com.smartswitch.entity.ToggleState;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * The persistent class for the "SWITCH" database table.
 */
@Data
@Entity
@Table(name = "BOARD")
public class Board {
    private long boardKey;
    private String macAddress;
    private String name;
    private BoardType type;
    private ToggleState state;
}
