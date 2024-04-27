class Libro {
   String Titulo, Autor, nombre, apellido;
   int ISBN, Num_pag;

   Libro(String Titulo, String Autor, String nombre, String apellido, int ISBN, int Num_pag) {
      System.out.println("\nTitulo:"+Titulo+"Autor:"+Autor+"Nombre:"+nombre+"apellido:"+apellido+"ISBN:"+ISBN+"Num_Pag:"+Num_pag+"\n");

   }

   Libro() {
   }

   public void mostrarDatos() {
      System.out.println("\nSu nombre es "+this.nombre+" " + this.apellido + " y el nombre del libro es: " + this.Titulo);
   }

   public void mostrarLibro() {
      System.out.println("Los datos de este son: ISBN: "+this.ISBN + ", Titulo: " + this.Titulo + ", Autor: " + this.Autor + ", Numero de pagina: " + this.Num_pag);
   }
}