package BAB_3;

public class Nama {
    public void Sapa() {
        System.out.println("Ihsan Maulana");
    }

    public static void main(String[] args) {
        Siapa ss;
        Nama nn;
        ss = new Siapa();
        nn = new Nama();

        ss.Sapa();
        nn.Sapa();
    }
}

class Siapa extends Nama {
    public void Sapa() {
        System.out.println("Maulana Malik");
    }
}
