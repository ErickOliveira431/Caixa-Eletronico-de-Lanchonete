import java.util.Scanner;

void main(){
        Scanner leitor = new Scanner(System.in);

        // Pergunta se tem cadastro
        System.out.println("você tem cadastro sim ou não");
        String cadastro = leitor.nextLine();

        // If se tiver cadastro ou não
        if (cadastro.equals("não") || cadastro.equals("nao") || cadastro.equals("n")) {
            System.out.println("=====faça seu cadastro====\n");

            System.out.println("digite seu nome");
            String nome = leitor.nextLine();

            System.out.println("digite os dados do cartão 'opcional'");
            int nCartao = leitor.nextInt();

            String pegadinha = leitor.nextLine();

        } else if (cadastro.equals("sim") || cadastro.equals("s")) {

            System.out.println("digite o seu login");
            String login = leitor.nextLine();
            System.out.println("logado com sucesso");

        }

        System.out.println("digite a forma de pagamento d = dinheiro e c = cartão");
        String formaPg = leitor.nextLine();
        char pg = formaPg.charAt(0);

        int opcao;
        double total = 0;

        do {
            System.out.println("\n===== CARDAPIO =====");
            System.out.println("1 - Hamburguer (R$ 15.00)");
            System.out.println("2 - Suco (R$ 7.00)");
            System.out.println("3 - Batata frita (R$ 10.00)");
            System.out.println("0 - Finalizar pedido");
            System.out.println("Escolha uma opcao: ");

            opcao = leitor.nextInt();
            switch (opcao) {
                case 1:
                    total += 15.0;
                    System.out.println("hamburguer adicionado " + total);
                    break;
                case 2:
                    total += 7.0;
                    System.out.println("suco adicionado " + total);
                    break;
                case 3:
                    total += 10.0;
                    System.out.println("batata adicionado " + total);
                    break;
                case 0:
                    System.out.println("pedido finalizado");
                    break;
                default:
                    System.out.println("digite um item que tem no cardapio");
                    break;
            }
        } while (opcao != 0);

    final double DESCONTO = 0.10;
    double totalFinal = total;
    String msg;

    if (total > 30 && cadastro.equals("sim")) {
        totalFinal = total - (total * DESCONTO);
            msg = "sim";
        } else {
            msg= "não";
    }
    System.out.println("o total ficou:"+ totalFinal);
    System.out.println("desconto:"+ msg);

}
