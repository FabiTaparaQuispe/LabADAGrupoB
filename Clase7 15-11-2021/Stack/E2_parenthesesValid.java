/* 
 * Ejercicio 2 MinimumAddtoMakeParenthesesValid
 * Autor: Fabiola Tapara Quispe
 * Description: Verificar el ingreso correcto de parentesis, apertura y cierre,
 * mostrar la cantidad de aquellos que no lo estan usando una Pila.
 * Date: 15/11/21 
 */
package Stack
public class E2_parenthesesValid {
	public static void main(String[] args) {
		
		// Datos de Prueba
		
		String input = "())";
		String input2 = "(()))(";
		String input3 = "(((";
		String input4 = "()))((";
		
		System.out.println("Input 1");
		System.out.println(parenthesisValid(input));
		
		System.out.println("Input 2");
		System.out.println(parenthesisValid(input2));
		
		System.out.println("Input 3");
		System.out.println(parenthesisValid(input3));
		
		System.out.println("Input 4");
		System.out.println((parenthesisValid(input4)));
	
	}
    public static int parenthesisValid(String str) {
        //para mantener el balance del string
    	int rpta = 0, balanceo = 0;
        for (int i = 0; i < str.length(); ++i) {
            balanceo += str.charAt(i) == '(' ? 1 : -1;
            //Garantiza que balanceo >= -1
            if (balanceo == -1) {
                rpta++;
                balanceo++;
            }
        }

        return rpta + balanceo;
    }
}
