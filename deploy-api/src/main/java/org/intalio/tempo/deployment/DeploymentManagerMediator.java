/**
 * Copyright (c) 2005-2007 Intalio inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Intalio inc. - initial API and implementation
 */

package org.intalio.tempo.deployment;


/**
 * Deployment manager mediator manages the access to DeploymentManager and its lifecycle.
 * <p/>
 * If a deployment manager becomes unavailable or 
 */
public interface DeploymentManagerMediator {

	void setName(String name);

	void setDeploymentService(DeploymentService service);
	
	DeploymentManager getDeploymentManager();
}

