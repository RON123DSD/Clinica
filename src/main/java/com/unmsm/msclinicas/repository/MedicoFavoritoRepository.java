package com.unmsm.msclinicas.repository;

import com.unmsm.msclinicas.entity.MedicoFavorito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoFavoritoRepository extends JpaRepository<MedicoFavorito, Integer> {
}
