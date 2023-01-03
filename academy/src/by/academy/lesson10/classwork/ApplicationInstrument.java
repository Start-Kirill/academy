package by.academy.lesson10.classwork;

public class ApplicationInstrument {

	public static void main(String[] args) {
		Instrument[] instruments = new Instrument[3];
		
		instruments[0] = new Guitar(6);
		instruments[1] = new Drum('S');
		instruments[2] = new Trumpet(10.5);
		
		for (Instrument instrument : instruments) {
			instrument.play();
		}
		
	}

}
