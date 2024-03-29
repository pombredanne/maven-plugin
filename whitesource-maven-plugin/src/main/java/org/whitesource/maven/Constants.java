/**
 * Copyright (C) 2011 White Source Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.whitesource.maven;

/**
 * Constants used by plugin.
 * 
 * @author tom.shapira
 */
public final class Constants {
	
	/* --- Configuration --- */

	public static final String AGENT_TYPE = "maven-plugin";
	public static final String AGENT_VERSION = "2.2.5";

    public static final String PLUGIN_PREFIX = "org.whitesource.";
    public static final String ORG_TOKEN = PLUGIN_PREFIX + "orgToken";
    public static final String PRODUCT = PLUGIN_PREFIX + "product";
    public static final String PRODUCT_VERSION = PLUGIN_PREFIX + "productVersion";
    public static final String CHECK_POLICIES = PLUGIN_PREFIX + "checkPolicies";
    public static final String IGNORE_TEST_SCOPE_DEPENDENCIES = PLUGIN_PREFIX + "ignoreTestScopeDependencies";
    public static final String OUTPUT_DIRECTORY = PLUGIN_PREFIX + "outputDirectory";
	public static final String PROJECT_TOKEN = PLUGIN_PREFIX + "projectToken";
    public static final String MODULE_TOKENS = PLUGIN_PREFIX + "moduleTokens";
    public static final String SPECIAL_MODULE_TOKENS = PLUGIN_PREFIX + "specialModuleTokens";
    public static final String IGNORE = PLUGIN_PREFIX + "ignore";
    public static final String INCLUDES = PLUGIN_PREFIX + "includes";
    public static final String EXCLUDES = PLUGIN_PREFIX + "excludes";
    public static final String SCOPE = PLUGIN_PREFIX + "scope";
    public static final String IGNORE_POM_MODULES = PLUGIN_PREFIX + "ignorePomModules";
    public static final String AGGREGATE_MODULES = PLUGIN_PREFIX + "aggregateModules";
	public static final String AGGREGATE_MODULES_PROJECT_NAME = PLUGIN_PREFIX + "aggregateProjectName";
	public static final String AGGREGATE_MODULES_PROJECT_TOKEN = PLUGIN_PREFIX + "aggregateProjectToken";
	public static final String REQUESTER_EMAIL = PLUGIN_PREFIX + "requesterEmail";

	/* --- Errors --- */

    public static final String ERROR_SERVICE_CONNECTION = "Error communicating with service: ";
	public static final String ERROR_SHA1 = "Error calculating SHA-1";

	/* --- Constructors --- */
	
	/**
	 * Private default constructor
	 */
	private Constants() {
		// avoid instantiation
	}

}