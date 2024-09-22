package hiber.model;

import javax.persistence.*;


@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private Long id;

    @Column(name = "model")
    String model;

    @Column(name = "series")
    int series;

    public Car(String model, int series) {
        this.model=model;
        this.series=series;
    }

    public Car() {

    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

}
