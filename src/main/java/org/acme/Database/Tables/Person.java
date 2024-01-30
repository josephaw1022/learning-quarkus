package org.acme.Database.Tables;

import java.time.LocalDate;

import org.acme.Database.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "person")
public class Person extends PanacheEntity {
    public Status status;
    public String name;
    public LocalDate birth;
}