package com.smartswitch.entity.switches;

import com.smartswitch.entity.ToggleState;
import com.smartswitch.entity.board.Board;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * The persistent class for the "SWITCH" database table.
 */
@Data
@Entity
@Table(name = "SWITCH")
public class Switch {
    private long switchKey;
    private String name;
    private SwitchType type;
    private SwitchPosition position;
    private ToggleState state;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BOARD_KEY")
    private Board board;
}