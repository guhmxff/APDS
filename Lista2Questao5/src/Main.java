import java.awt.Rectangle;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o caminho do arquivo de teste: ");
        String caminho = ler.next();
        
        try (BufferedReader arquivo = new BufferedReader(new FileReader(caminho))) {
            String[] pontos = arquivo.readLine().split(" ");
            
            Rectangle retA = new Rectangle(
                Integer.parseInt(pontos[0]),
                Integer.parseInt(pontos[1]),
                Integer.parseInt(pontos[2]),
                Integer.parseInt(pontos[3])
            );

            pontos = arquivo.readLine().split(" ");

            Rectangle retB = new Rectangle(
                Integer.parseInt(pontos[0]),
                Integer.parseInt(pontos[1]),
                Integer.parseInt(pontos[2]),
                Integer.parseInt(pontos[3])
            );

            if (detectarColisao(retA, retB)) {
                System.out.println("Colidiu");
            } else {
                System.out.println("Não colidiu");
            }

            ler.close();
            arquivo.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean detectarColisao(Rectangle retA, Rectangle retB) {
        return retA.intersects(retB);
    }
}