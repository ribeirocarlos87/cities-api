package com.carlosribeiro.citiesapi.countries;

import com.carlosribeiro.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository <Country, Long>{
}
