import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Principal {
    public static void main(String[] args) throws Exception {
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");

        pessoas.add(new Pessoa("Lucas", "Mikasa", formato.parse("20-11-2002"), formato.parse("08-05-2032")));
        pessoas.add(new Pessoa("Gusta", "Miu-miu", formato.parse("11-05-2006"), formato.parse("11-05-2024")));
        pessoas.add(new Pessoa("Pedro", "Magazine Luiza", formato.parse("01-04-2015")));
        pessoas.add(new Pessoa("Manuel", "Malboro", formato.parse("01-01-2022")));
        pessoas.add(new Pessoa("Aluízio", "Caloi", formato.parse("27-08-2025")));
        pessoas.add(new Pessoa("Gabriel", "Adidas", formato.parse("18-08-2022")));

        for (Pessoa pessoa : pessoas) {
            String dataSaida, tempoTotal;

            long tempo;

            try {
                dataSaida = formato.format(pessoa.getDataSaida());
                tempo = pessoa.getDataSaida().getTime() - pessoa.getDataEntrada().getTime();
                
            } catch (Exception e) {
                dataSaida = "pendente";
                tempo = new Date().getTime() - pessoa.getDataEntrada().getTime();
            }

            if (tempo < 0) tempoTotal = "pendente";
            else tempoTotal = TimeUnit.DAYS.convert(tempo, TimeUnit.MILLISECONDS) + " dia(s)";

            System.out.println(
                "Nome: " + pessoa.getNome() +
                "\nEmpresa: " + pessoa.getEmpresa() +
                "\nData de entrada: " + formato.format(pessoa.getDataEntrada()) +
                "\nData de saída: " + dataSaida +
                "\nDias de trabalho: " + tempoTotal +
                "\n-----"
            );
        }
    }
}
