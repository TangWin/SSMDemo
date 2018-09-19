package com.tang.util;

import com.google.gson.Gson;

import java.io.Reader;
import java.lang.reflect.Type;

public class GsonUtils {
    private static Gson gson = new Gson();

    public static Gson getGson() {
        return gson;
    }

    public static void setGson(Gson gson) {
        GsonUtils.gson = gson;
    }

    public static <T> T fromJson(String jsonStr, Type type) {
        try {
            return gson.fromJson(jsonStr, type);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static <T> T fromJson(Reader reader, Type type) {
        try {
            return gson.fromJson(reader, type);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static <T> T fromJson(Reader json, Class<T> clazz) {
        try {
            return gson.fromJson(json, clazz);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static <T> T fromJson(String json, Class<T> clazz) {
        try {
            return gson.fromJson(json, clazz);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String toJson(Object object) {
        try {
            return gson.toJson(object);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public static <T> String toJson(Class<T> clazz) {
        try {
            return gson.toJson(clazz);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
