package TeoremaMestre;

import java.util.Scanner;

public class TeoremaMestre {
    public static double calculaLog(double valor, double base) {
        return Math.log(valor) / Math.log(base);
    }

    public static String teoremaMestre(int a, int b, int ord) {
        double ordN = calculaLog(a, b);
        String saida = "";

        if(ord < ordN) {
            saida += "n**" + ordN;
        } else if(ord == ordN) {
            saida += "n**" + ord + " * " + "log n";
        } else {
            saida += "n**" + ord;
        }
        return "T(n) = theta(" + saida + ")";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mestre = new int[3];

        String[] entradasString = sc.nextLine().split(" ");
        for(int i = 0; i < entradasString.length; i++) {
            mestre[i] = Integer.parseInt(entradasString[i]);
        }

        System.out.println(teoremaMestre(mestre[0], mestre[1], mestre[2]));
    }
}