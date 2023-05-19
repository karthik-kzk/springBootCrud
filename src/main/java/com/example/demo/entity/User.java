package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatusCode;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="users")
@Getter
@Setter
public class User  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   @Column(nullable = false)
    private String firstName;
   @Column(nullable = false)
   private String LastName;
   @Column(unique = true,nullable = false)
   private String email;

}
