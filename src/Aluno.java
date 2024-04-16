//Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método calcularMedia que retorna a média das notas do aluno.
public class Aluno {
    private String nome;
    private double notas;
    private int contador;
    public String getNome() {
        return nome;
    }

    public double getNotas() {
        return notas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotas(double notas) {
        this.notas += notas;
        contador++;
    }
    public double calcularMedia(){
        double media;
        media = notas / contador;
        return media;
    }
}
