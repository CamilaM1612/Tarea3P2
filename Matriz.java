public class Matriz
{   
    // Atributos
    private int n, m ; 
    private int [][] matriz;
    private int diagonalPri;
    private int diagonalSec;
  public Matriz (int tamanio){
    if (tamanio > 1){
       // matriz cuadrada
        n = tamanio;
        m = tamanio;
        matriz = new int [n][m]; 
    }
      else {
        System.out.println ("No es una matriz valida");
        }
  }
  /* Un metodo que realice el recorrido de caracol en la matriz*/ 
    public void recorrido (){
      int limite = n -1;
      int inicio = 0;
      int a = 1;
      while (a<= n*n){
        for (int i = inicio ; i <= limite ; i ++){
          matriz [inicio][i] = a++;
        }
        for (int i = inicio +1; i<= limite; i++ ){
          matriz [i][limite] = a++;
        }
        for (int i = limite - 1; i>= inicio; i--){
          matriz [limite][i] = a++;
        }
        for (int i = limite - 1; i>= inicio + 1; i--){
          matriz [i][inicio] = a++;
        }
        inicio= inicio +1;
        limite = limite -1;
        }
       // Imprime la matriz
        for ( int i = 0 ; i < n ; i++){
         for (int j = 0 ; j < n ; j++ ){
            System.out.print (" " + matriz [i][j] + " ");
          }
         System.out.println (" ");
       }
    }
    /* metodo que imprime la diagonal principal 
    y secundaria en la matriz */
   public void diagonal (){
      System.out.println ("La diagonal principal es : ");
       for (int i = 0; i < n ; i++){
           for (int j = 0 ; j < matriz.length ; j++ ){
           if (i==j){
              System.out.print (" " + matriz [i][j] + " ");    
           }
         } 
       }
       System.out.println (" ");
       System.out.println ("La diagonal secundaria es : ");
       for (int i = 0; i < n ; i++){
           for (int j = 0 ; j < matriz.length ; j++ ){
           if (i+j == n-1){
              System.out.print (" " + matriz [i][j] + " ");    
           }
         } 
       }
  } 
  // un metodo que permita imprimir la matriz
   public void imprimirMatriz (){
      for ( int i = 0 ; i < n ; i++){
         for (int j = 0 ; j < n ; j++ ){
            System.out.print (" " + matriz [i][j] + " ");
          }
         System.out.println (" ");
        }
  }
  }



