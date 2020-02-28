package org.apache.dubbo.admin.service.impl;

import org.apache.dubbo.admin.model.domain.Config;
import org.apache.dubbo.admin.service.ConfigCenterService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import org.apache.dubbo.registry.Registry;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author limingyuan001
 * @createtime 2019/7/9
 * @description
 */

@Component
public class ConfigCenterServiceImpl implements ConfigCenterService {

    @Value("${admin.registry.address}")
    private String address;

    @Value("${admin.registry.group}")
    private String group;

    @Value("${admin.config-center.username}")
    private String username;

    @Value("${admin.config-center.password}")
    private String password;

    private final Config defaultConfig;

    private Map<String,Config> configMap = new ConcurrentHashMap<>();

    public ConfigCenterServiceImpl(Registry registry) {
        defaultConfig = new Config();
        defaultConfig.setAddress(registry.getUrl().getProtocol() + "://" + registry.getUrl().getAddress());
        defaultConfig.setGroup(registry.getUrl().getParameter("group"));
        defaultConfig.setUsername(registry.getUrl().getUsername());
        defaultConfig.setPassword(registry.getUrl().getPassword());

        configMap.put(defaultConfig.getGroup(), defaultConfig);
    }



    @Override
    public boolean addConfigCenter(String address, String group, String username, String password) {
        Config config = new Config();
        config.setAddress(address);
        config.setGroup(group);
        config.setUsername(username);
        config.setPassword(password);
        configMap.put(config.getGroup(), config);
        return true;
    }

    @Override
    public Config getDefault() {
        return defaultConfig;
    }

    @Override
    public List<Config> getAllConfigCenter() {
        List<Config> list = new ArrayList<Config>();
        list.addAll(configMap.values());

        return list;
    }
}
