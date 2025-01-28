// 231232028 - Falmesino Abdul Hamid

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String args[]) throws Exception {
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

    // Instance of Class
    Manusia[] m = new Manusia[2];

    // Deklarasi variable
    int x = 0;

    do {
      // Input
      System.out.println("User " + (x + 1));
      System.out.println("Masukkan tinggi badan anda (cm): ");
      double t = Double.parseDouble(br.readLine());
      System.out.println("Masukkan jenis kelamin anda (L/P): ");
      String jk = br.readLine().toUpperCase();
      
      // Proses + Output
      String jkTeks = (jk.equals("L")) ? "Laki-Laki" : "Perempuan";
      m[x] = (jk.equals("L")) ? new LakiLaki(t) : new Perempuan(t);
      
      System.out.println("Berat badan ideal anda (" + jkTeks + ") adalah: " + m[x].HtgBBI());
      System.out.println("");

      x++;

    } while (x < 2);
  }
}