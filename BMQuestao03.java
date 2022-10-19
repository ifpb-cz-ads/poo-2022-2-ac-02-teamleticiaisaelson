public class BMQuestao03{
    public static void main (String[] args) {
        final float taxa = 8.25f;
        /*letra a*/
        double arroz = 2.95;
        double feijao = 3.50;
        /*letra b*/
        System.out.println("O item 1 custa " + arroz + " e o item 2 custa " + feijao);
        /*letra c*/
        double total = arroz + feijao;
        System.out.println("O total é:"+ total);
        /*letra d*/
        double taxa = 0.0825;
        double taxaCalculada;
        taxaCalculada = total * taxa;
        System.out.println("O total da taxa calculada é:" + taxaCalculada);
        /*letra e*/
        arroz += taxaCalculada;
        feijao += taxacalculada;
        double novoCusto = arroz + feijao;
        System.out.println("O custo de venda com a taxa é:" + novoCusto);
        /*letra f*/
        boolean muitoCaro = (novoCusto > 10);
        System.out.println(muitCaro);
    }
    
}
