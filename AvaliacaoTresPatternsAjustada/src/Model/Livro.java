package Model;

public class Livro extends Produto implements PrototipavelIF{
	
	protected String isbn;
	protected double preco;	
			
	public Livro(String nome, String codigo, double preco, String isbn) {
		super(nome, codigo);
		this.setIsbn(isbn);
		this.setPreco(preco);		
	}

	public Livro(Livro livro) {
		super(livro.getNome(), livro.getCodigo());
		this.setIsbn(livro.getIsbn());
		this.setPreco(livro.getPreco());		
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	private void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPreco() {
		return preco;
	}
	
	private void setPreco(double preco) {
		this.preco = preco;		
	}

	@Override
	public String toString() {
		return "\n - ISBN => " + isbn 
				+ " |Nome do Livro => " + nome 
				+ " |Codigo do Livro => " + codigo 
				+ " |Preco do Livro => " + preco;
	}
	
	@Override
	public PrototipavelIF prototipar() {
		return new Livro(this);
	}
	
}
