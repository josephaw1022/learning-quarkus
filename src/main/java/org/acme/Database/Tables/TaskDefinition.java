package org.acme.Database.Tables;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "task_definition")
public class TaskDefinition extends PanacheEntity {
    public String name;
    public String description;
}
