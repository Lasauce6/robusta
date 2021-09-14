package com.github.lasauce6.robusta;

import com.intellij.lang.Language;

public class RobustaLanguage extends Language {

    public static final RobustaLanguage INSTANCE = new RobustaLanguage();

    private RobustaLanguage() {
        super("Robusta");
    }

}