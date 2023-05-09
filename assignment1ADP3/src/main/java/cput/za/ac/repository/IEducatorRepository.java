package cput.za.ac.repository;

import cput.za.ac.domain.Educator;

import java.util.Set;

public interface IEducatorRepository extends IRepository<Educator, String> {
    public Set<Educator> getAll();
}
