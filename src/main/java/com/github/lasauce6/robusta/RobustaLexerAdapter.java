package com.github.lasauce6.robusta;

import com.intellij.lexer.FlexAdapter;

public class RobustaLexerAdapter extends FlexAdapter {
    public RobustaLexerAdapter() {
        super(new RobustaLexer(null));
    }
}
