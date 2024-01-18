package org.vaadin.challenges.datamanipulation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.io.InputStream;

public class CategoriesWithIdsAndCountriesEnumTest {

    // add method to  read the file contents from src/main/resources/categories_with_ids_and_countries.txt into a list of Strings
    private List<String> readFileContents() throws IOException {
        InputStream inputStream = getClass().getResourceAsStream("/META-INF/resources/challenge-data/categories/categories-with-ids-and-countries.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        return reader.lines().collect(Collectors.toList());
    }

    @Test
    public void testCategoriesWithIdsAndCountriesEnum() throws IOException {
        // Get the contents of the file used to create CategoriesWithIdsAndCountriesEnum

        //  write code to read the file contents from src/main/resources/categories_with_ids_and_countries.txt
        //  and store the contents in a String variable named fileContents
        List<String> fileContents = readFileContents();

        for (String row : fileContents) {
            assertRowMatchesExistingEnum(row);
        }
    }

    private void assertRowMatchesExistingEnum(String row) {
        // Split the file contents into individual parts
        String[] parts = row.split(";");

        // Get the expected values from the file contents
        String categoryName = parts[0];
        int id = Integer.parseInt(parts[1]);
        String country = parts[2];

        var resolvedEnum = CategoriesWithIdsAndCountriesEnum.resolveFromId(id);
        // Get the actual values from the CategoriesWithIdsAndCountriesEnum
        String actualCategoryName = resolvedEnum.name();
        int actualId = resolvedEnum.getId();
        String actualCountry = resolvedEnum.getCountry();

        // Compare the expected values with the actual values
        Assertions.assertEquals(categoryNameToEnumName(categoryName), actualCategoryName);
        Assertions.assertEquals(id, actualId);
        Assertions.assertEquals(country, actualCountry);
    }

    private String categoryNameToEnumName(String name) {
        return name.toUpperCase().replaceAll("[\\.\\-\s]", "_");
    }
}
