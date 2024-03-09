public class Relogio {
    private int hora;
    private int minuto;
    private int segundo;

    public Relogio(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void adicionarHora(int horas) {
        this.hora = (this.hora + horas) % 24;
    }

    public void adicionarMinuto(int minutos) {
        int totalMinutos = this.hora * 60 + this.minuto + minutos;
        this.hora = (totalMinutos / 60) % 24;
        this.minuto = totalMinutos % 60;
    }

    public void adicionarSegundo(int segundos) {
        int totalSegundos = this.hora * 3600 + this.minuto * 60 + this.segundo + segundos;
        this.hora = (totalSegundos / 3600) % 24;
        this.minuto = (totalSegundos / 60) % 60;
        this.segundo = totalSegundos % 60;
    }

    public void exibirHorario() {
        System.out.printf("%02d:%02d:%02d%n", this.hora, this.minuto, this.segundo);
    }

    public static void main(String[] args) {
        Relogio relogio = new Relogio(12, 30, 45);

        relogio.adicionarHora(2);
        relogio.adicionarMinuto(15);
        relogio.adicionarSegundo(30);

        System.out.print("Horário final: ");
        relogio.exibirHorario();
    }
}