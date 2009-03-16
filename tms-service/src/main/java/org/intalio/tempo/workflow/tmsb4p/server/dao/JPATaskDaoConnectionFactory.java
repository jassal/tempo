/**
 * Copyright (c) 2005-2007 Intalio inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.intalio.tempo.workflow.tmsb4p.server.dao;

import java.util.Map;

import org.intalio.tempo.workflow.dao.AbstractJPAConnectionFactory;

/**
 * Factory for JPA-based task persistence
 */
public class JPATaskDaoConnectionFactory extends AbstractJPAConnectionFactory
		implements ITaskDAOConnectionFactory {

	public JPATaskDaoConnectionFactory(Map<String, Object> properties) {
		super("org.intalio.tempo.tmsb4p", properties);
	}

	public JPATaskDaoConnectionFactory() {
		super("org.intalio.tempo.tmsb4p");
	}

	public ITaskDAOConnection openConnection() {
		return new JPATaskDaoConnection(factory.createEntityManager());
	}
}