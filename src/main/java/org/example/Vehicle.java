package org.example;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Inheritance(strategy =InheritanceType.JOINED)
public class Vehicle {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "V_ID")
    private int vehicleId;
    @Column(name = "V_name")
    private String vehicleName;


    /*@ManyToMany
    private Collection<Userdetails> user=new ArrayList<>();
*/

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

}
