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

package com.liferay.poc.guestbook.service.impl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

import com.liferay.poc.guestbook.model.Guestbook;
import com.liferay.poc.guestbook.service.base.GuestbookServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.service.ServiceContext;

/**
 * The implementation of the guestbook remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.poc.guestbook.service.GuestbookService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author liferay
 * @see GuestbookServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=gb",
		"json.web.service.context.path=Guestbook"
	},
	service = AopService.class
)
public class GuestbookServiceImpl extends GuestbookServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>com.liferay.poc.guestbook.service.GuestbookServiceUtil</code> to access the guestbook remote service.
	 */
	
	public Guestbook addGuestbook(long userId, String name,
		    ServiceContext serviceContext) throws SystemException,
		    PortalException {
                       
		    return guestbookLocalService.addGuestbook(userId, name, serviceContext);
		}

		public Guestbook deleteGuestbook(long guestbookId,
		    ServiceContext serviceContext) throws PortalException,
		    SystemException {

		    return guestbookLocalService.deleteGuestbook(guestbookId, serviceContext);
		}

		public List<Guestbook> getGuestbooks(long groupId) throws SystemException {
		        return guestbookLocalService.getGuestbooks(groupId);
		}

		public List<Guestbook> getGuestbooks(long groupId, int start, int end)
		                throws SystemException {
		        return guestbookLocalService.getGuestbooks(groupId, start, end);
		}

		public int getGuestbooksCount(long groupId) throws SystemException {
		        return guestbookLocalService.getGuestbooksCount();
		}

		public Guestbook updateGuestbook(long userId, long guestbookId,
		    String name, ServiceContext serviceContext) throws PortalException,
		    SystemException {

				return guestbookLocalService.updateGuestbook(userId, guestbookId,
		        name, serviceContext);
		}
}