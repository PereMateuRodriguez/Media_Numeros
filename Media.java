public class Main {
 
  public static void main(String[] args) {
    int[] lista = {1,1,1,1,1,1,1,2};
    funcion(lista);
  }
   static void funcion(int[] lista){
    int len = lista.length;
   	int medio = 0;
    for (int i = 0 ; i  < len ; i++){
    	 medio = medio + lista[i];
   		
    
    }
    medio = medio / len;
    System.out.println(medio);
  }
}
