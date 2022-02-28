package BAB_3;

// overriding dan overloading
public class persegiPanjang {
    double sisi, panjang;

    persegiPanjang (int s, int p) {
        this.sisi = s;
        this.panjang = p;
    }
    void luas() {
        System.out.println("Luas persegi adalah : "+(2 * this.sisi + this.panjang));
    }
    void luas(int s, int p) {
        this.sisi = s;
        this.panjang = p;
        System.out.println("Overloading Luas persegi adalah : "+(2 * this.sisi + this.panjang));
    }

    public static void main(String[] args) {
        persegiPanjang segi = new persegiPanjang(3,6);
        balok lok = new balok(3, 6);

        segi.luas();
        lok.luas();

        // Overloading
        segi.luas(5, 8);
        lok.luas(5, 8);

    }
}

class balok extends persegiPanjang {
    balok(int s, int p) {
        super(s, p);
    }
    void luas() {
        System.out.println("Luas permukaan balok adalah : "+this.sisi * this.panjang);
    }
    void luas(int s, int p) {
        this.sisi = s;
        this.panjang = p;
        System.out.println("Overloading luas permukaan kubus adalah : "+(this.sisi * this.panjang));
    }
}
