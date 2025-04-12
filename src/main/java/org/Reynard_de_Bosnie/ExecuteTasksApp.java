package org.Reynard_de_Bosnie;

import org.Reynard_de_Bosnie.utils.TaskExecutor;
import org.Reynard_de_Bosnie.utils.TaskFinder;
import org.Reynard_de_Bosnie.utils.TaskHolder;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.util.Scanner;
import java.util.TreeMap;

public class ExecuteTasksApp {

    public static final String PACKAGE = "org.Reynard_de_Bosnie";

    public static void main(String[] args) throws IOException, URISyntaxException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        TreeMap<Integer, TaskHolder> tasks = TaskFinder.findTasksExtended(PACKAGE);
        for (TaskHolder task : tasks.values()) {
            System.out.println("Номер задачи: " + task.getId() + ": " + task.getDescriptor());
        }
        System.out.println("ПРОВЕРИТЬ: 14 (и поставить что github приведён в порядок (.   _ .))");
        System.out.println("test");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите номер задачи для запуска");
            TaskHolder taskHolder = tasks.get(scanner.nextInt());
            if (taskHolder != null) {
                TaskExecutor.executeTask(taskHolder.getTaskClass());
            } else {
                System.out.println("Task not found");
            }
        }

    }
}
