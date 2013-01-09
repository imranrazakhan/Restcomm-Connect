/*
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.mobicents.servlet.sip.restcomm.interpreter.http.cookies;

import java.util.Date;
import java.util.List;

import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;
import org.mobicents.servlet.sip.restcomm.ServiceLocator;
import org.mobicents.servlet.sip.restcomm.dao.DaoManager;
import org.mobicents.servlet.sip.restcomm.dao.HttpCookiesDao;

/**
 * @author quintana.thomas@gmail.com (Thomas Quintana)
 */
public final class RestCommCookieStore implements CookieStore {
  private static final HttpCookiesDao dao;
  static {
    dao = ServiceLocator.getInstance().get(DaoManager.class).getHttpCookiesDao();
  }

  public RestCommCookieStore() {
    super();
  }

  @Override public void addCookie(final Cookie cookie) {
    
  }

  @Override public void clear() {
    
  }

  @Override public boolean clearExpired(Date date) {
    return false;
  }

  @Override public List<Cookie> getCookies() {
    return null;
  }
}
