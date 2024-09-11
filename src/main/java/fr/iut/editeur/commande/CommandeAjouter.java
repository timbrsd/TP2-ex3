package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * Classe CommandeAjouter permet de gérer toutes les fonctionnalités
 * de la commande ajouter
 */
public class CommandeAjouter extends CommandeDocument {


    /**
     * Constructeur
     * @param document le document dans lequel ajouter le texte
     * @param parameters les différentes commande utlisable
     */
    public CommandeAjouter(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : ajouter;texte");
            return;
        }
        String texte = parameters[1];
        this.document.ajouter(texte);
        super.executer();
    }

}
