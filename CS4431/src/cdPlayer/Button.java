package cdPlayer;

public class Button {
	CdPlayer cdPlayer;
	
	public Button(CdPlayer cdp) {
		this.cdPlayer = cdp;
	}
	
	public final void push() {
		cdPlayer.buttonPushed(this);
	}
}
