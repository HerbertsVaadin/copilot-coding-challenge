package org.vaadin.challenges.datamanipulation;

public enum CategoriesWithIdsAndCountriesEnum {
    SUSTAINABLE_LIVING(1, "Japan"),
    VIRTUAL_REALITY(2, "Australia"),
    CYBERSECURITY(3, "South Africa"),
    GOURMET_COOKING(4, "Canada"),
    MINDFULNESS_MEDITATION(5, "Italy"),
    URBAN_GARDENING(6, "Mexico"),
    DIY_CRAFTS(7, "Sweden"),
    ASTROPHYSICS(8, "India"),
    VINTAGE_FASHION(9, "France"),
    EXTREME_SPORTS(10, "Argentina"),
    RENEWABLE_ENERGY(11, "Netherlands"),
    GRAPHIC_DESIGN(12, "New Zealand"),
    MARINE_BIOLOGY(13, "Singapore"),
    INDIE_MUSIC(14, "Ireland"),
    HOME_AUTOMATION(15, "South Korea"),
    CULTURAL_ANTHROPOLOGY(16, "Norway"),
    MOBILE_PHOTOGRAPHY(17, "Denmark"),
    ARTIFICIAL_INTELLIGENCE(18, "Spain"),
    SLOW_FASHION(19, "Portugal"),
    SPACE_EXPLORATION(20, "Switzerland"),
    ETHICAL_INVESTING(21, "Chile"),
    STREET_ART(22, "Thailand"),
    RENEWABLE_AGRICULTURE(23, "Israel"),
    ROBOTICS(24, "Malaysia"),
    WORLD_HISTORY(25, "Greece"),
    INTERIOR_DESIGN(26, "Poland"),
    FITNESS_TECHNOLOGY(27, "Turkey"),
    SUSTAINABLE_ARCHITECTURE(28, "Hungary"),
    QUANTUM_MECHANICS(29, "Russia"),
    FOOD_SCIENCE(30, "Czech Republic"),
    STAND_UP_COMEDY(31, "Egypt"),
    ALTERNATIVE_MEDICINE(32, "Peru"),
    URBAN_FARMING(33, "Colombia"),
    DIY_ELECTRONICS(34, "South Africa"),
    OUTDOOR_ADVENTURE(35, "Austria"),
    POLITICAL_SATIRE(36, "Belgium"),
    BEHAVIORAL_ECONOMICS(37, "Philippines"),
    RETRO_GAMING(38, "Vietnam"),
    AUGMENTED_REALITY(39, "Finland"),
    CRYPTOCURRENCY(40, "Kenya"),
    SUSTAINABLE_TRANSPORTATION(41, "Indonesia"),
    CREATIVE_WRITING(42, "Morocco"),
    ANCIENT_HISTORY(43, "Croatia"),
    DIY_HOME_IMPROVEMENT(44, "United Arab Emirates"),
    ASTRONOMY(45, "Saudi Arabia"),
    INDIE_FILMMAKING(46, "Iceland"),
    PERSONAL_FINANCE(47, "Panama"),
    VINTAGE_CARS(48, "Ukraine"),
    MARINE_CONSERVATION(49, "Costa Rica"),
    ADVENTURE_TRAVEL(0, "Brazil");

    private final int id;
    private final String country;

    CategoriesWithIdsAndCountriesEnum(int id, String country) {
        this.id = id;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public static CategoriesWithIdsAndCountriesEnum resolveFromId(int id) {
        for (CategoriesWithIdsAndCountriesEnum category : CategoriesWithIdsAndCountriesEnum.values()) {
            if (category.getId() == id) {
                return category;
            }
        }
        return null;
    }
}