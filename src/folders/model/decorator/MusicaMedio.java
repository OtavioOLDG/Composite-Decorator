package folders.model.decorator;

public class MusicaMedio extends MusicaDecorator{
	private int quantity;
	
	public MusicaMedio(Musica musicaDecorator, int quantity) {
		super(musicaDecorator);
		this.quantity = quantity;
	}

	@Override
	public int high() {
		return super.high();
	}
	@Override
	public int low() {
		return super.low();
	}
	@Override
	public int mid() {
		return super.mid() + quantity;
	}

}
