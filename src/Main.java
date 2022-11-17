import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner val =new Scanner(System.in);
        System.out.println(" entrer un nombre entier positif N");
        int N=val.nextInt();
        System.out.println(" entrer un nombre entier positif M");
        int M=val.nextInt();
        System.out.println(N+ " | " +M);
        int n=N, m=M;
        do {
            if(N>M){
               N=N-M;
                System.out.println(N+ " | " +M);
            }
                if(M>N){
                    M=M-N;
                    System.out.println(N+ " | " +M);
                }
        }while(N!=M);
        System.out.println("le PGCD de " +n+ " et " +m+ " vaut " +N);
    }
}