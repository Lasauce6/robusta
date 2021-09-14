package com.github.lasauce6.robusta.psi;

import com.intellij.psi.tree.IElementType;
import com.github.lasauce6.robusta.RobustaLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class RobustaElementType extends IElementType {
    public RobustaElementType(@NotNull @NonNls String debugName) {
        super(debugName, RobustaLanguage.INSTANCE);
    }
}
