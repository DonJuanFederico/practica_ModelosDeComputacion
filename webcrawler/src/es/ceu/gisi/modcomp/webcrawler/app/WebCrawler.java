package es.ceu.gisi.modcomp.webcrawler.app;

import es.ceu.gisi.modcomp.webcrawler.exceptions.WebCrawlerException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;

import es.ceu.gisi.modcomp.webcrawler.jflex.*;

/**
 * Esta aplicación contiene el programa principal que ejecuta ambas partes del
 * proyecto de programación de la asignatura Modelos de Computación.
 *
 * @author Sergio Saugar García <sergio.saugargarcia@ceu.es>
 */
public class WebCrawler {

    public static void main(String[] args) throws IOException, FileNotFoundException, WebCrawlerException {
        
        final String TESTFILE_PATH = new java.io.File("").getAbsolutePath() + "/test/es/ceu/gisi/modcomp/webcrawler/testfiles/";
        
        final File TEST_FILE1 = new File(TESTFILE_PATH + "prueba1.html");
        final File TEST_FILE2 = new File(TESTFILE_PATH + "prueba2.html");
        final File TEST_FILE3 = new File(TESTFILE_PATH + "prueba3.html");
        final File TEST_FILE4 = new File(TESTFILE_PATH + "prueba4.html");
        
        
        /**
         * En este método main, debajo de este comentario, escribirá las líneas
         * necesarias para mostrar el funcionamiento de las clases JFlexScraper
         * y JsoupScraper que ha creado en la práctica. Primero se centrará en
         * la parte correspondiente a JFlex.
         *
         * En primer lugar, deberá inicializar su clase JFlexScraper con un
         * fichero HTML REAL (y complejo) que haya almacenado en disco. Para la
         * lectura del fichero se recomienda almacenarlo en el mismo directorio
         * en que se encuentran los ficheros de pruebay que haga uso del mismo
         * código que ilustra cómo se cargan los ficheros de pruebas en la clase
         * de test.
         *
         * Posteriormente debe analizar el fichero y, el resultado que le
         * devuelvan los métodos que ha programado en la clase JFlexScraper
         * (retrieveHyperlinksA() y retrieveHyperlinksIMG()), deberá almacenarlo
         * en un fichero.
         *
         * También deberá mostrar un mensaje en pantalla indicando si el fichero
         * HTML que se ha pasado está bien balanceado.
         */
        
        System.out.println("\n\n** JFLEXSCRAPER **\n\n");
        //JFlexScraper prueba = new JFlexScraper(TEST_FILE1);
        //JFlexScraper prueba = new JFlexScraper(TEST_FILE2);
        //JFlexScraper prueba = new JFlexScraper(TEST_FILE3);
        JFlexScraper prueba = new JFlexScraper(TEST_FILE4);
        System.out.println("links de imagenes:");
        System.out.println(prueba.retrieveHyperlinksIMG());
        System.out.println("links de A:");
        System.out.println(prueba.retrieveHyperlinksA());
        
        System.out.println("\n Documentos valanceados: " + prueba.esDocumentoHTMLBienBalanceado());
        /**
         * En segundo lugar, debajo de este comentario, pasará a demostrar el
         * uso de la clase JsoupScraper que ha programado. Para ello, escribirá
         * las líneas de código necesarias para crear un objeto de tipo
         * JsoupScraper con la DIRECCIÓN HTTP de una página web REAL que desee
         * analizar.
         *
         * Al igual que hizo en el apartado anterior, creará un fichero con
         * todos los hiperenlaces que encuentre en la página web (utilizando el
         * resultado que le proporcionen los métodos retrieveHyperlinksA() y
         * retrieveHyperlinksIMG() que ha programado.
         *
         * Además, mostrará por pantalla las estadísticas de uso de las
         * etiquetas HTML más comunes: a, img, br, div, li, ul, p, span, table,
         * td, tr. Para ello, utilice los resultados que le proporcione el
         * método tagUsage() que ha programado.
         */
        System.out.println("\n\n** JSOUPSCRAPER **\n\n");

    }
}
