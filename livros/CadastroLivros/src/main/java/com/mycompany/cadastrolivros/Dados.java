package com.mycompany.cadastrolivros;


public class Dados {
    private String titulo=" ";
    private String autor=" ";
    private String isbn=" ";
    private int paginas=0;
    private double valor=0;
    
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public String getISBN(){
        return isbn;
    }
    
    public int getPaginas(){
        return paginas;
    }
    
    public double getValor(){
        return valor;
    }
    
    public void setAtributos(String titulo, String autor, String isbn, int paginas, double valor){
        this.titulo=titulo;
        this.autor=autor;
        this.isbn=isbn;
        this.paginas=paginas;
        this.valor=valor;
    }
    
    public void cadastro(String titu, String aut, String isbnn, int pages, double val){
        setAtributos(titu, aut, isbnn, pages, val);
    }
    
    public void exibirDados(){
        System.out.println("Titulo: "+getTitulo());
        System.out.println("Autor: "+getAutor());
        System.out.println("ISBN: "+getISBN());
        System.out.println("Paginas: "+ getPaginas());
        System.out.println("Valor: "+getValor());
    }
}

