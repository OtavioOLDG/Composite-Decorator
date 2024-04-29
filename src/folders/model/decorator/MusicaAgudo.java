package folders.model.decorator;

public class MusicaAgudo extends MusicaDecorator{
	private int quantity;
	
	public MusicaAgudo(Musica musicaDecorator, int quantity) {
		super(musicaDecorator);
		this.quantity = quantity;
	}

	@Override
	public int high() {
		return super.high() + quantity;
	}
	@Override
	public int low() {
		return super.low();
	}
	@Override
	public int mid() {
		return super.mid();
	}

}
