package cwiczenia_11;

class Obuwie {
    private int rozmiar;
    public Obuwie() {}
    public Obuwie(int rozmiar) {
        this.rozmiar = rozmiar;
    }
    protected int pobtRozmiar() {
        return rozmiar;
    }

}

class Adidas extends Obuwie {
    private final String KrajProd = "China";
    private String nazwa;
	private int cena;

    public Adidas() {}
    public Adidas(int rozmiar, int cena, String nazwa) {
        super(rozmiar);
        this.cena = cena;
        this.nazwa = nazwa;
    }

    public void print() {
        System.out.print(nazwa + "ZX-750 \nRozmiar ktory ci odpowiada: " + super.pobtRozmiar());
    }

    public int pobCene() {
        return cena;
    }
}

public class Zad2 {
    public static void main(String[] args) {
    	Adidas info = new Adidas(44, 499,"Adidas ");
    	info.print();
        System.out.print("\nCena towaru: " + info.pobCene()+" Zl");
        System.out.print("Modyfikacja pliku");
    }
}