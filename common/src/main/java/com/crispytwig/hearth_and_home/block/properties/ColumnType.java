package com.crispytwig.hearth_and_home.block.properties;

import net.minecraft.util.StringRepresentable;

public enum ColumnType implements StringRepresentable {
    TOP("top"),
    MIDDLE("middle"),
    BOTTOM("bottom"),
    NONE("none");

    private final String name;

    private ColumnType(String type) {
        this.name = type;
    }

    public String toString() {
        return this.name;
    }

    public String getSerializedName() {
        return this.name;
    }
}