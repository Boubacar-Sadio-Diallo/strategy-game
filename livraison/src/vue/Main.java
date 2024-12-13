package vue;

import model.grille.Grille;
import model.grille.StrategyGrilleAleatoire;

/**
 * Classe principale qui sert de point d'entrée pour exécuter le jeu.
 * Elle initialise la grille de jeu, configure la stratégie de la grille,
 * et lance l'interface utilisateur du jeu.
 */
public class Main {

    /**
     * Méthode principale pour démarrer le jeu.
     * Elle crée la grille, configure la stratégie de la grille avec des éléments de jeu,
     * et affiche l'interface utilisateur pour permettre au joueur d'interagir avec le jeu.
     *
     * @param args Arguments de ligne de commande (non utilisés dans ce cas).
     */
    public static void main(String[] args) {
        // Initialiser la grille de jeu (par exemple une taille de 10x10)
        Grille grille = new Grille(10);

        // Configurer la grille avec 2 joueurs, 3 murs et 2 pastilles
        StrategyGrilleAleatoire strategyGrille = new StrategyGrilleAleatoire(grille, 4, 3, 2, 4, 0);
        
        // Initialiser la grille avec les joueurs, murs et pastilles
        strategyGrille.setSetupStrategy(strategyGrille);
        strategyGrille.initialiserGrille();

        // Créer une instance de la vue du jeu et l'afficher
        JeuUI vue = new JeuUI(strategyGrille);
        vue.afficher();
    }
}
