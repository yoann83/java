package perso;

public class BureauDeChange {
    public static void main(String[] args) {
        // Variables pour le montant initial et le taux de change
        double montantEuros = 1500.0;  // Montant en euros (rond, sans centimes)
        double tauxChange = 1.22;      // Taux de change : 1 EUR = 1.22 USD

        // Calcul de la conversion
        double montantDollars = montantEuros * tauxChange;

        // Affichage du résultat
        System.out.println("=== CONVERSION DE DEVISES ===");
        System.out.println("Montant initial : " + montantEuros + " €");
        System.out.println("Taux de change : 1 € = " + tauxChange + " $");
        System.out.println("Montant converti : " + montantDollars + " $");
        System.out.println("============================");

        // Affichage plus détaillé du calcul
        System.out.printf("Robert recevra exactement %.2f dollars américains%n", montantDollars);
    }
}
