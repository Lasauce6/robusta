package com.github.lasauce6.robusta;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class RobustaFileType extends LanguageFileType {

    public static final RobustaFileType INSTANCE = new RobustaFileType();

    private RobustaFileType() {
        super(RobustaLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Robusta File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Robusta language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "jvs";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return RobustaIcons.FILE;
    }
}
