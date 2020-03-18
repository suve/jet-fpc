/*
 * This file is part of the Jet-FPC plugin.
 * Copyright 2020 Artur "suve" Iwicki
 * Copyright 2000-2020 JetBrains s.r.o. and other contributors.
 *
 * Use of this source code is governed by the Apache 2.0 licence.
 * For the full text of the licence, refer to the "LICENCE.txt" file.
 */
package pl.suve.jetfpc;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class PascalFileType extends LanguageFileType {
	public static final PascalFileType INSTANCE = new PascalFileType();

	private PascalFileType() {
		super(PascalLanguage.INSTANCE);
	}

	@NotNull
	@Override
	public String getName() {
		return "Pascal code";
	}

	@NotNull
	@Override
	public String getDescription() {
		return "Free Pascal source code";
	}

	@NotNull
	@Override
	public String getDefaultExtension() {
		return "pas";
	}

	@Nullable
	@Override
	public Icon getIcon() {
		return LazarusIcons.FILE;
	}
}