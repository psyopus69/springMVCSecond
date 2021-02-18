package ru.dp29.springMVCSecond.dao;

import org.springframework.stereotype.Component;
import ru.dp29.springMVCSecond.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();
        people.add(new Person(++PEOPLE_COUNT, "Tom", 11, "jda@fa.tu"));
        people.add(new Person(++PEOPLE_COUNT, "Bob", 44, "drt@tr.tr"));
        people.add(new Person(++PEOPLE_COUNT, "John", 31, "as@as.as"));
        people.add(new Person(++PEOPLE_COUNT, "Bill", 26, "tre@er.fv"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }

    public void update(int id, Person updatePerson) {
        Person personToBeUpdated = show(id);
        personToBeUpdated.setName(updatePerson.getName());
        personToBeUpdated.setAge(updatePerson.getAge());
        personToBeUpdated.setEmail(updatePerson.getEmail());
    }
    public void delete(int id) {
        people.removeIf(el -> el.getId() == id);
    }
}
