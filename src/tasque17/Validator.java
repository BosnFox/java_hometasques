package tasque17;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Validator {
    public static void validate(Object obj) throws Exception {
        try {
            Field[] fields = obj.getClass().getDeclaredFields();

            for (Field field : fields) {
                field.setAccessible(true);
                Object value = field.get(obj);

                if (field.isAnnotationPresent(NotNull.class) && value == null) {
                    System.out.println("Поле " + field.getName() + " не должно быть null.");
                }

                if (field.isAnnotationPresent(MaxLength.class)) {
                    MaxLength maxie = (MaxLength) field.getAnnotation(MaxLength.class);
                    if (field.get(obj).toString().length() > maxie.value()) {
                        System.out.println("Поле username превышает максимальную длину " + maxie.value());
                    }
                }
                if (field.isAnnotationPresent(Range.class)) {
                    Range min = field.getAnnotation(Range.class);
                    if (field.get(obj) != null && field.get(obj) instanceof Integer) {
                        if (((Integer)field.get(obj)) < min.min()) {
                            System.out.println("Поле age должно быть не меньше " + min.min());
                            throw new UFoolException();
                        }
                        if (((Integer)field.get(obj)) > min.max()) {
                            System.out.println("Поле age должно быть не более " + min.max());
                            throw new UFoolException();
                        }
                    }
                }
            }
        }
        catch (Exception e) {
            if (e instanceof UFoolException) {
                System.out.println("You. Are. TERRIBLE!");
            }
        }
    }
}
