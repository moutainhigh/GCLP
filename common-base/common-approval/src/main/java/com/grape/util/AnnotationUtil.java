package com.grape.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 用做判断该类或方法是否有使用某个注解
 * <ul>
 * 历史记录
 * <li>lijl - 1.0 - 2015年5月15日</li>
 * </ul>
 * .
 */
public final class AnnotationUtil {
    /**
     * 默认构造方法，不开放
     * <ul>
     * 历史记录
     * <li>lijl - 1.0 - 2015年5月15日</li>
     * </ul>
     * .
     */
    private AnnotationUtil() {
    };

    /**
     * 判断该类是否有注解
     * <ul>
     * 历史记录
     * <li>lijl - 1.0 - 2015年5月15日</li>
     * </ul>
     * .
     * 
     * @param obj
     * @param annotation
     * @return True | False
     */
    public static boolean chkClass(Object obj, Class<? extends Annotation> annotation) {
        Class<?> clazz;
        if (obj instanceof Class) {
            clazz = (Class<?>) obj;
        } else {
            clazz = obj.getClass();
        }

        return clazz.isAnnotationPresent(annotation);
    }
    
    
    /**
     * 获取该类的注解
     * <ul>历史记录
     *     <li>lijl - 1.0 - 2015年5月20日</li>
     * </ul>
     * .
     * @param obj
     * @param annotation
     * @return Annotation
     */
    public static <T extends Annotation> T getAnnotataion(Object obj, Class<T> annotation) {
        Class<?> clazz;
        if (obj instanceof Class) {
            clazz = (Class<?>) obj;
        } else {
            clazz = obj.getClass();
        }

        return clazz.getAnnotation(annotation);
    }

    /**
     * 
     * 判断是否该方法有某注解
     * <ul>
     * 历史记录
     * <li>lijl - 1.0 - 2015年5月15日</li>
     * </ul>
     * .
     * 
     * @param obj
     * @param method
     * @param annotation
     * @return True | False
     * @throws SecurityException
     * @throws NoSuchMethodException
     */
    public static boolean chkMethod(Object obj, String methodnm, Class<? extends Annotation> annotation) throws SecurityException, NoSuchMethodException {
        return chkMethod(obj, methodnm, null, annotation);
    }

    /**
     * 判断是否该方法有某注解
     * <ul>
     * 历史记录
     * <li>lijl - 1.0 - 2015年5月15日</li>
     * </ul>
     * .
     * 
     * @param obj
     * @param method
     * @param classes
     * @param annotation
     * @return True | False
     * @throws SecurityException
     * @throws NoSuchMethodException
     */
    public static boolean chkMethod(Object obj, String methodnm, Class<?>[] classes, Class<? extends Annotation> annotation) throws SecurityException, NoSuchMethodException {
        Class<?> clazz;
        if (obj instanceof Class) {
            clazz = (Class<?>) obj;
        } else {
            clazz = obj.getClass();
        }
        return chkMethod(clazz.getMethod(methodnm, classes), annotation);
    }

    /**
     * 判断是否该方法有某注解
     * <ul>
     * 历史记录
     * <li>lijl - 1.0 - 2015年5月15日</li>
     * </ul>
     * .
     * 
     * @param method
     * @param annotation
     * @return True | False
     */
    public static boolean chkMethod(Method method, Class<? extends Annotation> annotation) {
        return method.isAnnotationPresent(annotation);
    }

    /**
     * 获取该方法的注解
     * <ul>
     * 历史记录
     * <li>lijl - 1.0 - 2015年5月20日</li>
     * </ul>
     * .
     * 
     * @param method
     * @param annotation
     * @return Annotation
     */
    public static <T extends Annotation> T getAnnotataion(Method method, Class<T> annotation) {
        return method.getAnnotation(annotation);
    }

    /**
     * 获取该方法的注解
     * <ul>
     * 历史记录
     * <li>lijl - 1.0 - 2015年5月20日</li>
     * </ul>
     * .
     * 
     * @param obj
     * @param methodnm
     * @param annotation
     * @return Annotation
     * @throws SecurityException
     * @throws NoSuchMethodException
     */
    public static <T extends Annotation> T getMethodAnnotataion(Object obj, String methodnm, Class<T> annotation) throws SecurityException, NoSuchMethodException {
        return getMethodAnnotataion(obj, methodnm, null, annotation);
    }

    /**
     * 获取该方法的注解
     * <ul>
     * 历史记录
     * <li>lijl - 1.0 - 2015年5月20日</li>
     * </ul>
     * .
     * 
     * @param obj
     * @param methodnm
     * @param classes
     * @param annotation
     * @return Annotation
     * @throws SecurityException
     * @throws NoSuchMethodException
     */
    public static <T extends Annotation> T getMethodAnnotataion(Object obj, String methodnm, Class<?>[] classes, Class<T> annotation) throws SecurityException, NoSuchMethodException {
        Class<?> clazz;
        if (obj instanceof Class) {
            clazz = (Class<?>) obj;
        } else {
            clazz = obj.getClass();
        }
        return getAnnotataion(clazz.getMethod(methodnm, classes), annotation);
    }

    /**
     * 判断是否该字段有某注解
     * <ul>
     * 历史记录
     * <li>lijl - 1.0 - 2015年5月15日</li>
     * </ul>
     * .
     * 
     * @param obj
     * @param fieldnm
     * @param annotation
     * @return True | False
     * @throws SecurityException
     * @throws NoSuchFieldException
     */
    public static boolean chkField(Object obj, String fieldnm, Class<? extends Annotation> annotation) throws SecurityException, NoSuchFieldException {
        Class<?> clazz;
        if (obj instanceof Class) {
            clazz = (Class<?>) obj;
        } else {
            clazz = obj.getClass();
        }

        return chkField(clazz.getDeclaredField(fieldnm), annotation);
    }

    /**
     * 判断是否该字段有某注解
     * <ul>
     * 历史记录
     * <li>lijl - 1.0 - 2015年5月15日</li>
     * </ul>
     * .
     * 
     * @param field
     * @param annotation
     * @return True | False
     */
    public static boolean chkField(Field field, Class<? extends Annotation> annotation) {
        return field.isAnnotationPresent(annotation);
    }

    /**
     * 获取该字段的注解
     * <ul>
     * 历史记录
     * <li>lijl - 1.0 - 2015年5月20日</li>
     * </ul>
     * .
     * 
     * @param field
     * @param annotation
     * @return Annotation
     */
    public static <T extends Annotation> T getAnnotataion(Field field, Class<T> annotation) {
        return field.getAnnotation(annotation);
    }

    /**
     * 获取该字段的注解
     * <ul>
     * 历史记录
     * <li>lijl - 1.0 - 2015年5月20日</li>
     * </ul>
     * .
     * 
     * @param obj
     * @param fieldnm
     * @param annotation
     * @return Annotation
     * @throws SecurityException
     * @throws NoSuchFieldException
     */
    public static <T extends Annotation> T getFieldAnnotataion(Object obj, String fieldnm, Class<T> annotation) throws SecurityException, NoSuchFieldException {
        Class<?> clazz;
        if (obj instanceof Class) {
            clazz = (Class<?>) obj;
        } else {
            clazz = obj.getClass();
        }
        return getAnnotataion(clazz.getDeclaredField(fieldnm), annotation);
    }

}
