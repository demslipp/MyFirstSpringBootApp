package com.netcracker.bean;

public interface InitializingBean{
    void afterPropertiesSet() throws Exception;
}
