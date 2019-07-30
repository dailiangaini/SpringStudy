package com.dailiang.fallback;

import com.dailiang.api.ProviderFeign;
import org.springframework.stereotype.Component;

/**
 * @Author: D&L
 * @Description:
 * @Date: 2019-07-30 22:45
 */
@Component
public class ProviderFallback implements ProviderFeign {
    @Override
    public String geProvider() {
        return "Class ProviderFallback";
    }
}
