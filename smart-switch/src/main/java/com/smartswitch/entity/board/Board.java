package com.smartswitch.entity.board;

import com.smartswitch.entity.ToggleState;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * The persistent class for the "SWITCH" database table.
 */
@Data
@Entity
@Table(name = "BOARD")
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BOARD_KEY")
    private long boardKey;
    @Column(name = "MAC_ADDRESS")
    private String macAddress;
    @Column(name = "NAME")
    private String name;
    @Column(name = "TYPE")
    private BoardType type;
    @Column(name = "STATE")
    private ToggleState state;
}
