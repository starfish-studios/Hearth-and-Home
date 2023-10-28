package com.starfish_studios.hearth_and_home.block.properties;

import net.minecraft.util.StringRepresentable;

public enum VerticalConnectionType implements StringRepresentable {
    SINGLE("single"),
    BOTTOM("bottom"),
    MIDDLE("middle"),
    TOP("top");

    private final String name;

    private VerticalConnectionType(String type) {
        this.name = type;
    }

    public String toString() {
        return this.name;
    }

    public String getSerializedName() {
        return this.name;
    }
}