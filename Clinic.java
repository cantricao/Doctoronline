package com.example.cantri.doctoronline;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;
import java.util.Map;

public class Clinic implements Parcelable {
    public static final Creator<Clinic> CREATOR = new Creator<Clinic>() {
        @Override
        public Clinic createFromParcel(Parcel source) {
            return new Clinic(source);
        }

        @Override
        public Clinic[] newArray(int size) {
            return new Clinic[size];
        }
    };
    private String key;
    private String name;
    private String address;
    private String owner;
    private String specialty;
    private String description;
    private Map<String, String> services;
    private Map<String, Integer> priceList;

    public Clinic() {
    }

    public Clinic(String key, String name, String address, String owner, String specialty) {
        this.key = key;
        this.name = name;
        this.address = address;
        this.owner = owner;
        this.specialty = specialty;
        services = new HashMap<>();
        services.put("a", "a");
        priceList = new HashMap<>();
        priceList.put("a", 3);
    }

    protected Clinic(Parcel in) {
        this.key = in.readString();
        this.name = in.readString();
        this.address = in.readString();
        this.owner = in.readString();
        this.specialty = in.readString();
        this.description = in.readString();
        int servicesSize = in.readInt();
        this.services = new HashMap<String, String>(servicesSize);
        for (int i = 0; i < servicesSize; i++) {
            String key = in.readString();
            String value = in.readString();
            this.services.put(key, value);
        }
        int priceListSize = in.readInt();
        this.priceList = new HashMap<String, Integer>(priceListSize);
        for (int i = 0; i < priceListSize; i++) {
            String key = in.readString();
            Integer value = (Integer) in.readValue(Integer.class.getClassLoader());
            this.priceList.put(key, value);
        }
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getSpecialty() {
        return this.specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, String> getServices() {
        return this.services;
    }

    public void setServices(Map<String, String> services) {
        this.services = services;
    }

    public Map<String, Integer> getPriceList() {
        return this.priceList;
    }

    public void setPriceList(Map<String, Integer> priceList) {
        this.priceList = priceList;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.key);
        dest.writeString(this.name);
        dest.writeString(this.address);
        dest.writeString(this.owner);
        dest.writeString(this.specialty);
        dest.writeString(this.description);
        dest.writeInt(this.services.size());
        for (Map.Entry<String, String> entry : this.services.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeString(entry.getValue());
        }
        dest.writeInt(this.priceList.size());
        for (Map.Entry<String, Integer> entry : this.priceList.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeValue(entry.getValue());
        }
    }
}
