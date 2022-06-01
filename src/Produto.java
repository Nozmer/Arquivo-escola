
public class Produto {

String nomeProduto;
	int qtdeDeProduto;
	double vrProdUnit;
	double valorEstoque;

	public Produto() {
		
	}

	public Produto(String nomeProduto, int qtdeDeProduto, double vrProdUnit, double valorEstoque) {
		
        this.nomeProduto = nomeProduto;
		this.qtdeDeProduto = qtdeDeProduto;
		this.vrProdUnit = vrProdUnit;
		this.valorEstoque = valorEstoque;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getQtdeDeProduto() {
		return qtdeDeProduto;
	}

	public void setQtdeDeProduto(int qtdeDeProduto) {
		this.qtdeDeProduto = qtdeDeProduto;
	}

	public double getVrProdUnit() {
		return vrProdUnit;
	}

	public void setVrProdUnit(double vrProdUnit) {
		this.vrProdUnit = vrProdUnit;
	}

	public double getValorEstoque() {
		return valorEstoque;
	}

	public void setValorEstoque(double valorEstoque) {
		this.valorEstoque = valorEstoque;
	}
 
	
}
