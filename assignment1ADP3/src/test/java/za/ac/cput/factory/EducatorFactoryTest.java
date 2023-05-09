package za.ac.cput.factory;
/*   EducatorFactoryTest.java
     FactoryTest  for Educator
     Author:Rodrigue Ndzana Ngonga Beaubane (219384096)
     Date: 07 April 2022
*/

import cput.za.ac.factory.EducatorFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import cput.za.ac.domain.Educator;

class EducatorFactoryTest {
    @Test
    void createEducator() {
        Educator educator = EducatorFactory.createEducator("Mr Kruben Naidoo", "34 Uyee", "Male");
        Assertions.assertNotNull(educator);
        System.out.println(educator.toString());
    }
}