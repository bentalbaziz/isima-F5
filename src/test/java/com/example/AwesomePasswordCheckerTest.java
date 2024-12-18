package com.example;
import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import java.io.File;
/**
 * Unit test for simple App.
 */
public class AwesomePasswordCheckerTest {
  @Test
  public void testGetDIstance() throws IOException {
      AwesomePasswordChecker checker = AwesomePasswordChecker.getInstance();
      double distance1 = checker.getDIstance("aziiz12Z3!");
      assertTrue(distance1 >= 0); // La distance doit être positive

      // Test avec un mot de passe vide
      double distance2 = checker.getDIstance("");
      assertNotNull(distance2); 
  }
  @Test
  public void getInstanceTest() throws IOException {
  // l'instance doit etre non null
  assertNotNull(AwesomePasswordChecker.getInstance(), "L'instance doit etre non null");
  }
  @Test
  public void getInstanceWithParam() throws IOException {
    // Cas 1 : Test avec un fichier existant
    File validFile = new File("src/main/resources/cluster_centers_HAC_aff.csv");
    assertNotNull(validFile, "Le fichier spécifié ne doit pas être null");
    assertTrue(validFile.exists(), "Le fichier spécifié doit exister : " + validFile.getAbsolutePath());

    AwesomePasswordChecker checkerWithValidFile = AwesomePasswordChecker.getInstance(validFile);
    assertNotNull(checkerWithValidFile, "L'instance retournée avec un fichier valide doit être non null");

    // Cas 2 : Test avec un fichier temporaire (vide)
    File tempFile = File.createTempFile("2.589", ".txt");
    assertTrue(tempFile.exists(), "Le fichier temporaire doit exister : " + tempFile.getAbsolutePath());

    AwesomePasswordChecker checkerWithTempFile = AwesomePasswordChecker.getInstance(tempFile);
    assertNotNull(checkerWithTempFile, "L'instance retournée avec un fichier temporaire doit être non null");
    assertTrue(tempFile.delete(), "Le fichier temporaire doit être supprimé après utilisation");
  }
}

