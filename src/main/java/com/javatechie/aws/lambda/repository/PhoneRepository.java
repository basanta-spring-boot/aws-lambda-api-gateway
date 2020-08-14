package com.javatechie.aws.lambda.repository;

import com.javatechie.aws.lambda.model.Phone;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class PhoneRepository {


    public List<Phone> findAllPhones() {
        return Stream.of(new Phone("XY101", "7 pro", "One Plus"),
                new Phone("KW36u", "Note 8", "Mi"),
                new Phone("KJ872", "Galaxy", "Samsung"),
                new Phone("JD278", "iPhone 11", "Apple"))
                .collect(Collectors.toList());
    }
}
