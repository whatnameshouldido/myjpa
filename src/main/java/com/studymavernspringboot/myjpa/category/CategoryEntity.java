package com.studymavernspringboot.myjpa.category;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="category_tbl")
public class CategoryEntity implements ICategory{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(length = 20, unique = true)
    private String name;

    @Override
    public String toString() {
        return String.format("ID:%6d, 이름:%s"
                , this.id, this.name);
    }
}
