package shop.Jarvis.app.demo.calculator.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import shop.Jarvis.app.demo.calculator.entity.Calculator;


@Repository
public interface CalculatorRepository extends MongoRepository<Calculator, Long> {

}
