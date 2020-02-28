package org.apache.dubbo.admin.service;


import org.apache.dubbo.admin.model.domain.Config;

import java.util.List;

/**
 * 许可添加新的配置信息
 */
public interface ConfigCenterService {

    /**
     * 添加一个新的配置中心实例
     *
     * @param address
     * @param group
     * @param username
     * @param password
     * @return
     */
    boolean addConfigCenter(String address, String group, String username, String password);

    /**
     * 获取默认的配置中心信息（通过application.properties添加的)
     * @return
     */
    Config getDefault();

    List<Config> getAllConfigCenter();
}
