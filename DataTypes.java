import javax.swing.JOptionPane;
import java.util.Scanner;

public class DataTypes{
  public static void  main(String[]args){

     Scanner scanner = new Scanner(System.in);

      String namaDepan = "Hairun";
      String namaBelakang  = "Nisa";
      int usia = 18;
      int targetTahunKuliah = 4;
      double ipk = 3.8998;
      char nilaiAbjad = 'A';
      boolean cantik = true;

      System.out.print("Input Nama Depan :   ");
      namaDepan = scanner.nextLine();
      System.out.print("Input Usia :   ");
      usia = scanner.nextInt(); 
      System.out.print("Input IPK :   ");
      ipk = scanner.nextDouble();
      System.out.print("");
      System.out.print("Input Nilai Abjad :   ");
      nilaiAbjad = scanner.next().charAt(0);
      System.out.print("Cantik? :   ");
      cantik = scanner.nextBoolean();


      System.out.println("==================OUTPUT=================");
      System.out.println("Nama Lengkap : " + " " 
	+ namaDepan +" " +namaBelakang);

      System.out.println("Usia : " + usia + " Tahun");
      System.out.println("Usia ketika lulus : " + (usia + targetTahunKuliah) + " Tahun"); 
      System.out.println("IPK : " + ipk);
      System.out.println("Nilai PBO : " + nilaiAbjad);
      System.err.println("Cantik : " + cantik);

      JOptionPane.showMessageDialog(null,"Hai, " + namaDepan +" " +namaBelakang);

  }
}