import io.javalin.Javalin;
import java.util.*;
import io.javalin.http.Handler;
import objects.Exam;

public class Main {

  static ArrayList<Exam> exams = new ArrayList<>();

    public static void main(String[] args) {
        
        Javalin app = Javalin.create().start(4100);

        exams.add(new Exam("Ashoka", 85));
        exams.add(new Exam("Brittany", 79));
        exams.add(new Exam("Nancy", 97));
        exams.add(new Exam("Ed", 50));

        app.get("/", ctx -> ctx.render("index.jte"));

        app.get("/exams", examHandler);

    }

    static Handler examHandler = ctx -> {
      ctx.render("exam.jte", Collections.singletonMap("exams", exams));
    };

}
