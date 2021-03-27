package com.example.springDemo1.Domain;

public class PetroEngine implements IEngine{
    
    private String engineType;

    public PetroEngine(String engineType) {
        this.engineType = engineType;
    }


    @Override
    public String getEngineType() {
        return engineType;
    }

    @Override
    public double getEnginePower() {
        return 200;
    }

    @Override
    public String toString() {
        return "PetroEngine{" +
                "engineType='" + engineType + '\'' +
                '}';
    }
}
