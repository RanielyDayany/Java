package funcoes;

public class PassagemDeParametro {
    //Metodo que tenta modificar um valor primitivo (passagem por valor)
   /* public static void modificarValor(int numero) {
        numero = numero * 2;//Esta alteração não afetará a variável original
        System.out.println("Dentro do metodo (valor primitivo: " + numero);
    }

    //Metodo que modifica um objeto(passagem por referência)
    public static void modificarObjeto(Pessoa pessoa){
        pessoa.nome = "João";//Modifica o estado do objeto,o que será refletido fora do método
    }

    //Metodo que tenta reatribuir uma referência (não afeta a referência original)
    public static void reatribuirObjeto(Pessoa pessoa){
        pessoa = new Pessoa();//Tenta criar um novo objeto,mas não afeta a referência original
        pessoa.nome = "Maria";//Este nome não será refletido fora do metodo
    }

    public static void main(String[] args){
        //Passagem por valor(primitivos)
        int numero = 10;
        System.out.println("Antes do metodo (valor primitivo): "+ numero);
        modificarValor(numero);
        System.out.println("Depois do metodo(valor primitivo): "+ numero);

        //Passagem por referência (objetos)
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Carlos";
        System.out.println("\nAntes do metodo (objeto): "+ pessoa.nome);
        modificarObjeto(pessoa);
        System.out.println("Depois do metodo (objeto): "+ pessoa.nome);

        //Tentativa de retribuição de referência
        reatribuirObjeto(pessoa);
        System.out.println("Após tentar reatribuir (objeto): " + pessoa.nome);
    }
}
//Classe simples para exemplo de objeto
class Pessoa {//Posso ter várias classes sem o modificador de acesso(public) dentro do mesmo arquivo
    String nome;*/

}
