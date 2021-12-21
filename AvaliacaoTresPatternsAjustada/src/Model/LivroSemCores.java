package Model;

public class LivroSemCores implements LivroBridgeIF  {

	@Override
	public double getPercentLivro() {		
		return 1;
	}

	@Override
	public String getFormatacao() {		
		return "Sem Cores";
	}

}
