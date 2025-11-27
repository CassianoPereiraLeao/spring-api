package com.api.spring_api.domain.entities.task;

import com.api.spring_api.domain.entities.user.User;

import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Table(name = "task")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private Boolean complete;
    private String description;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}