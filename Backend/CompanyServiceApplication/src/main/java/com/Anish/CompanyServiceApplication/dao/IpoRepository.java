package com.Anish.CompanyServiceApplication.dao;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Anish.CompanyServiceApplication.model.Ipo;

@Repository
public interface IpoRepository extends MongoRepository<Ipo, String>
{
    public Optional<Ipo> findById(String id);
    public void deleteById(String id);
}
