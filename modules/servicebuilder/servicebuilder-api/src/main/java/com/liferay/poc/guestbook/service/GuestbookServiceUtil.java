/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.poc.guestbook.service;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for Guestbook. This utility wraps
 * <code>com.liferay.poc.guestbook.service.impl.GuestbookServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author liferay
 * @see GuestbookService
 * @generated
 */
public class GuestbookServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.poc.guestbook.service.impl.GuestbookServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.poc.guestbook.model.Guestbook addGuestbook(
			long userId, String name,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return getService().addGuestbook(userId, name, serviceContext);
	}

	public static com.liferay.poc.guestbook.model.Guestbook deleteGuestbook(
			long guestbookId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return getService().deleteGuestbook(guestbookId, serviceContext);
	}

	public static java.util.List<com.liferay.poc.guestbook.model.Guestbook>
			getGuestbooks(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {

		return getService().getGuestbooks(groupId);
	}

	public static java.util.List<com.liferay.poc.guestbook.model.Guestbook>
			getGuestbooks(long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {

		return getService().getGuestbooks(groupId, start, end);
	}

	public static int getGuestbooksCount(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {

		return getService().getGuestbooksCount(groupId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.poc.guestbook.model.Guestbook updateGuestbook(
			long userId, long guestbookId, String name,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return getService().updateGuestbook(
			userId, guestbookId, name, serviceContext);
	}

	public static GuestbookService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<GuestbookService, GuestbookService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(GuestbookService.class);

		ServiceTracker<GuestbookService, GuestbookService> serviceTracker =
			new ServiceTracker<GuestbookService, GuestbookService>(
				bundle.getBundleContext(), GuestbookService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}