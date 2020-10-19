import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Formatter;
import java.util.Locale;

public class IntegralTest {
    public static void main(String[] arg)
    {
        MaquinaSandwichTest m = new MaquinaSandwichTest ();
        int grade = 0;

        try {
            m.testStaticFinal();
            System.out.println(formatOutput("testStaticFinal", "2", null));
            grade += 2;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testStaticFinal", "2", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testStaticFinal", "2", new AssertionError(e.getMessage())));
        }
try {
            m.testConstructor1();
            System.out.println(formatOutput("testConstructor1", "2", null));
            grade += 2;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testConstructor1", "2", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testConstructor1", "2", new AssertionError(e.getMessage())));
        }
try {
            m.testConstructor2();
            System.out.println(formatOutput("testConstructor2", "2", null));
            grade += 2;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testConstructor2", "2", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testConstructor2", "2", new AssertionError(e.getMessage())));
        }
try {
            m.testConstructor3();
            System.out.println(formatOutput("testConstructor3", "2", null));
            grade += 2;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testConstructor3", "2", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testConstructor3", "2", new AssertionError(e.getMessage())));
        }
try {
            m.testCalcularPrecioFabricacion1();
            System.out.println(formatOutput("testCalcularPrecioFabricacion1", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testCalcularPrecioFabricacion1", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testCalcularPrecioFabricacion1", "3", new AssertionError(e.getMessage())));
        }
try {
            m.testCalcularPrecioFabricacion2();
            System.out.println(formatOutput("testCalcularPrecioFabricacion2", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testCalcularPrecioFabricacion2", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testCalcularPrecioFabricacion2", "3", new AssertionError(e.getMessage())));
        }
try {
            m.testCalcularPrecioVenta1();
            System.out.println(formatOutput("testCalcularPrecioVenta1", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testCalcularPrecioVenta1", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testCalcularPrecioVenta1", "3", new AssertionError(e.getMessage())));
        }
try {
            m.testCalcularPrecioVenta2();
            System.out.println(formatOutput("testCalcularPrecioVenta2", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testCalcularPrecioVenta2", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testCalcularPrecioVenta2", "3", new AssertionError(e.getMessage())));
        }
try {
            m.testRegistrarVentaFull();
            System.out.println(formatOutput("testRegistrarVentaFull", "7", null));
            grade += 7;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testRegistrarVentaFull", "7", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testRegistrarVentaFull", "7", new AssertionError(e.getMessage())));
        }
try {
            m.testRegistrarVentaQueso();
            System.out.println(formatOutput("testRegistrarVentaQueso", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testRegistrarVentaQueso", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testRegistrarVentaQueso", "3", new AssertionError(e.getMessage())));
        }
try {
            m.testRegistrarVentaMortadela();
            System.out.println(formatOutput("testRegistrarVentaMortadela", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testRegistrarVentaMortadela", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testRegistrarVentaMortadela", "3", new AssertionError(e.getMessage())));
        }
try {
            m.testRegistrarVentaJamon();
            System.out.println(formatOutput("testRegistrarVentaJamon", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testRegistrarVentaJamon", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testRegistrarVentaJamon", "3", new AssertionError(e.getMessage())));
        }
try {
            m.testRegistrarVentaPanBlanco();
            System.out.println(formatOutput("testRegistrarVentaPanBlanco", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testRegistrarVentaPanBlanco", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testRegistrarVentaPanBlanco", "3", new AssertionError(e.getMessage())));
        }
try {
            m.testRegistrarVentaPanIntegral();
            System.out.println(formatOutput("testRegistrarVentaPanIntegral", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testRegistrarVentaPanIntegral", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testRegistrarVentaPanIntegral", "3", new AssertionError(e.getMessage())));
        }
try {
            m.testRegistrarVentaIngresos1();
            System.out.println(formatOutput("testRegistrarVentaIngresos1", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testRegistrarVentaIngresos1", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testRegistrarVentaIngresos1", "5", new AssertionError(e.getMessage())));
        }
try {
            m.testRegistrarVentaIngresos2();
            System.out.println(formatOutput("testRegistrarVentaIngresos2", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testRegistrarVentaIngresos2", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testRegistrarVentaIngresos2", "5", new AssertionError(e.getMessage())));
        }
try {
            m.testPorcentajes1();
            System.out.println(formatOutput("testPorcentajes1", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testPorcentajes1", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testPorcentajes1", "3", new AssertionError(e.getMessage())));
        }
try {
            m.testPorcentajes2();
            System.out.println(formatOutput("testPorcentajes2", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testPorcentajes2", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testPorcentajes2", "3", new AssertionError(e.getMessage())));
        }
try {
            m.testIngredientesSuficientesSimpleBlanco();
            System.out.println(formatOutput("testIngredientesSuficientesSimpleBlanco", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testIngredientesSuficientesSimpleBlanco", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testIngredientesSuficientesSimpleBlanco", "3", new AssertionError(e.getMessage())));
        }
try {
            m.testIngredientesSuficientesSimpleIntegral();
            System.out.println(formatOutput("testIngredientesSuficientesSimpleIntegral", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testIngredientesSuficientesSimpleIntegral", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testIngredientesSuficientesSimpleIntegral", "3", new AssertionError(e.getMessage())));
        }
try {
            m.testIngredientesSuficientesExquisitoBlanco();
            System.out.println(formatOutput("testIngredientesSuficientesExquisitoBlanco", "4", null));
            grade += 4;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testIngredientesSuficientesExquisitoBlanco", "4", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testIngredientesSuficientesExquisitoBlanco", "4", new AssertionError(e.getMessage())));
        }
try {
            m.testIngredientesSuficientesExquisitoIntegral();
            System.out.println(formatOutput("testIngredientesSuficientesExquisitoIntegral", "4", null));
            grade += 4;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testIngredientesSuficientesExquisitoIntegral", "4", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testIngredientesSuficientesExquisitoIntegral", "4", new AssertionError(e.getMessage())));
        }
try {
            m.testIngredientesInsuficientesSimpleBlanco();
            System.out.println(formatOutput("testIngredientesInsuficientesSimpleBlanco", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testIngredientesInsuficientesSimpleBlanco", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testIngredientesInsuficientesSimpleBlanco", "3", new AssertionError(e.getMessage())));
        }
try {
            m.testIngredientesInsuficientesSimpleIntegral();
            System.out.println(formatOutput("testIngredientesInsuficientesSimpleIntegral", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testIngredientesInsuficientesSimpleIntegral", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testIngredientesInsuficientesSimpleIntegral", "3", new AssertionError(e.getMessage())));
        }
try {
            m.testIngredientesInsuficientesExquisitoBlanco();
            System.out.println(formatOutput("testIngredientesInsuficientesExquisitoBlanco", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testIngredientesInsuficientesExquisitoBlanco", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testIngredientesInsuficientesExquisitoBlanco", "5", new AssertionError(e.getMessage())));
        }
try {
            m.testIngredientesInsuficientesExquisitoIntegral();
            System.out.println(formatOutput("testIngredientesInsuficientesExquisitoIntegral", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testIngredientesInsuficientesExquisitoIntegral", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testIngredientesInsuficientesExquisitoIntegral", "5", new AssertionError(e.getMessage())));
        }
try {
            m.testEspecial1();
            System.out.println(formatOutput("testEspecial1", "6", null));
            grade += 6;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testEspecial1", "6", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testEspecial1", "6", new AssertionError(e.getMessage())));
        }
try {
            m.testEspecial2();
            System.out.println(formatOutput("testEspecial2", "6", null));
            grade += 6;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testEspecial2", "6", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testEspecial2", "6", new AssertionError(e.getMessage())));
        }


        System.out.println("Grade :=>> "+grade);
    }
    private static String formatOutput(String testName, String value, AssertionError e) {
        StringBuilder sb = new StringBuilder();
        Formatter f = new Formatter(sb, Locale.getDefault());
        String grade = (e == null ? value : "0");
        f.format("Comment :=>> %s: %s. %s marks\n", testName, (e == null ? "success" : "failure"), grade);
        if (e != null) {
            f.format("********************\n%s\n", e.getMessage());
        }
        return sb.toString();
    }

    @Test
    public void testDummy(){IntegralTest.main(null);}

}
