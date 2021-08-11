package com.utaha.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.text.SimpleDateFormat;

public class JsonUtils {

    public static String getJson(Object o) {
        return getJson(o, "yyyy-mm-dd hh:mm:ss");
    }

    public static String getJson(Object o, String dateFormat) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
            mapper.setDateFormat(simpleDateFormat);
            String value = mapper.writeValueAsString(o);
            return value;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
