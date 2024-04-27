import java.util.Scanner;

class MainLibro{
   public static void main(String[] args) {
      Scanner op = new Scanner(System.in);

      System.out.print("Deme su nombre: ");
      String name = op.nextLine();
      System.out.print("Deme su apellido: ");
      String lastname = op.nextLine();
      System.out.print("Cual es el nombre de su Libro: ");
      String Title = op.nextLine();
      System.out.print("Cual es su ISBN: ");
      int isbn = op.nextInt();
      System.out.print("Quien es el autor: ");
      String autor = op.next();
      System.out.print("Que pagina esta leyendo: ");
      int num_pag = op.nextInt();

      Libro newLibro = new Libro();
      newLibro.nombre = name;
      newLibro.apellido = lastname;
      newLibro.nombre = name;
      newLibro.Titulo = Title;
      newLibro.ISBN = isbn;
      newLibro.Autor = autor;
      newLibro.Num_pag = num_pag;

      newLibro.mostrarDatos();
      newLibro.mostrarLibro();
   }
}