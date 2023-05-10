package cput.za.ac.domain;

public class parent {
    private int parent_id;
    private String parent_name;
    private String phone_number;
    private String Address;
    private String email;
    private int number;

    public static class Builder {
        private int parent_id;
        private String parent_name;
        private String phone_number;

        public Builder parentId(int value) {
            parent_id = value;
            return this;
        }

        public Builder parentName(String value) {
            parent_name = value;
            return this;
        }

        public Builder phoneNumber(String value) {
            phone_number = value;
            return this;
        }

        public parent build() {
            return new parent(this);
        }
    }

    private parent(Builder builder) {
        parent_id = builder.parent_id;
        parent_name = builder.parent_name;
        phone_number = builder.phone_number;
    }

    public int getParentId() {
        return parent_id;
    }

    public String getParentName() {
        return parent_name;
    }

    public String getPhoneNumber() {
        return phone_number;
    }
}
