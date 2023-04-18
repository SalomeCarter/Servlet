package by.tms.storage;
import by.tms.service.CalculatorOperation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InMemoryOperationStorage implements OperationStorage {

    private static final List<CalculatorOperation> history = new ArrayList<>();
    @Override
    public void save(CalculatorOperation operation) {
        history.add(operation);
    }

    @Override
    public List<CalculatorOperation> findAll() {
        return history;
    }

    public List<CalculatorOperation> findAllByUsername(String username) {
        //select * from user where id = ?
        return Collections.emptyList();
    }
}
