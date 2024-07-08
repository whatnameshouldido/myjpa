package com.studymavernspringboot.myjpa.category;

import com.studymavernspringboot.myjpa.IPhoneBook;

public interface ICategory {
    Long getId();
    void setId(Long id);

    String getName();
    void setName(String name);

    default void copyFields(IPhoneBook from) {
        if ( from == null ) {
            return;
        }
        if ( from.getId() != null ) {
            this.setId(from.getId());
        }
        if ( from.getName() != null && !from.getName().isEmpty() ) {
            this.setName(from.getName());
        }
        if ( from.getCategory() != null ) {
            this.setCategory(from.getCategory());
        }
        if ( from.getPhoneNumber() != null && !from.getPhoneNumber().isEmpty() ) {
            this.setPhoneNumber(from.getPhoneNumber());
        }
        if ( from.getEmail() != null && !from.getEmail().isEmpty() ) {
            this.setEmail(from.getEmail());
        }
    }
}
