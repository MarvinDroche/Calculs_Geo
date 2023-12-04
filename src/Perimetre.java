public class Perimetre {
    public static int perimetre(int a, int b, int c){
        Addition addition = new Addition();
        Produit produit = new Produit();

        return produit.prod(addition.add(a, b), c);
    }
}
