package BAB_1;
import javax.swing.*;

public class dataSiswa {
    public static void main(String[] args) {
        siswaData data = new siswaData();
        data.input();
        data.output();
    }
}

class siswaData {
    String nis, nm, jurusan, kelas;

    void input() {
        nis = JOptionPane.showInputDialog("Nis : ");
        while (nis.length() < 8) {
            JOptionPane.showMessageDialog(null, "NIS TIDAK BOLEH KURANG DARI 8!");
            nis = JOptionPane.showInputDialog("Nis : ");
        }
        nm = JOptionPane.showInputDialog("Nama : ");
        jurusan = JOptionPane.showInputDialog("Jurusan : ");
        kelas = JOptionPane.showInputDialog("Kelas : ");
    }

    void output() {
        // OUTPUT UNTUK USER
        JFrame frame = new JFrame("DATA USER / DATA SISWA");
        JOptionPane.showMessageDialog(frame,
                "NIS : "+nis + "\n" +
                       "NAMA : "+nm + "\n" +
                    "JURUSAN : "+jurusan + "\n" +
                      "KELAS : "+kelas,
                "DATA SISWA", JOptionPane.INFORMATION_MESSAGE);
        // OUTPUT UNTUK SISTEM
        System.out.println("NIS     : "+nis);
        System.out.println("NAMA    : "+nm);
        System.out.println("JURUSAN : "+jurusan);
        System.out.println("KELAS   : "+kelas);
    }
}


