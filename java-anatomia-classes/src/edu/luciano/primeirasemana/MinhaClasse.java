package edu.luciano.primeirasemana;
public class MinhaClasse {

public static void main(String[] args) {
    
    System.out.print ("Ola, bem vindo ");   

    String primeiroNome = "Luciano";
    String segundoNome = "Junior";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    System.out.println(nomeCompleto);
}

public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
}

}
