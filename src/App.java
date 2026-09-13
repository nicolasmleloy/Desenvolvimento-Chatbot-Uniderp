import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("     ASSISTENTE VIRTUAL UNIDERP          ");
        System.out.println("=========================================");
        System.out.println("Bot: Olá! Sou o assistente virtual da universidade.");
        System.out.println("Bot: Como posso ajudar você hoje?");

        String mensagem = "";
        
        String estadoAtual = "INICIAL"; 

        while (!mensagem.equals("tchau") && !mensagem.equals("sair")) {
            System.out.print("\nVocê: ");
            
            mensagem = scanner.nextLine().toLowerCase().trim();

            if (estadoAtual.equals("AGUARDANDO_OPCAO_BIBLIOTECA")) {
                if (mensagem.contains("1") || mensagem.contains("horario") || mensagem.contains("hora")) {
                    System.out.println("Bot: A biblioteca funciona de segunda a sexta, das 07h às 22h.");
                } else if (mensagem.contains("2") || mensagem.contains("onde") || mensagem.contains("local")) {
                    System.out.println("Bot: A biblioteca está localizada no Bloco 3, no térreo, próximo ao estacionamento da Ceará.");
                } else {
                    System.out.println("Bot: Opção não reconhecida. Para a biblioteca, consulte o site da universidade.");
                }
                estadoAtual = "INICIAL";
                continue;
            }

            if (mensagem.contains("tchau") || mensagem.contains("sair") || mensagem.contains("encerrar")) {
                System.out.println("Bot: Até mais! Tenha um ótimo dia.");
                break;
            } 
            
            
            else if (mensagem.contains("oi") || mensagem.contains("olá") || mensagem.contains("ola")) {
                System.out.println("Bot: Olá! Como posso ajudar você?");
            } 
            
            else if (mensagem.contains("carteirinha") && (mensagem.contains("segunda via") || mensagem.contains("perdi"))) {
                System.out.println("Bot: Para solicitar a 2ª via da carteirinha, acesse a opção Serviços no portal do aluno.");
            }
            
            else if ((mensagem.contains("matricula") || mensagem.contains("matrícula")) && (mensagem.contains("prazo") || mensagem.contains("quando"))) {
                System.out.println("Bot: O prazo de rematrícula para este semestre vai até o dia 20 deste mês.");
            }

            else if (mensagem.contains("matricula") || mensagem.contains("matrícula")) {
                System.out.println("Bot: Para realizar sua matrícula, acesse o portal acadêmico ou vá até a Secretaria.");
            } 

            else if (mensagem.contains("biblioteca")) {
                System.out.println("Bot: O que você deseja saber sobre a biblioteca?");
                System.out.println("     1 - Horário de funcionamento");
                System.out.println("     2 - Localização/Onde fica");
                estadoAtual = "AGUARDANDO_OPCAO_BIBLIOTECA";
            } 

            else if (mensagem.contains("secretaria")) {
                System.out.println("Bot: A secretaria atende presencialmente das 08h às 18h.");
            } 

            else if (mensagem.contains("boleto") || mensagem.contains("financeiro") || mensagem.contains("mensalidade")) {
                System.out.println("Bot: Você pode baixar seus boletos e verificar débitos no Portal do Aluno > Financeiro.");
            } 

            else if (mensagem.contains("obrigado") || mensagem.contains("valeu") || mensagem.contains("obrigada")) {
                System.out.println("Bot: Por nada! Estou à disposição se precisar de mais algo.");
            } 

            else {
                System.out.println("Bot: Desculpe, não entendi sua solicitação.");
                System.out.println("Bot: Você pode perguntar sobre: Biblioteca, Secretaria, Matrícula ou Financeiro.");
            }
        }

        scanner.close();
    }
}