package cdPlayer;

public class CdPlayer {
	private Button playButton;
	private Button stopButton;
	
	public final void buttonPushed(Button p) {
		if(p == playButton) this.playButtonPushed();
		if(p == stopButton) this.stopButtonPushed();
	}
	
	public final void setPlayButton(Button p) {
		playButton = p;
	}
	
	public final void setStopButton(Button p) {
		stopButton = p;
	}
	
	public final void playButtonPushed() {
		System.out.println("Play");
	}
	
	public final void stopButtonPushed() {
		System.out.println("Stop");
	}
}

