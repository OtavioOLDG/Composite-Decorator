package folders.model.decorator;

public class MusicaGrave extends MusicaDecorator{
	private int quantity;
	
	public MusicaGrave(Musica musicaDecorator, int quantity) {
		super(musicaDecorator);
		this.quantity = quantity;
	}

	@Override
	public int high() {
		return super.high();
	}
	@Override
	public int low() {
		return super.low() + quantity;
	}
	@Override
	public int mid() {
		return super.mid();
	}
}
