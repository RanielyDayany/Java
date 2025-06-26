package exerciciosDescomplica.ex07.files;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


//Escrita
public class FileWriteExample {
    public static void main(String[] args){
        //Try vai tentar executar o bloco de código
        try(BufferedWriter writer = new BufferedWriter(
                new FileWriter("C:\\Users\\Ranyd\\OneDrive\\Documentos\\MeusProjetosGit\\Java\\exerciciosDescomplica\\ex07\\files\\arquivo.txt"))){
            writer.write("Olá,Mundo!");
            writer.newLine();
            writer.write("Segunda linha.");
        }//Se der erro ao tentar executar o try ele executa o catch
        catch(IOException e){
            e.printStackTrace();//Vai mostrar o erro que ocorreu
        }
    }
}

