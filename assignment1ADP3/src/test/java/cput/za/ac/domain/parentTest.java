package cput.za.ac.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class parentTest {
    @Test
    public void testParentBuilder() {
        parent parent = new parent.Builder()
                .parentId(1)
                .parentName("Enzo")
                .phoneNumber("0719449412")
                .build();

        assertEquals(1, parent.getParentId());
        assertEquals("Enzo", parent.getParentName());
        assertEquals("0719449412", parent.getPhoneNumber());
    }
}