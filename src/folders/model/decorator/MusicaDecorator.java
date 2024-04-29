package folders.model.decorator;

public abstract class MusicaDecorator implements Musica{
	private final Musica musicaDecorator;
	
	public MusicaDecorator(Musica musica) {
		this.musicaDecorator = musica;
	}
	
	@Override
	public int high() {
		return musicaDecorator.high();
	}
	@Override
	public int low() {
		return musicaDecorator.low();
	}
	@Override
	public int mid() {
		return musicaDecorator.mid();
	}
	
	
}
