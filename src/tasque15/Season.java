package org.src.tasque15;

public enum Season {
    SUMMER("awesome", "high"),
    SPRING("the best", "average"),
    FALL("zawmirannia", "quite low"),
    WINTER("perszyj snih", "very low");
    private String status;
    private String temperature;
    Season(String status, String temperature) {
        this.status = status;
        this.temperature = temperature;
    }
    public String getStatus() {
        return status;
    }
    public String getTemperature() {
        return temperature;
    }
}
