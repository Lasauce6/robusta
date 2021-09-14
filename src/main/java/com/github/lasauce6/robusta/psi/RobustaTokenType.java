package com.github.lasauce6.robusta.psi;

import com.intellij.psi.tree.IElementType;
import com.github.lasauce6.robusta.RobustaLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class RobustaTokenType extends IElementType {
    public RobustaTokenType(@NotNull @NonNls String debugName) {
        super(debugName, RobustaLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "RobustaTokenType." + super.toString();
    }
}
