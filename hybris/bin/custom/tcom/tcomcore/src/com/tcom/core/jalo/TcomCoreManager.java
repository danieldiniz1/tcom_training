/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.tcom.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.tcom.core.constants.TcomCoreConstants;
import com.tcom.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class TcomCoreManager extends GeneratedTcomCoreManager
{
	public static final TcomCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (TcomCoreManager) em.getExtension(TcomCoreConstants.EXTENSIONNAME);
	}
}
