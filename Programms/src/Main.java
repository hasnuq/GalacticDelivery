public class Main {
    public static void main(String[] args) {
        Planet earth = new Planet("Earth", 0, 0, "Oxygen-rich");
        SpaceStation marsStation = new SpaceStation("Mars Station", 100, 200, 2);
        LightDrone drone1 = new LightDrone("LD-001");
        HeavyDrone drone2 = new HeavyDrone("HD-100");
        Cargo cargo = new Cargo(30, "Medical Supplies");
        DeliveryTask task = new DeliveryTask(earth, marsStation, cargo);
        if (task.assignDrone(drone1)) {
            System.out.println("Дрон " + drone1.id + " взял груз и вылетает!");
        } else {
            System.out.println("Дрон " + drone1.id + " не может взять груз. Пробуем другой дрон...");
            if (task.assignDrone(drone2)) {
                System.out.println("Дрон " + drone2.id + " взял груз и вылетает!");
            } else {
                System.out.println("Нет доступных дронов для этого груза.");
                return;
            }
        }
        double distance = earth.distanceTo(marsStation);
        double flightTime = task.assignedDrone.calculateFlightTime(distance);
        System.out.println("Время полёта: " + flightTime + " часов.");

        task.assignedDrone.completeDelivery();
        System.out.println("Доставка завершена!");
    }
}
