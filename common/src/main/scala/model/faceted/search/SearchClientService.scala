/*
 * Copyright (C) 2015  Language Technology Group
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package model.faceted.search

import org.elasticsearch.client.Client

/**
 * Wrapper around an ElasticSearch {@link Client}. Different ways of obtaining a
 * {@link Client} can be implemented in classes implementing this interface.
 */
trait SearchClientService {
  /**
   * Get a reference to an ElasticSearch {@link Client}.
   */
  def client(): Client

  /**
   * Shutdown the ElasticSearch {@link Client}. The client is not available
   * for querying and indexing.
   */
  def shutdown(): Unit
}
