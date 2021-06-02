public class DataTypes{
  public static void  main(String[]args){
      String namaDepan = "Hairun";
      String namaBelakang  = "Nisa";
      int usia = 18;
      int targetTahunKuliah = 4;
      double ipl = 3.8998;
      char nilaiAbjad = 'A';
      boolean cantik = true;

      System.out.println("Nama Lengkap : " + " " 
	+ namaDepan +" " +namaBelakang);

      System.out.println("Usia : " + usia + " Tahun");
      System.out.println("Usia ketika lulus : " + (usia + targetTahunKuliah) + " Tahun");
      JOptionPane.showMessageDialog(null, "Hai " + namaDepan +" " +namaBelakang);


  }
}