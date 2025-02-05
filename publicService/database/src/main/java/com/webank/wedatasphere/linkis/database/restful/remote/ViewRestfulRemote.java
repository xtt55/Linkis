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

package com.webank.wedatasphere.linkis.database.restful.remote;

import com.webank.wedatasphere.linkis.database.domain.View;
import com.webank.wedatasphere.linkis.database.util.Constants;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;
/**
 * Created by shanhuang on 9/13/18.
 */
//@FeignClient(name = Constants.APPLICATION_NAME)
public interface ViewRestfulRemote {

    @GetMapping("/api/view/find")
    public Response find(@RequestParam("name") String name, HttpServletRequest req);

    @PostMapping("/api/view/create")
    public Response create(View view, HttpServletRequest req);

}
