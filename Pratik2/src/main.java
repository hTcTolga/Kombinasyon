import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int N, r, Nr;
        int totalN =1;
        int totalr=1;
        int totalnr=1;
        int kombinasyon;
        Scanner girdi = new Scanner(System.in);
        System.out.print("N eleman sayısını giriniz: ");
        N=girdi.nextInt();
        System.out.print("r eleman sayısını giriniz: ");
        r=girdi.nextInt();


        for (int i = 1; i <= N ; i++) {
            totalN = totalN * i;
        }
        for ( int j = 1; j <= r ; j++){
            totalr = totalr * j;
        }
        Nr= N-r;
        for (int x=1; x <= Nr ;x++){
            totalnr= totalnr* x;
        }
        kombinasyon=totalN/(totalr*totalnr);

        System.out.println("N! : "+totalN);
        System.out.println("r! : "+totalr);
        System.out.println("(n-r)! = değeri : "+totalnr);
        System.out.println("Kombinasyon Sonucu: "+ kombinasyon);


    }
}
