/*/Crie um programa que elabore o orçamento de uma construtora
para o cálculo do valor total de construção de uma piscina. O valor
total será dado pela cubagem da piscina (metros cúbicos) multiplicada por R$100,00,
que é o preço do metro cúbico construído de piscina. Faça a simulação dos cálculos no
programa para ver se está tudo funcionando corretamente./* */

public class CBBAtividadePratica4 {
    public static void main(String[] args) {
       int base = 100;
       int expoente = 3;
       double potencia = Math.pow(100, 3); 
        System.out.println(base);
        System.out.println(expoente);
        System.out.println(potencia);
        
    }
}
