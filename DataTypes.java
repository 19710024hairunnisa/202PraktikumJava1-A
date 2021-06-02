import javax.swing.JOptionPane;

public class DataTypes{
  public static void  main(String[]args){
      String namaDepan = "Hairun";
      String namaBelakang  = "Nisa";
      int usia = 18;
      int targetTahunKuliah = 4;
      double ipk = 3.8998;
      char nilaiAbjad = 'A';
      boolean cantik = true;

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