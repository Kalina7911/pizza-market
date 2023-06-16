package pl.wszib.pizzamarket.services;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import pl.wszib.pizzamarket.data.entities.OpinionEntity;
import pl.wszib.pizzamarket.data.entities.OrderAddressEntity;
import pl.wszib.pizzamarket.data.entities.OrderEntity;
import pl.wszib.pizzamarket.data.entities.PizzaEntity;
import pl.wszib.pizzamarket.data.repositories.OpinionRepository;
import pl.wszib.pizzamarket.web.mappers.OpinionMapper;
import pl.wszib.pizzamarket.web.mappers.OrderAddressMapper;
import pl.wszib.pizzamarket.web.models.OpinionModel;
import pl.wszib.pizzamarket.web.models.OrderAddressModel;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OpinionService {

    private final OpinionRepository opinionRepository;

    public OpinionService(OpinionRepository opinionRepository) {
        this.opinionRepository = opinionRepository;
    }

    public void saveOpinion(OpinionModel opinionModel){

        OpinionEntity opinionEntity = OpinionMapper.toEntity(opinionModel);

        opinionRepository.save(opinionEntity);

    }
}
