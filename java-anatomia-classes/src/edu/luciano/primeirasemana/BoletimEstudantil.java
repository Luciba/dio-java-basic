package edu.luciano.primeirasemana;

public class BoletimEstudantil {
    public static void main(String[] args) {
        int medidaFinal = 6;
        if(medidaFinal<6)
            System.out.println("REPROVADO");
        else if(medidaFinal==6)
            System.out.println("PROVA MINERVA");
        else
            System.out.println("APROVADO");
    }
}
