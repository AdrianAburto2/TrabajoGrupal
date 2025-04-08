package EjerciciosPropuestos;

import java.util.Scanner;

public class Resolucion{

	
public static void main(String []args) {

Scanner teclado = new Scanner(System.in);

int n1,n2,n3;

System.out.println("1ER CAMBIO DE PRUEBA ");
System.out.println("Hola mundo");
System.out.println("Ingrese el primer número: ");
n1=teclado.nextInt();

System.out.println("Ingrese el segundo número: ");
n2=teclado.nextInt();
while(n2==n1) {
System.out.println("Error!! debe ingresar un número diferente");
n2=teclado.nextInt();
}

System.out.println("Ingrese el tercer número: ");
n3=teclado.nextInt();
while(n3==n1 || n3==n2) {
System.out.println("Error!! debe ingresar un número diferente");
n3=teclado.nextInt();
}

        NumMenor(n1,n2,n3);        

        OrdenMayorMenor(n1,n2,n3);
        
        ClasificaciónTriángulo(n1,n2,n3);    

        NumIntermedio(n1,n2,n3);
               
        teclado.close();
}



public static void NumMenor(int n1, int n2, int n3){

    int menor= (n1<n2) ? ((n1<n3)?n1:n3) : ((n2<n3)?n2:n3);
    System.out.println("El número menor es: " + menor);

 
}

public static void OrdenMayorMenor(int n1, int n2, int n3) {

     int temp;

     if (n1 < n2) {
         temp = n1;
         n1 = n2;
         n2 = temp;
     }
    
     if (n1 < n3) {
         temp = n1;
         n1 = n3;
         n3 = temp;
     }
     
     if (n2 < n3) {
         temp = n2;
         n2 = n3;
         n3 = temp;
     }
     
     System.out.println("El orden de los números de mayor a menor es: " + n1 + ", " + n2 + ", " + n3);
}

public static void ClasificaciónTriángulo(int n1, int n2, int n3) {

     if (n1 == n2 && n2 == n3) 
     {
         System.out.println("El triángulo es equilátero.");
     } 

     else if (n1 == n2 || n2 == n3 || n1 == n3) 
     {
         System.out.println("El triángulo es isósceles.");
     } 

     else
     {
         System.out.println("El triángulo es escaleno.");
     }
}

public static void NumIntermedio(int n1, int n2, int n3) {

     if ((n1 <n2 && n1 > n3) || (n1 <n3 && n1 > n2)) 
     {
        System.out.println("El número intermedio es: " + n1);
     } 
     else if ((n2 < n1 && n2 > n3) || (n2 < n3 && n2 > n1)) 
     { 
        System.out.println("El número intermedio es: " + n2);
     } 
     else
     {
        System.out.println("El número intermedio es: " + n3);
     } 
}

}
