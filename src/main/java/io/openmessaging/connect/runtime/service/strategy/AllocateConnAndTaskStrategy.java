/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package io.openmessaging.connect.runtime.service.strategy;

import io.openmessaging.connect.runtime.common.ConnAndTaskConfigs;
import io.openmessaging.connect.runtime.common.ConnectKeyValue;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Connectors and tasks distribute strategy.
 */
public interface AllocateConnAndTaskStrategy {

    /**
     * Allocate connectors and tasks to current worker
     * @param allWorker All alive worker info.
     * @param curWorker Current worker.
     * @param connectorConfigs All connector configs.
     * @param taskConfigs All task configs.
     * @return
     */
    ConnAndTaskConfigs allocate(Set<String> allWorker, String curWorker, Map<String, ConnectKeyValue> connectorConfigs,
        Map<String, List<ConnectKeyValue>> taskConfigs);
}
