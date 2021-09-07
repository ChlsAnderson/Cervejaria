package meuprojeto.cervejaria.mapper;

import meuprojeto.cervejaria.dto.BeerDTO;
import meuprojeto.cervejaria.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
