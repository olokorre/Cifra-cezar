import java.util.Scanner;
public class crip {
    static Scanner aa = new Scanner(System.in);//apenas cria o scanner
    public static void main(String[] args) {//main
        esp();// espaço - ln:44
        System.out.print("Olá, o que gostaria de fazer primeiro?\nCriptorafar = 1  Descriptografar = 2:\n> ");
        String sn = aa.nextLine();// teste fidelidade do jõao cleber
        if (sn.equals("1")) {
            cri(); // envoca o poder de esconder - ln:18
        } else if (sn.equals("2")) {
            dcr();// pder de desesconder - ln:31
        } else {
            esp();
            System.out.println("A não vai toma no cu!");// caso você não saiba ler
            System.exit(0);
        }
    }
    public static void cri() {
        esp();
        System.out.print("Dite a palavra a ser codificada: ");
        String pal = aa.nextLine(), pqu = "";
        esp();
        System.out.print("Agora digite a chave: ");
        int chv = aa.nextInt(), tm = pal.length();
        esp();
        for (int i = 0; i < tm; i++) {// embaralha
            pqu = pqu + (char)(pal.charAt(i) + chv);
        }
        System.out.println("Aqui está: "+ pqu);
    }
    public static void dcr() {
        esp();
        System.out.print("Digite o código: ");
        String pcd = aa.nextLine(), dcd = "";
        esp();
        System.out.print("Agora digite a chave: ");
        int chv = aa.nextInt(), tm = pcd.length();
        esp();
        for (int i = 0; i < tm; i++) {
            dcd = dcd + (char)(pcd.charAt(i) - chv);//desembaralha
        }
        System.out.println("Aqui está: "+ dcd);
    }
    public static void esp() {
        for (int i = 0; i < 100; i++) {
            System.out.println("");
        }
    }
}