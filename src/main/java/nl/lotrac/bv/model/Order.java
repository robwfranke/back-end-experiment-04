package nl.lotrac.bv.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @Column(nullable = false, unique = true)
    private String ordernumber;

    @Column(nullable = false, length = 255)
    private String dwgnumber;


//    order statusorder kan zijn: pending, in work, finished, paid
    @Column(nullable = false, length = 255)
    private String statusorder;

    @Column
    private String apikey;

//    @OneToMany(
//            targetEntity = Authority.class,
//            mappedBy = "username",
//            cascade = CascadeType.ALL,
//            orphanRemoval = true,
//            fetch = FetchType.EAGER)


    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }

    public String getDwgnumber() {
        return dwgnumber;
    }

    public void setDwgnumber(String dwgnumber) {
        this.dwgnumber = dwgnumber;
    }

    public String getStatusorder() {
        return statusorder;
    }

    public void setStatusorder(String statusorder) {
        this.statusorder = statusorder;
    }

    public String getApikey() {
        return apikey;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }
}