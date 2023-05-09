package za.ac.cput.repository;

import za.ac.cput.domain.Educator;

import java.util.Set;

public interface IEducatorRepository extends IRepository<Educator, String> {
    public Set<Educator> getAll();
}
