package cput.za.ac.factory;

import cput.za.ac.domain.parent;

public class parentFactory {
    public static parent createParent(int parent_id, String parent_name, String phone_number) {
        return new parent.Builder()
                .parentId(parent_id)
                .parentName(parent_name)
                .phoneNumber(phone_number)
                .build();
    }
    parent parent = parentFactory.createParent(1, "Enzo", "0719449412");
}
