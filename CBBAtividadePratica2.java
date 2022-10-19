
public class CBBAtividadePratica2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int n1 = 8;
        int n2 = 9;
        int n3 = 10;
        int QTDE = 3;
        int soma = n1+n2+n3;
        int media = soma/QTDE;
        double mediaExata = soma/QTDE;
        System.out.println("Resultado da soma é:" + soma);
        System.out.println("Resultado da média é:" + media);
        System.out.println("Resultado da média é (decimal):" + mediaExata);
}
}
