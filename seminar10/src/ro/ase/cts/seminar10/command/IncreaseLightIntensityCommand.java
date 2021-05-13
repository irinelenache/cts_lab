package ro.ase.cts.seminar10.command;

public class IncreaseLightIntensityCommand implements CommandInterface{

private LightBulb lightBulb;
	
	@Override
	public void execute() {
		lightBulb.increaseLightIntensity();
		
	}

	public IncreaseLightIntensityCommand(LightBulb lightBulb) {
		super();
		this.lightBulb = lightBulb;
	}
}
