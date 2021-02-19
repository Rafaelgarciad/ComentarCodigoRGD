/*Clase para manejar las entradas de un blog.
 * La clase se cre� el 21/3/1999 por Ana L�pez.
 * Esta es la versi�n 2.3
 */
//Modificar.

/**
 * @author garri
 * 
 * 
 */

package comentarcodigo;

public class EntradaBlogRGD {
	
	
	/**
	 * separador es el ccar�cter que separa ENTRADA DE del
	 * nombre del autor
	 */
	
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	

	
	/**
	 *Constructor de la clase. recibe el n�mero de entrada, el nombre del autor
	 * de la entrada y el texto que contiene la entrada. Si el n�mero de entrada
	 * es negativo, lanza una excepci�n.
	 * @param id
	 * @param autor
	 * @param texto
	 * @throws IllegalArgumentException
	 */
	
	public EntradaBlogRGD(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	
	/**
	 * 
	 * @return Devuelve el n�mero de la entrada
	 */
	
	public int getId(){
		return this.id;
	}
	
	
	/**
	 * 
	 * @return devuelve el texto completo de la entrada
	 */
	
	public String getTexto(){
		return this.texto;
	}
	
	
	/**
	 * 
	 * @return devuelve el nombre del autor de la entrada en may�sculas
	 */
	
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	
	/**
	 * 
	 * @return devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
	 */
	
	public String devuelveAutor(){
		return this.autor;
	}
	
	
	/**
	 * 
	 * @param args No tiene porqu� tener argumentos.
	 */
	
	public static void main(String[] args) {
                //Modificar.
	
		
		EntradaBlogRGD e1=new EntradaBlogRGD (3,"Rafael Garcia","�ltimas noticias, EJERCICIO TERMINADO");
		System.out.println(e1);
	}
	
}
