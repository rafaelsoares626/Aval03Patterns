package Model;

public class LivroColorido implements LivroBridgeIF {
  @Override
	public double getPercentLivro() {		
		return 1.05;
	}

	@Override
	public String getFormatacao() {		
		return "Colorido ";
	}
}
