package ma.emsi.nyazi;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.googleai.GoogleAiGeminiChatModel;

public class Test1 {
    public static void main(String[] args) {
        String cle= System.getenv("GEMINI_KEY");
        // Création du modèle
        ChatModel modele = GoogleAiGeminiChatModel
                .builder()
                .apiKey(cle)
                .modelName("gemini-2.5-flash")
                .temperature(0.7)
                .build();
        // Pose une question au modèle
        String reponse= modele.chat("donne moi une bonne demarche pour planifier mon programme de semaine");
        System.out.println(reponse);
    }
}
