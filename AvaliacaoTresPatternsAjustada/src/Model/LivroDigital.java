package Model;

import java.util.HashMap;
import java.util.Map;

public class LivroDigital extends Livro {
	private Map<String, LivroBridgeIF> formatos = new HashMap<String, LivroBridgeIF>();
	
	public LivroDigital(String nome, String codigo, double preco, String isbn, LivroBridgeIF formato) {
		super(nome, codigo, preco, isbn);		
		this.addFormato(formato);	
	}

	public double getPercentLivro(){
		return 0.85;
	}	
	
	public void addFormato(LivroBridgeIF formato) {				
		this.formatos.put(formato.getFormatacao(), formato);
		this.preco = this.preco * formato.getPercentLivro() * this.getPercentLivro();		
	}
	
	public String getFormato() {
		String format = "";
		for (String key : formatos.keySet()) {
		    format = format + key;
		}		
		return "Livro Digital " + format;
	}
	
}
