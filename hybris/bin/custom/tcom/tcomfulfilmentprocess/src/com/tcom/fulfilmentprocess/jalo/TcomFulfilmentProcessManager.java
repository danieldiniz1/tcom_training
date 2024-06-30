/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.tcom.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.tcom.fulfilmentprocess.constants.TcomFulfilmentProcessConstants;

public class TcomFulfilmentProcessManager extends GeneratedTcomFulfilmentProcessManager
{
	public static final TcomFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (TcomFulfilmentProcessManager) em.getExtension(TcomFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
