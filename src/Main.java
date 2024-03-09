import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);


                System.out.print("Digite as horas iniciais: ");
                int horas = scanner.nextInt();

                System.out.print("Digite os minutos iniciais: ");
                int minutos = scanner.nextInt();

                System.out.print("Digite os segundos iniciais: ");
                int segundos = scanner.nextInt();


                Relogio relogio = new Relogio(horas, minutos, segundos);


                System.out.print("Digite a quantidade de horas a serem adicionadas: ");
                int horasAdicionais = scanner.nextInt();
                relogio.adicionarHora(horasAdicionais);


                System.out.print("Digite a quantidade de minutos a serem adicionados: ");
                int minutosAdicionais = scanner.nextInt();
                relogio.adicionarMinuto(minutosAdicionais);


                System.out.print("Digite a quantidade de segundos a serem adicionados: ");
                int segundosAdicionais = scanner.nextInt();
                relogio.adicionarSegundo(segundosAdicionais);


                System.out.print("Horário inicial: ");
                relogio.exibirHorario();


                System.out.print("Horário final: ");
                relogio.exibirHorario();

                scanner.close();
            }
        }