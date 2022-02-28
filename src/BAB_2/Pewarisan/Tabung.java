package BAB_2.Pewarisan;

public class Tabung extends Lingkaran {
    double t = 10;
    Lingkaran ling = new Lingkaran();

    public void input() {
        System.out.println("Jari - jari Lingkaran : "+jari);
        System.out.println(" 'V' Lingkaran : "+v);
    }
    public void LKlingkaran() {
        System.out.println("Luas Lingkaran : "+ling.lingkaran());
        System.out.println("Keliling Lingkaran : "+ling.Keliling());
    }
    public double tabung() {
        return lingkaran() * t;
    }
    public double LuasTabung() {
        return (2 * lingkaran()) + (Keliling() * t);
    }
}
