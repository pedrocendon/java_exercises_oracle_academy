package Inventario;

public class Produto {

    private int numeroItem;
    private String nomeProduto;
    private int qtdEstoque;
    private double precoUnitario;
    private boolean ativo = true;

    public Produto() {
    }

    public Produto(int numeroItem, String nomeProduto, int qtdEstoque, double precoUnitario) {
        this.numeroItem = numeroItem;
        this.nomeProduto = nomeProduto;
        this.qtdEstoque = qtdEstoque;
        this.precoUnitario = precoUnitario;
    }

    public int getNumeroItem() {
            return numeroItem;
    }
    public void setNumeroItem(int numeroItem) {
            this.numeroItem = numeroItem;
    }

    public String getNomeProduto() {
            return nomeProduto;
    }
    public void setNomeProduto (String nomeProduto) {
            this.nomeProduto = nomeProduto;
    }

    public int getQtdEstoque() {
            return qtdEstoque;
    }
    public void setQtdEstoque() {
            this.qtdEstoque = qtdEstoque;
    }

    public double getPrecoUnitario() {
            return precoUnitario;
    }
    public void setPrecoUnitario() {
            this.precoUnitario = precoUnitario;
    }

    public boolean isAtivo() {
            return ativo;
    }
    public void setAtivo(boolean ativo) {
            this.ativo = ativo;
    }

    public double getInventoryValue() {
            return  qtdEstoque * precoUnitario;
    }

    public String toString() {

            String descProduto = "";

            String tempAtivo = "";

            if (this.ativo) {
                tempAtivo = "Ativo";
            } else {
                tempAtivo = "Descontinuado";
            }

            return descProduto = "---------- INFORMAÇÕES DO PRODUTO -----------\n" + "Número do Item \t\t : "
                + this.numeroItem + "\n" + "Nome \t\t\t : " + this.nomeProduto + "\n" + "Quantidade em estoque \t : "
                + this.qtdEstoque + "\n" + "Preço \t\t\t : " + this.precoUnitario + "\n"
                + "Valor do Estoque \t : " + getInventoryValue() + "\n"
                + "Status do Produto \t : " + tempAtivo + "\n" + "---------------------------------------------" + "\n";
    }
}
