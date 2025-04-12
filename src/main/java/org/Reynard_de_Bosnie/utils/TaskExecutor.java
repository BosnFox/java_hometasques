package org.Reynard_de_Bosnie.utils;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TaskExecutor {
    public static void executeTask(Class<? extends Solution> aClass) {
        try {
            Constructor<? extends Solution> constructor = aClass.getConstructor();
            Solution solution = constructor.newInstance();
            solution.execute();

        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException |
                 InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
