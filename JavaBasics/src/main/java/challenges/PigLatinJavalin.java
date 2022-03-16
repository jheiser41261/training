package challenges;

import io.javalin.Javalin;

public class PigLatinJavalin {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(9000);

        app.get("/piglatin/{word}", context -> {
           String word = context.pathParam("word");
           if (PigLatin.isValidSentence(word))
               context.result(PigLatin.encrypt(word));
        });

        app.get("/piglatin", context -> {
           String word = context.queryParam("word");
           if (PigLatin.isValidSentence(word))
               context.result(PigLatin.encrypt(word));
        });
    }
}
