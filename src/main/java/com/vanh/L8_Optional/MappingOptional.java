package com.vanh.L8_Optional;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MappingOptional {


    public static void main(String[] args) {
        List<Optional<Integer>> list = Arrays.asList(Optional.of(1), Optional.empty(), Optional.empty(), Optional.of(1) ,Optional.of(1));

        List<Integer> nonNullList = list.stream().filter(Optional::isPresent).map(Optional::get).collect(Collectors.toList());
        System.out.println(nonNullList);
    }

}
