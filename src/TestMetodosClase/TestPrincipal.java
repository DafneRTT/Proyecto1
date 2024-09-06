package TestMetodosClase;

import MetodosClase.TScanner;
import TDA.Auto;
import TDA.Futbolista;

public class TestPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		creaObjetoFutbolista();
				
	}

	public static void creaObjetoAuto() {
		Auto objeto=new Auto();
		// capturar datos para almacenar en cada miembro 
	
		objeto.setMarcaAuto(TScanner.leerString("Escribe marca de Auto: "));
		objeto.setColorAuto(TScanner.leerString("Color del Auto: "));
		objeto.setModeloAuto(TScanner.leerString("Escribe modelo de Auto: "));
		objeto.setAñoAuto(TScanner.leerShort("Escribe año del Auto: "));
		objeto.setNumllantasAuto(TScanner.leerBytes("Escribe numero de llantas del Auto: "));
		
		System.out.println(objeto.toString());
				
		
	}
	public static void creaObjetoFutbolista() {
		Futbolista objeto=new Futbolista();
		objeto.setnombreJug(TScanner.leerString("escriba el nombre del futbolero :3"));
		objeto.setcolorPlayera(TScanner.leerString("de q color es su playera?"));
		objeto.setposicionJug(TScanner.leerString("que posicion es su jugador?"));
		objeto.setnacionJug(TScanner.leerString("que nacionalidad es su jugador?"));
		objeto.setnumeroJug(TScanner.leerBytes("que numero de jugador es?"));

		
		System.out.println(objeto.toString());
	}
}
