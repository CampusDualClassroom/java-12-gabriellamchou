package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {

        Car coche = new Car("Ford", "Focus", "100");

        // Encender el coche
        coche.start();
        // Encender el coche cuando ya está encendido, comprobar que no se puede
        coche.start();
        // Apagar el coche
        coche.stop();
        // Apagar el coche mientras todavía está en movimiento (y comprobar que no se puede)
        coche.start();
        coche.accelerate();
        System.out.println("Velocidad: " + coche.getSpeedometer());
        coche.stop();
        // Acelerar el coche
        coche.accelerate();
        // Acelerar hasta intentar superar la velocidad máxima (y comprobar que no se puede)
        for (int i = 0; i < 10; i++) {
            coche.accelerate();
        }
        System.out.println("Velocidad: " + coche.getSpeedometer());
        // Frenar
        coche.brake();
        System.out.println("Velocidad: " + coche.getSpeedometer());
        // Frenar hasta un valor negativo (y comprobar que no se puede)
        for (int i = 0; i < 10; i++) {
            coche.brake();
        }
        System.out.println("Velocidad: " + coche.getSpeedometer());
        // Girar el volante 20 grados
        System.out.println("Ángulo ruedas: " + coche.getWheelsAngle());
        coche.turnAngleOfWheels(20);
        System.out.println("Ángulo ruedas: " + coche.getWheelsAngle());
        // Girar el volante más de 45 grados ó -45 grados (y comprobar que no se puede)
        coche.turnAngleOfWheels(100);
        System.out.println("Ángulo ruedas: " + coche.getWheelsAngle());
        // Detener el coche y poner marcha atrás
        coche.stop();
        coche.setReverse(true);
        System.out.println(coche.isReverse());
        // Poner marcha atrás mientras el coche está en movimiento marcha adelante (y comprobar que no se puede)
        coche.setReverse(false);
        coche.start();
        coche.accelerate();
        System.out.println(coche.getSpeedometer());
        coche.setReverse(true);
        System.out.println(coche.isReverse());
    }

}