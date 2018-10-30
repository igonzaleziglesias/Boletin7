package boletin7;

public class Libro {

    private String tituloLibro;
    private String autor;
    private int numExemplares;
    private int exemplaresPrestados;

    //constructores
    public Libro() {
        tituloLibro = "No hay libro alguno";
        autor = "sin autor";
        numExemplares = 0;
        exemplaresPrestados = 0;
    }

    public Libro(String titulo, String autor, int exemplares, int prestados) {
        tituloLibro = titulo;
        this.autor = autor;
        numExemplares = exemplares;
        exemplaresPrestados = prestados;
    }

    //setters
    public void setTitulo(String titulo) {
        tituloLibro = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setExemplares(int exemplares) {
        numExemplares = exemplares;
    }

    public void setPrestados(int prestados) {
        exemplaresPrestados = prestados;
    }

    //getters
    public String getTitulo() {
        return tituloLibro;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getExemplares() {
        return numExemplares;
    }

    public int getPrestados() {
        return exemplaresPrestados;
    }
    //otros

    public boolean prestamo() {
        if (numExemplares > 0) {
            numExemplares = --numExemplares;
            exemplaresPrestados = ++exemplaresPrestados;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean devolucion(){
        if (numExemplares==exemplaresPrestados){ 
            return false;
        }else if (exemplaresPrestados > 0) {
            numExemplares = ++numExemplares;
            exemplaresPrestados = --exemplaresPrestados;
            return true;
        } else {
            return false;
        }
    }

}
