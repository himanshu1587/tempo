/**
 * Copyright (c) 2005-2006 Intalio inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Intalio inc. - initial API and implementation
 */
package org.intalio.tempo.workflow.tas.axis2;

import java.io.IOException;
import java.io.InputStream;

import org.intalio.tempo.security.Property;
import org.intalio.tempo.workflow.tas.core.AttachmentMetadata;
import org.intalio.tempo.workflow.tas.core.StorageStrategy;
import org.intalio.tempo.workflow.tas.core.UnavailableAttachmentException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A dummy implementation of {@link org.intalio.tempo.workflow.tas.core.StorageStrategy}.
 * Always acts as if attachment payload storage and deletion went OK and outputs log messages.
 */
public class DummyStorageStrategy implements StorageStrategy {
    private static final Logger _logger = LoggerFactory.getLogger(DummyStorageStrategy.class);

    public String storeAttachment(Property[] props, AttachmentMetadata metadata, InputStream payload)
            throws IOException {
        _logger.debug("Dummy storage item storing OK."+metadata);
        return "http://dummy-URL";
    }

    public void deleteAttachment(Property[] props, String url)
            throws UnavailableAttachmentException {
        _logger.debug("Dummy storage item deletion OK.");
        _logger.debug("URL: '" + url + "'");
    }
}
