// This is a generated file. Not intended for manual editing.
package com.github.lasauce6.robusta.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.lasauce6.robusta.psi.RobustaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.lasauce6.robusta.psi.*;

public class RobustaPropertyImpl extends ASTWrapperPsiElement implements RobustaProperty {

  public RobustaPropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RobustaVisitor visitor) {
    visitor.visitProperty(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RobustaVisitor) accept((RobustaVisitor)visitor);
    else super.accept(visitor);
  }

}
