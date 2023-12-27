package com.smartswitch.entity.switches;

import com.smartswitch.entity.ToggleState;
import com.smartswitch.entity.board.Board;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SWITCH_KEY")
    private long switchKey;
    @Column(name = "NAME")
    private String name;
    @Column(name = "TYPE")
    private SwitchType type;
    @Column(name = "POSITION")
    private SwitchPosition position;
    @Column(name = "STATE")
    private ToggleState state;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BOARD_KEY")
    private Board board;
}