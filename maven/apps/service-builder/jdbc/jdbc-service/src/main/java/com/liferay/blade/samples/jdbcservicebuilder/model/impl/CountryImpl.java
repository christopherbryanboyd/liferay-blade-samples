/**
 * Copyright 2000-present Liferay, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.liferay.blade.samples.jdbcservicebuilder.model.impl;

import aQute.bnd.annotation.ProviderType;

/**
 * The extended model implementation for the Country service. Represents a row in the &quot;country&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.blade.samples.jdbcservicebuilder.model.Country} interface.
 * </p>
 *
 * @author Brian Wing Shun Chan
 */
@ProviderType
public class CountryImpl extends CountryBaseImpl {

	/**
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. All methods that expect a country model instance should use the {@link com.liferay.blade.samples.jdbcservicebuilder.model.Country} interface instead.
	 */
	public CountryImpl() {
	}

}