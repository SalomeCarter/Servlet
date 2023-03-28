package by.tms.storage;

import by.tms.entity.Operation;

import java.util.ArrayList;
import java.util.List;

public class InMemoryOperationStorage implements OperationStorage {

    private static final List<Operation> history = new ArrayList<>();
    @Override
    public void save(Operation operation) {
        history.add(operation);
    }

    @Override
    public List<Operation> findAll() {
        return history;
    }
}
