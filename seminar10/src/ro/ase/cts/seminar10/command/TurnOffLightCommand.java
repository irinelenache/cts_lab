package ro.ase.cts.seminar10.command;

public class TurnOffLightCommand implements CommandInterface{

	private LightBulb lightBulb;
	
	@Override
	public void execute() {
		lightBulb.turnOffLight();
		
	}

	public TurnOffLightCommand(LightBulb lightBulb) {
		super();
		this.lightBulb = lightBulb;
	}

}
