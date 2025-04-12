package org.Reynard_de_Bosnie.utils;

import org.Reynard_de_Bosnie.TaskDescription;
import org.reflections.Reflections;
import org.reflections.scanners.Scanners;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class TaskFinder {
    @SuppressWarnings("unchecked")
    public static TreeMap<Integer, TaskHolder> findTasksExtended(String path) throws IOException, URISyntaxException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        TreeMap<Integer, TaskHolder> taskHolderTreeMap = new TreeMap<>();
        Reflections reflections = new Reflections(path);

        Set<Class<?>> annotations = reflections.get(Scanners.TypesAnnotated.with(TaskDescription.class).asClass());
        Set<Class<? extends Solution>> interfaces = reflections.getSubTypesOf(Solution.class);


        Set<Class<? extends Solution>> collect = interfaces.stream()
                .filter(annotations::contains).collect(Collectors.toSet());


        for (Class<? extends Solution> aClass : collect) {
            TaskDescription annotation = aClass.getAnnotation(TaskDescription.class);
            TaskHolder taskHolder = TaskHolder.builder()
                    .taskClass(aClass)
                    .id(annotation.taskNumber())
                    .descriptor(annotation.taskDescription())
                    .build();

            taskHolderTreeMap.put(annotation.taskNumber(), taskHolder);
        }
        return taskHolderTreeMap;
    }

}
