package com.epam.mmodule;

import by.latushko.clib.util.StringUtils;

import java.util.Arrays;

public class Utils {
    public static boolean isAllPositiveNumbers(String... str) {
        StringUtils utils = new StringUtils();
        return Arrays.stream(str).allMatch(utils::isPositiveNumber);
    }
}
