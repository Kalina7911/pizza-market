package pl.wszib.pizzamarket.web.mappers;

import pl.wszib.pizzamarket.data.entities.OpinionEntity;
import pl.wszib.pizzamarket.data.entities.OrderAddressEntity;
import pl.wszib.pizzamarket.web.models.OpinionModel;
import pl.wszib.pizzamarket.web.models.OrderAddressModel;

public class OpinionMapper {

    public static OpinionEntity toEntity(OpinionModel model){
        OpinionEntity entity = new OpinionEntity();
        entity.setName(model.getName());
        entity.setContent(model.getContent());

        return entity;
    }
}
