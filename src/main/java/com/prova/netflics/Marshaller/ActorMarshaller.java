package com.prova.netflics.Marshaller;

import com.prova.netflics.dao.ActorDao;
import com.prova.netflics.dto.ActorDTO;
import org.springframework.stereotype.Component;

@Component
public class ActorMarshaller {
    public ActorDTO toDTO(ActorDao actorDao) {
        ActorDTO actorDTO = new ActorDTO();
        actorDTO.setId(actorDao.getId());
        actorDTO.setName(actorDao.getName());
        actorDTO.setNationality(actorDao.getNationality());
        actorDTO.setDateOfBirth(actorDao.getDateOfBirth());
        return actorDTO;
    }

    public ActorDao fromDTO(ActorDTO actorDTO) {
        ActorDao actorDao = new ActorDao();
        actorDao.setId(actorDTO.getId());
        actorDao.setName(actorDTO.getName());
        actorDao.setNationality(actorDTO.getNationality());
        actorDao.setDateOfBirth(actorDTO.getDateOfBirth());
        return actorDao;
    }
}
