import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jr , tinggi;
        System.out.println("===========Menghitung Volume Tabung==========");
        System.out.println("Rumus Tabung: Luas Alas x Tinggi tabung");

        System.out.println("Masukkan jari-jari (cm)");
        jr = input.nextInt();
        System.out.println("Masukkan tinggi (cm)");
        tinggi = input.nextInt();

        double phi = 22.0 / 7.0;
        double alas = phi*jr*jr;
        double volume = alas*tinggi;
        System.out.println("Luas alasnya adalah: " + alas);
        System.out.println("Jadi Volume nya adalah: " + volume);
        
        

    }
    
}
