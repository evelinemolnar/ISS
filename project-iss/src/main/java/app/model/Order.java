package app.model;

import javax.persistence.*;

@Entity
@Table(name = "Order")
public class Order implements Entitate<Integer> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer agentId;
    private Integer productId;
    private String numeClient;
    private String adresaClient;
    private String telefonClient;

    public Order(){

    }

    public Order(Integer agentId, Integer produsId, String numeClient, String adresaClient, String telefonClient) {
        this.agentId = agentId;
        this.productId = produsId;
        this.numeClient = numeClient;
        this.adresaClient = adresaClient;
        this.telefonClient = telefonClient;
    }


    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
    @Override
    public Integer getId() {
        return id;
    }
    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public String getAdresaClient() {
        return adresaClient;
    }

    public void setAdresaClient(String adresaClient) {
        this.adresaClient = adresaClient;
    }

    public String getTelefonClient() {
        return telefonClient;
    }

    public void setTelefonClient(String telefonClient) {
        this.telefonClient = telefonClient;
    }


}
