package marylandplants;

public class PlantSize {
    // base measurements are in cm
    private int maxHeight;
    private int maxWidth;
    private int minHeight;
    private int minWidth;

    public PlantSize() {
        this(0, 0, 0, 0);
    }

    public PlantSize(int maxHeight, int maxWidth) {
        this(maxHeight, maxWidth, 0, 0);
    }

    public PlantSize(int maxHeight, int maxWidth, int minHeight, int minWidth) {
        this.maxHeight = maxHeight;
        this.maxWidth = maxWidth;
        this.minHeight = minHeight;
        this.minWidth = minWidth;
    }


}
