/*
 * This file is part of the Jet-FPC plugin.
 * Copyright 2020 Artur "suve" Iwicki
 * Copyright 2000-2020 JetBrains s.r.o. and other contributors.
 *
 * Use of this source code is governed by the Apache 2.0 licence.
 * For the full text of the licence, refer to the "LICENCE.txt" file.
 */
package pl.suve.jetfpc;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

public class PascalFileTypeFactory extends FileTypeFactory {

	@Override
	public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
		fileTypeConsumer.consume(PascalFileType.INSTANCE);
	}
}