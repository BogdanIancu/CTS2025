package ro.ase.acs.facade;

public class CarFacade {
    private BrakingSystem brakingSystem = new BrakingSystem();
    private LightingSystem lightingSystem = new LightingSystem();
    private Engine engine = new Engine();

    public void start() {
        brakingSystem.releaseAllBrakes();
        engine.startEngine();
        lightingSystem.turnOnLowBeam();
    }

    public void park() {
        brakingSystem.applyRearBrakes();
        engine.stopEngine();
        lightingSystem.turnOffAllLights();
    }

    public void emergencyBrake() {
        brakingSystem.applyFrontBrakes();
        brakingSystem.applyRearBrakes();
        engine.stopEngine();
        lightingSystem.turnOnBrakeLights();
        lightingSystem.turnOnHazardLights();
    }
}
