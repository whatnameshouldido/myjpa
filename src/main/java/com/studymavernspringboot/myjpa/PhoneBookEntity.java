package com.studymavernspringboot.myjpa;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="phoneBook")
public class PhoneBookEntity implements IPhoneBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(length = 50, unique = true)
    private String name;

    @NotNull
    private ECategory category;

    @NotNull
    @Column(length = 20)
    private String phoneNumber;

    @NotNull
    @Column(length = 200)
    private String email;


    @Override
    public String toString() {
        return String.format("ID:%6d, 이름:%s, 분류:%s, 번호:%s, 이메일:%s"
                , this.id, this.name, this.category, this.phoneNumber, this.email);
    }
}
