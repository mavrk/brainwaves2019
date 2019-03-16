/* 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
*/
package com.prowidesoftware.swift.model.field;

import java.util.Calendar;
import java.util.List;

/**
 * Interface to mark fields whose definition contain a date.
 * Note that if a field has a date and it is optional, and the actual 
 * field has not set the optional date/s then
 * the call dates() will return an empty list
 * 
 * @author www.prowidesoftware.com
 * @since 6.0
 */
public interface DateContainer {

	/**
	 * Get a calendar for every date found
	 * 
	 */
	List<Calendar> dates();
	
	// Maybe times() datetimes()?
}
