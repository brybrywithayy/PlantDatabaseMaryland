package marylandplants;

public class Plant {
    private String species;
    private String genus;
    private String variety;
    private PlantSize size;
    private SunPreference sunlight;
    private SoilPreference soil;

    public Plant(String species, String genus, String variety, PlantSize size, SunPreference sun,
                 SoilPreference soil) {
        this.species = species;
        this.genus = genus;
        this.variety = variety;
        this.size = size;
    }
}
