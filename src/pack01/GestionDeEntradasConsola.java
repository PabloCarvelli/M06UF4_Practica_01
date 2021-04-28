package pack01;

import java.util.*;

public class GestionDeEntradasConsola {
	
	public static int entradaNumeroEnteroPositivo() {
		
		int n;
        Scanner entradaUsuario = new Scanner(System.in);
        do{
            try{
                n = entradaUsuario.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Error al introducir el numero");
                n = -1;
            }
        }while(n < 0);
        //entradaUsuario.close();
        return n;
	}
	
	public static String entradaString(){

        String s = null;
        Scanner entradaUsuario = new Scanner(System.in).useDelimiter("\\s*\n\\s*");
        System.out.flush();
        do{
            s = entradaUsuario.next();
        }while(s.length() <= 0);
        //entradaUsuario.close();
        return s;
    }

}
