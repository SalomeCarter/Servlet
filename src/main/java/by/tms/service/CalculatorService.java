package by.tms.service;

import by.tms.entity.Operation;
import by.tms.storage.InMemoryOperationStorage;
import by.tms.storage.OperationStorage;

import java.util.List;
import java.util.Optional;

public class CalculatorService {
//    private final OperationStorage storage = new InMemoryOperationStorage();

    public double calculate(CalculatorOperation operation) {
        operation.process();
        return operation.getFinalResult();
    }







//    public Operation calculate(Operation operation) {
//        switch (operation.getType()) {
//            case SUM:
//                operation.setResult(operation.getNum1() + operation.getNum2());
////                storage.save(operation);
//                return operation;
//            case SUB:
//                operation.setResult(operation.getNum1() - operation.getNum2());
////                storage.save(operation);
//                return operation;
//            case MUL:
//                operation.setResult(operation.getNum1() * operation.getNum2());
////                storage.save(operation);
//                return operation;
//            case DIV:
//                operation.setResult(operation.getNum1() / operation.getNum2());
////                storage.save(operation);
//                return operation;
//        }
//        return operation;
//    }
//    public List<Operation> findAll(){
//        return storage.findAll();
//    }
}
