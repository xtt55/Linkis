/*
 * Copyright 2019 WeBank
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
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

package com.webank.wedatasphere.linkis.database.dao;

import com.webank.wedatasphere.linkis.database.domain.DataSource;
/**
 * Created by shanhuang on 9/13/18.
 */
public interface DataSourceDao {

    void insert(DataSource dataSource);

    void deleteById(Integer id);

    void update(DataSource dataSource);

    DataSource getByViewId(Integer viewId);

    DataSource getById(Integer id);
}
