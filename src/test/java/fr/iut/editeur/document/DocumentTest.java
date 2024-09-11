package fr.iut.editeur.document;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DocumentTest {

    @Test
    public void testAjouter() {
        Document d = new Document();
        d.ajouter("bonjour");
        assertEquals(d.getTexte(), "bonjour");
    }

}