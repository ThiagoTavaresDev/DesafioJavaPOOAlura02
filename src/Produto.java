//Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.
public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double aplicarDesconto(double porcentagem){
        if(porcentagem <= 0.99 && porcentagem >= 0.1){
            double precoFinal = preco * porcentagem;
            return precoFinal;
        }
        else{
            System.out.println("o valor percentual deve estar entre 0.1 e 0.9");
            return 0;
        }
    }
}
