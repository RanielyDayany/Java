/*public class Operadores {
   public static void main(String[] args){
    //Operadores de atribuicao
    int a = 10;//Operador de atribuicao simples(=)
    int b = 20;

    System.out.println("Valor inicial de a= " +a);
    System.out.println("Valor inicial de b= "+b);

    a+=5;//Operador de atribuição composta(a=a+5)
    b-=2;//Operador de atribuição composta(b=b-2)
    System.out.println("Valor de a apos a operação de atribuicao:" +a);
    System.out.println("Valor de b apos a operacao de atribuicao:"+b);

    a *= 3;//Operador de atribuição composta(a=a*3)
    b /=2;//Operador de atibuição composta(b=b/2)
    System.out.println("Valor de a apos operacao de atribuicao:"+a);
    System.out.println("Valor de b apos operacao de atribuicao:"+b);
   }
}*/

/*public class OperadoresAritmeticos{
    public static void main(String[] args){
      int x = 15;
      int y = 5;
      
      int soma = x + y;//Adição
      System.out.println("Soma: "+soma);

      int subtracao = x - y;//Subtracao
      System.out.println("Subtracao: "+subtracao);

      int multiplicacao = x * y;//Multiplicacao
      System.out.println("Multiplicacao: "+multiplicacao);

      int divisao = x / y;//Divisao
      System.out.println("Divisao: "+divisao);

      int modulo = x % y;//Modulo(resto de divisao)
      System.out.println("Modulo: "+modulo);

      //Operadores de Incremento e Decremento
      int incremento = 10;
      int decremento = 10;

      incremento++;//Incremento(incrementa em 1)
      System.out.println("Valor apos o incemento: "+incremento);

      decremento--;//Decremento(subtrai em 1)
      System.out.println("Valor apos o decremento: "+decremento);


    }
}*/

/*public class TabelaVerdade {
  public static void main(String[] args){
    //Tabela Verdade para o Operador AND(&&)
    System.out.println("Tabela Verdade para o Operador AND(&&):");
    System.out.println("A\t \tB\t \tA && B");
    System.out.println(true +"\t" + true + "\t" + (true));//(true && true)
    System.out.println(true +"\t" + false + "\t" + (false));//(true && false)
    System.out.println(false +"\t" + true + "\t" + (false));
    //(false && true)
    System.out.println(false +"\t" + false + "\t" + (false));//(false && false)

    //Linha em branco para separar as tabelas
    System.out.println();

    //Tabela Verdade para o Operador OR(||)
    System.out.println("Tabela Verdade para o Operador OR(||)");
    System.out.println("A\t \tB\t \tA || B");
    System.out.println(true +"\t" + true + "\t" + (true));//(true || true)
    System.out.println(true +"\t" + false + "\t" + (true));//(true || false)
    System.out.println(false +"\t" + true + "\t" + (true));
    //(false || true)
    System.out.println(false +"\t" + false + "\t" + (false));//(false || false)
  }

}*/

/*public class OperadoresLogicos{
  public static void main(String[] args){
    boolean a = true;
    boolean b = false;

    //Operador && (AND Logico)
    System.out.println("a && b: " + (a && b));//false,porque b é false

    //Operador || (OR Logico)
    System.out.println("a || b: "+ (a || b));//true,porque a é true

    //Operador ! (NOT Logico)
    System.out.println("!a: "+ (!a));//false,porque a é true
    System.out.println("!b: "+ (!b));//true,porque b é false
  }
  
}*/

public class OperadorTernario{
  public static void main(String[] args){
    int a=10;
    int b=20;

    //Usando o operador ternario para determinar o maior valor
    int maior = (a > b) ? a : b;

    System.out.println("O maior valor entre " + a+ " e " + b+ " e:" + maior);
  }
  
}


