﻿package aulaexercicio09;
public class AulaExercicio09 {

   
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");
        
        l[0] = new Livro("Aprendendo Java", "José", 300, p[0]);
        l[1] = new Livro("POO para iniciantes", "Pedro", 500, p[1]);
        l[2] = new Livro("Java anvaçado", "MAria", 700, p[0]);
        
        l[0].abrir();
        l[0].folhear(400);
        
        
    }
    
}
