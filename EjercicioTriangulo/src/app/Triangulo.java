package app;

public class Triangulo {

    private int ladoUno;

    private int ladoDos;

    private int ladoTres;


    public void determinarTipoDeTriangulo(){

        if (this.ladoUno == this.ladoDos && this.ladoDos == this.ladoTres) { 
            System.out.println("El triángulo es equilátero");
        }
        else if (this.ladoUno != this.ladoDos && this.ladoDos != this.ladoTres && this.ladoUno != this.ladoTres) { 
            System.out.println("El triángulo es escálenos");
        }
        else { 
            System.out.println("El triángulo es isósceles");
        };
    }
    
    /*
        public String determinarTipoDeTriangulo(){

        if (this.ladoUno == this.ladoDos && this.ladoDos == this.ladoTres) { 
            return "equilátero"
        }
        else if (this.ladoUno != this.ladoDos && this.ladoDos != this.ladoTres && this.ladoUno != this.ladoTres) { 
            return "escálenos"
        }
        else { 
            return "isósceles"
        };
    }
    */

    public int getLadoUno() {
        return ladoUno;
    }

    public void setLadoUno(int ladoUno) {
        this.ladoUno = ladoUno;
    }

    public int getLadoDos() {
        return ladoDos;
    }

    public void setLadoDos(int ladoDos) {
        this.ladoDos = ladoDos;
    }

    public int getLadoTres() {
        return ladoTres;
    }

    public void setLadoTres(int ladoTres) {
        this.ladoTres = ladoTres;
    }

}