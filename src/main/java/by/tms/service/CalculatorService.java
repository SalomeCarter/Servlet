package by.tms.service;
import by.tms.storage.InMemoryOperationStorage;
import by.tms.storage.OperationStorage;

import java.util.List;
import java.util.Optional;

public class CalculatorService {
    private static CalculatorService instance;
    private final OperationStorage operationStorage = new InMemoryOperationStorage();
    public CalculatorService() {

    }

    public static CalculatorService getInstance() {
        if (instance == null) {
            instance = new CalculatorService();
        }
        return instance;
    }

    public double calculate(CalculatorOperation operation) {
        operation.process();
        operationStorage.save(operation);
        return operation.getFinalResult();
    }

    public List<CalculatorOperation> findAllByUsername(String username) {
        return operationStorage.findAllByUsername(username);
    }

}
