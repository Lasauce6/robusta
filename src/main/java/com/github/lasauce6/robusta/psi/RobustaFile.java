package com.github.lasauce6.robusta.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.github.lasauce6.robusta.RobustaFileType;
import com.github.lasauce6.robusta.RobustaLanguage;
import org.jetbrains.annotations.NotNull;

public class RobustaFile extends PsiFileBase {
    public RobustaFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, RobustaLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return RobustaFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Robusta File";
    }
}
