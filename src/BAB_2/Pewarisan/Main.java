package BAB_2.Pewarisan;

public class Main {
    public static void main(String[] args) {
        Tabung gelas = new Tabung();
        System.out.println("=========== Lingkaran ==========");
        gelas.input();
        gelas.LKlingkaran();
        System.out.println();

        System.out.println("=========== Tabung ==========");
        System.out.println("Volume Tabung adalah : "+gelas.tabung());
        System.out.println("Luas Tabung adalah : "+gelas.LuasTabung());
    }
}
