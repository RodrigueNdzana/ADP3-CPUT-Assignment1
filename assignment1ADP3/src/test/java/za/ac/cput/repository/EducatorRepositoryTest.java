package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Educator;
import za.ac.cput.factory.EducatorFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class EducatorRepositoryTest {
    private static EducatorRepository repository = EducatorRepository.getRepository();
    private static Educator educator = EducatorFactory.createEducator("MR Burger", "45Montague", "male");

    @Test
    void a_create() {
        System.out.println("------------------------- Create Educator ----------------------------------------");
        // since I have already created the repository now I am adding to the repositoryy
        Educator created = repository.create(educator);
        // the assert equal kinda check if the id we are getting from the Educator repository is the same with the one created
        assertEquals(educator.getEducator_Id(), created.getEducator_Id());
        System.out.println("Create: " + created);
    }

    @Test
    void b_read() {
        System.out.println("------------------------- Read Educator ----------------------------------------");
        Educator read = repository.read(educator.getEducator_Id());
        assertNotNull(read); // assertEqual could also be used
        System.out.println("Read Educator: " + read);
    }

    @Test
    void c_update() {
        System.out.println("------------------------- Update Educator ----------------------------------------");
        Educator updated = new Educator.Builder().copy(educator).setEdu_Name("Mike")
                .setEdu_Address("53 Victoria")
                .setEdu_Gender("Male")
                .build();
        assertNotNull(repository.update(updated)); // if this object return null that mean it going to fail
        System.out.println("Updated Educator: " + updated);
    }

    @Test
    void d_delete() {
        System.out.println("------------------------- Delete Educator ----------------------------------------");
        boolean success = repository.delete(educator.getEducator_Id());
        assertTrue(success);
        System.out.println("Delete educator: " + success);
    }

    @Test
    void e_getAll() {
        System.out.println("------------------------- Show All Educator ----------------------------------------");
        System.out.println("Show all: ");
        System.out.println(repository.getAll());
    }

}