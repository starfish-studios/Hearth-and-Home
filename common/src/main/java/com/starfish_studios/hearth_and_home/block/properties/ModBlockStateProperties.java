package com.starfish_studios.hearth_and_home.block.properties;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;

public class ModBlockStateProperties {
    public static final BooleanProperty TOP = BooleanProperty.create("top");
    public static final EnumProperty<ColumnType> COLUMN_TYPE = EnumProperty.create("type", ColumnType.class);
    public static final EnumProperty<HorizontalConnectionType> HORIZONTAL_CONNECTION_TYPE = EnumProperty.create("horizontal", HorizontalConnectionType.class);
}