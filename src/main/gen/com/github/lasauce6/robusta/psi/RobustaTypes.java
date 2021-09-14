// This is a generated file. Not intended for manual editing.
package com.github.lasauce6.robusta.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.lasauce6.robusta.psi.impl.*;

public interface RobustaTypes {

  IElementType PROPERTY = new RobustaElementType("PROPERTY");

  IElementType COMMENT = new RobustaTokenType("COMMENT");
  IElementType CRLF = new RobustaTokenType("CRLF");
  IElementType KEY = new RobustaTokenType("KEY");
  IElementType SEPARATOR = new RobustaTokenType("SEPARATOR");
  IElementType VALUE = new RobustaTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new RobustaPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
