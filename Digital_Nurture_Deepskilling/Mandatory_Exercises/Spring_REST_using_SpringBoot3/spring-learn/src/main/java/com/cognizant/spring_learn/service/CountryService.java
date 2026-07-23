package com.cognizant.spring_learn.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.spring_learn.Country;


@Service
public class CountryService {


    private List<Country> countryList = new ArrayList<>();


    public CountryService(ApplicationContext context) {


        countryList.add(context.getBean("country1", Country.class));
        countryList.add(context.getBean("country2", Country.class));
        countryList.add(context.getBean("country3", Country.class));

    }


    public Country getCountry(String code) {


        for(Country country : countryList) {

            if(country.getCode().equalsIgnoreCase(code)) {

                return country;

            }
        }

        return null;
    }

}