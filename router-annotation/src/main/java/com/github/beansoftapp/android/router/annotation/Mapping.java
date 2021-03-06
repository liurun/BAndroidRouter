package com.github.beansoftapp.android.router.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
// 此类暂时未用
public @interface Mapping {
    String name() default "HRouterMapping";
}
