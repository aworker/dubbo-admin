package org.apache.dubbo.admin.controller;

import org.apache.dubbo.admin.model.domain.Config;
import org.apache.dubbo.admin.model.dto.ConfigDTO;
import org.apache.dubbo.admin.service.ConfigCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author limingyuan001
 * @createtime 2019/7/12
 * @description
 */
@RestController
@RequestMapping("api/{env}/group")
public class GroupController {
    private final ConfigCenterService configCenterService;

    @Autowired
    public GroupController(ConfigCenterService configCenterService) {
        this.configCenterService = configCenterService;
    }

    @RequestMapping(value = "default",method = RequestMethod.GET)
    public ConfigDTO getDefault(){
        Config aDefault = configCenterService.getDefault();
        return null;
    }
}
