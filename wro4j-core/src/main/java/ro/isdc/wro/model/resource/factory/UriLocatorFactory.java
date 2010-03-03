/*
 * Copyright (c) 2009.
 */
package ro.isdc.wro.model.resource.factory;

import ro.isdc.wro.model.resource.locator.UriLocator;

/**
 * A factory responsible for creating a ResourceLocator based on provided uri.
 * If factory is unable to create a resource, it will throw a runtime exception.
 *
 * @author Alex Objelean
 * @created Created on Oct 30, 2008
 */
public interface UriLocatorFactory {
  /**
   * Returns an instance of {@link UriLocator} based on uri.
   *
   * @param uri
   *          location of the resource.
   * @return not null {@link UriLocator} implementation.
   * @throws runtime
   *           exception if a valid instance of resourceLocator cannot be
   *           returned.
   */
  UriLocator getInstance(final String uri);
}