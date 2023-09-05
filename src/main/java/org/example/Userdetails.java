package org.example;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
//@Cacheable
//@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_ONLY)

@NamedNativeQuery(name = "userdetails.userid", query = "select * from user_details where User_ID = ?0",resultClass = Userdetails.class)

@NamedQuery(name = "userdetails.username",query = "from Userdetails where username =:name")
@Table(name = "user_details")
public class Userdetails {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "User_ID")
    private int userid;
    @Column(name = "User_Name")
    private String username;
    /*@OneToOne
    @JoinColumn(name = "User_Vehicle")
    private Vehicle vehicle;*/
   /* @ManyToMany
    private  Collection<Vehicle> vehicles=new ArrayList<>();
*/
    /*
    @OneToMany(mappedBy = "user",cascade =CascadeType.PERSIST)
    private Collection<Vehicle> vehicles =new ArrayList<>();*/

    /*@Embedded
    @AttributeOverrides({
            @AttributeOverride(name ="street",column = @Column(name = "home_street_address")),
            @AttributeOverride(name = "city",column = @Column(name = "home_city_address"))
    })
    private Address homeaddress;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street",column = @Column(name = "office_street_address")),
            @AttributeOverride(name = "city",column = @Column(name="office_city_address"))
    })
    private  Address officeaddress;
    @ElementCollection(fetch =FetchType.EAGER)
            @JoinTable(name = "User_Addresses",joinColumns = @JoinColumn(name = "User_ID"))
    private Collection<Address> listOfAdresses=new ArrayList<Address>();*/
    public Userdetails(){}
    public Userdetails(int userid, String username) {
        this.userid=userid;
        this.username=username;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    @Override
    public String toString() {
        return "Userdetails{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                '}';
    }
}
