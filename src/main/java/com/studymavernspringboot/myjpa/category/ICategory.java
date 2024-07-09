package com.studymavernspringboot.myjpa.category;

public interface ICategory {
    Long getId();
    void setId(Long id);

    String getName();
    void setName(String name);

    default void copyFields(ICategory from) {
        if ( from == null ) {
            return;
        }
        if ( from.getId() != null ) {
            this.setId(from.getId());
        }
        if ( from.getName() != null && !from.getName().isEmpty() ) {
            this.setName(from.getName());
        }
    }
}
