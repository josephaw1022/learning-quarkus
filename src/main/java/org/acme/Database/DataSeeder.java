package org.acme.Database;

import org.acme.Database.Tables.Person;
import org.acme.Database.Tables.TaskDefinition;
import org.jboss.logging.Logger;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class DataSeeder {

    private static final Logger logger = Logger.getLogger(DataSeeder.class);
    
    @Transactional
    public void seedData(){
        Person person = new Person();
        person.name = "John Doe";
        person.birth = java.time.LocalDate.of(1980, 1, 1);
        person.status = Status.Alive;
        person.persist();


        logger.info("Person created: " + person.id);
        
        TaskDefinition task = new TaskDefinition();
        task.name = "Task 1";
        task.description = "This is the first task";
        task.persist();

        logger.info("Task created: " + task.id);
    }

}
