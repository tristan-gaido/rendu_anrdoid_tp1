package com.example.myapplication;

public class Horaire {
    private String heureDepart;
    private String heureArrivee;
    private String typeTransport;

    public Horaire(String heureDepart, String heureArrivee, String typeTransport) {
        this.heureDepart = heureDepart;
        this.heureArrivee = heureArrivee;
        this.typeTransport = typeTransport;
    }

    public String getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(String heureDepart) {
        this.heureDepart = heureDepart;
    }

    public String getHeureArrivee() {
        return heureArrivee;
    }

    public void setHeureArrivee(String heureArrivee) {
        this.heureArrivee = heureArrivee;
    }

    public String getTypeTransport() {
        return typeTransport;
    }

    public void setTypeTransport(String typeTransport) {
        this.typeTransport = typeTransport;
    }
}
