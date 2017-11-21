/*
 * Copyright 2017 flow.ci
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.flow.platform.plugin.service;

import com.flow.platform.plugin.domain.Plugin;
import java.nio.file.Path;
import java.util.List;

/**
 * @author yh@firim
 */
public interface PluginService {

    /**
     * show plugin list
     */
    List<Plugin> list();

    /**
     * install plugin
     */
    void install(String pluginName);

    void doInstall(String pluginName);

    /**
     * uninstall plugin
     */
    void uninstall(String pluginName);

    /**
     * plugin store place
     * @return
     */
    Path workspace();

    Plugin update(Plugin plugin);
}
