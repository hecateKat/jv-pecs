package core.mate.academy.service;

import core.mate.academy.model.Machine;

import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> machines;
        machines = switch (type.getSimpleName()) {
            case "Bulldozer" -> new BulldozerProducer().get();
            case "Excavator" -> new ExcavatorProducer().get();
            case "Truck" -> new TruckProducer().get();
            default -> new ArrayList<>();
        };
        return new ArrayList<>(machines);

    }

    @Override
    public void fill(List<? super T> machines, T value) {
        machines.replaceAll(ignored -> value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}