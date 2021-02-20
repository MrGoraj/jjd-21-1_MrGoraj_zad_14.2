package pl.javastart.task;

import java.util.Queue;

class Inspection {

    int send(Queue queue) {
        if (queue.isEmpty()) {
            System.out.println("Brak pojazdów w kolejce. Fajrant.");
            return 0;
        } else {
            Vehicle inspectedVehicle = (Vehicle) queue.poll();
            System.out.println("Pojazd wysłany do przeglądu:");
            System.out.println(inspectedVehicle);
        }
        return -1;
    }
}
