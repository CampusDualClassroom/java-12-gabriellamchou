package com.campusdual.classroom;

public class Car {

    public static final int MAX_SPEED = 120;
    public static final int MAX_ANGLE = 45;
    public static final int MIN_ANGLE = -45;

    public String brand;
    public String model;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car() {
    }

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public void start() {
        if (isTachometerEqualToZero()) {
            this.tachometer = 1000;
            System.out.println("Vehículo encendido");
        } else {
            System.out.println("El vehículo ya está encendido");
        }
    }

    public void stop() {
        if (this.speedometer == 0 && isTachometerGreaterThanZero()) {
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        } else {
            System.out.println("No se puede apagar el vehículo, primero tiene que estar detenido");
        }
    }

    public void accelerate() {
        if ((this.speedometer + 20) <= MAX_SPEED) {
            this.speedometer += 20;
        } else {
            this.speedometer = MAX_SPEED;
        }
    }

    public void brake() {
        if ((this.speedometer - 20) >= 0) {
            this.speedometer -= 20;
        } else {
            this.speedometer = 0;
        }
    }

    public void turnAngleOfWheels(int angle) {
        if (angle <= 0) {
            if ((this.wheelsAngle + angle) >= MIN_ANGLE) {
                this.wheelsAngle += angle;
            } else {
                this.wheelsAngle = -45;
            }
        } else {
            if ((this.wheelsAngle + angle) <= MAX_ANGLE) {
                this.wheelsAngle += angle;
            } else {
                this.wheelsAngle = 45;
            }
        }
    }

    public int getWheelsAngle() {
        return wheelsAngle;
    }

    public boolean isReverse() {
        return this.reverse;
    }

    public void setReverse(boolean reverse) {
        if (getSpeedometer() == 0) {
            this.reverse = reverse;
            if (reverse) {
                setGear("R");
            } else {
                setGear("N");
            }
        }
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public boolean isTachometerEqualToZero() {
        return this.tachometer == 0;
    }

    public boolean isTachometerGreaterThanZero() {
        return this.tachometer > 0;
    }

    public int getSpeedometer() {
        return speedometer;
    }
}
