package hierarq;

/*
 * Nome: Misael Witalo Ferreira da Silva
 * RA: 0025369
 * Atividade 23 - Hierarquia de Generalizacao/Especializacao
 */
 
// Nível 1 (mais geral): Veiculo
class Veiculo {
    String marca;
    int ano;
 
    Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }
 
    void exibir() {
        System.out.println("Veiculo: " + marca + ", ano " + ano);
    }
}
 
// Nível 2: Carro e Motocicleta são especializações de Veiculo
class Carro extends Veiculo {
    int portas;
 
    Carro(String marca, int ano, int portas) {
        super(marca, ano);
        this.portas = portas;
    }
 
    @Override
    void exibir() {
        super.exibir();
        System.out.println("  Carro com " + portas + " portas");
    }
}
 
class Motocicleta extends Veiculo {
    int cilindradas;
 
    Motocicleta(String marca, int ano, int cilindradas) {
        super(marca, ano);
        this.cilindradas = cilindradas;
    }
 
    @Override
    void exibir() {
        super.exibir();
        System.out.println("  Motocicleta de " + cilindradas + " cc");
    }
}
 
// Nível 3: especializações de Carro
class Sedan extends Carro {
    Sedan(String marca, int ano) {
        super(marca, ano, 4);
    }
 
    @Override
    void exibir() {
        super.exibir();
        System.out.println("  Tipo: Sedan (porta-malas separado)");
    }
}
 
class Hatch extends Carro {
    Hatch(String marca, int ano) {
        super(marca, ano, 4);
    }
 
    @Override
    void exibir() {
        super.exibir();
        System.out.println("  Tipo: Hatch (traseira compacta)");
    }
}
 
// Nível 3: especialização de Motocicleta
class Esportiva extends Motocicleta {
    Esportiva(String marca, int ano) {
        super(marca, ano, 600);
    }
 
    @Override
    void exibir() {
        super.exibir();
        System.out.println("  Tipo: Esportiva (alto desempenho)");
    }
}
 
public class Main {
    public static void main(String[] args) {
        Veiculo[] veiculos = {
            new Sedan("Toyota", 2022),
            new Hatch("Volkswagen", 2021),
            new Esportiva("Yamaha", 2023)
        };
 
        // Todos são Veiculo (generalização), mas cada um mostra seus detalhes (especialização)
        for (Veiculo v : veiculos) {
            v.exibir();
            System.out.println("---");
        }
    }
}
