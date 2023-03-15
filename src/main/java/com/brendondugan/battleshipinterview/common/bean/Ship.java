package com.brendondugan.battleshipinterview.common.bean;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Ship {
    private final String name;
    private final int length;
}
