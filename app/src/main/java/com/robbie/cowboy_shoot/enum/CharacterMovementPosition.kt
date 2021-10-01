package com.robbie.cowboy_shoot.enum

    enum class CharacterMovementPosition(val value: Int) {
        TOP(0),
        MIDDLE(1),
        BOTTOM(2);
        companion object{
            fun fromInt(value: Int) = values().first {it.value == value}
        }
    }
