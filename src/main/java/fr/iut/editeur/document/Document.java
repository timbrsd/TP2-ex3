package fr.iut.editeur.document;

/**
 * Classe Document qui permet de gérer les documents
 */
public class Document {

    /**
     * Contient le texte du document
     */
    private String texte;

    /**
     * Constructeur de la classe Document
     */
    public Document() {
        this.texte = "";
    }

    /**
     * @return le texte du document
     */
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    @Override
    public String toString() {
        return this.texte;
    }

    /**
     * Description de la méthode
     * @param debut l'index du premier element à remplacer
     * @param fin l'index du dernier element à remplacer
     * @param remplacement la chaine de caractère à insérer à la place
     */
    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }
    public void majuscules(int debut, int fin) {
        String maj = texte.substring(debut, fin + 1).toUpperCase();
        remplacer(debut, fin, maj);
    }
    public void effacer(int debut, int fin) {
        remplacer(debut, fin, "");
    }
    public void clear() {
        texte = "c";
    }
}
