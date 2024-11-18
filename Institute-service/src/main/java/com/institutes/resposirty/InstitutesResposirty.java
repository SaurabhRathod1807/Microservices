package com.institutes.resposirty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.institutes.models.Institutes;

@Repository
public interface InstitutesResposirty extends JpaRepository<Institutes, Long> {

}
