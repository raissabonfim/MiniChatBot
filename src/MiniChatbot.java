public class MiniChatbot {

    public void saudar() {
        System.out.println("MiniChatbot: Olá! Como posso ajudar?");
    }


    public void perguntarNome() {
        System.out.println("MiniChatbot: Eu sou o MiniChatbot, seu assistente virtual!");
    }


    public void comoEsta() {
        System.out.println("MiniChatbot: Estou funcionando perfeitamente, obrigado!");
    }


    public void respostaPadrao() {
        System.out.println("MiniChatbot: Desculpe, não entendi sua pergunta. Pode reformular?");
    }


    public void despedida() {
        System.out.println("MiniChatbot: Tchau! Até a próxima.");
    }


    public void responder(String mensagem) {
        // Comparação direta com "=="
        if (mensagem == "Oi" || mensagem == "Olá") {
            saudar();
        } else if (mensagem == "Qual é o seu nome?") {
            perguntarNome();
        } else if (mensagem == "Como você está?") {
            comoEsta();
        } else if (mensagem == "sair") {
            despedida();
        } else {
            respostaPadrao();
        }
    }

    public static void main(String[] args) {
        MiniChatbot chatbot = new MiniChatbot();


        String[] perguntas = {
                "Oi",
                "Como você está?",
                "Qual é o seu nome?",
                "sair"
        };


        for (int i = 0; i < perguntas.length; i++) {
            String pergunta = perguntas[i];
            System.out.println("Usuário: " + pergunta);
            chatbot.responder(pergunta);


            if (pergunta == "sair") {
                break;
            }
        }
    }
}