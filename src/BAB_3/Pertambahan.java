package BAB_3;

// Overloading
public class Pertambahan {
    public void tambah1() {
        int a = 5, b = 10;

        System.out.println("Hasil pertambahan dari metod tambah1 ke-1 = "+(a+b));
    }
    public void tambah1(int x, int y) {
        System.out.println("Hasil pertambahan dari metod tambah1 ke-2 = "+(x+y));
    }

    public static void main(String[] args) {
        Pertambahan pp;
        pp = new Pertambahan();
        pp.tambah1();
        pp.tambah1(5, 5);
    }
}
