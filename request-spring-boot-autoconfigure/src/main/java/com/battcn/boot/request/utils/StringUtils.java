package com.battcn.boot.request.utils;

/**
 * @author Levin
 * @since 2018/12/20 0020
 */
public class StringUtils {

    public static final String DEFAULT_CHARSET = "UTF-8";

    public static String defaultString(final String str, final String defaultStr) {
        return str == null ? defaultStr : str;
    }

}
