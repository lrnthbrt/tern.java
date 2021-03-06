/**
 *  Copyright (c) 2013-2016 Angelo ZERR.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Angelo Zerr <angelo.zerr@gmail.com> - initial API and implementation
 */
package tern.eclipse.ide.internal.ui.views;

import tern.eclipse.ide.core.IIDETernProject;
import tern.eclipse.ide.core.resources.TernDocumentFile;
import tern.server.protocol.outline.TernOutlineCollector;

public class TernOutline extends TernOutlineCollector {

	private final TernDocumentFile ternFile;

	public TernOutline(TernDocumentFile ternFile, IIDETernProject ternProject) {
		super(ternProject);
		this.ternFile = ternFile;
	}

	public TernDocumentFile getTernFile() {
		return ternFile;
	}
}
