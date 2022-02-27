package BAB_2;
import javax.swing.*;

public class Enkapsulasi {
    public static void main(String[] args) {
        int pilihanSatu = Integer.parseInt(JOptionPane.showInputDialog(
                "Pilihan \n ========== \n" +
                " 1 . Biodata \n" +
                " 2 . Nilai \n\n" +
                " Masukkan Pilihan : "));
        if (pilihanSatu == 1) {
            biodata panggil = new biodata();
            JOptionPane.showMessageDialog(null,
                    "Nama : "+panggil.nama+ "\n"+ "NIS : "+panggil.NIS,
                    "Hasil Operasi", JOptionPane.INFORMATION_MESSAGE);
        } else if (pilihanSatu == 2) {
            nilai panggil1 = new nilai();
            JOptionPane.showMessageDialog(null,
                    "Nilai Semester 1 : "+panggil1.a+ "\n" + "Nilai Semester 2 : "+panggil1.b,
                    "Hasil Operasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}

class biodata {
    String nama = JOptionPane.showInputDialog("Masukkan Nama Anda : ");
    String NIS = JOptionPane.showInputDialog("Masukkan NIS Anda : ");
}

class nilai {
    double a = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Nilai Semester 1"));
    double b = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Nilai Semester 2"));
}
