package com.example.cantri.doctoronline;

import android.os.Parcel;
import android.os.Parcelable;

public class CreditCard implements Parcelable {
    public static final Parcelable.Creator<CreditCard> CREATOR = new Parcelable.Creator<CreditCard>() {
        @Override
        public CreditCard createFromParcel(Parcel source) {
            return new CreditCard(source);
        }

        @Override
        public CreditCard[] newArray(int size) {
            return new CreditCard[size];
        }
    };
    private String cardNumber;
    private String ownerName;
    private String CSV;

    public CreditCard() {
    }

    public CreditCard(String cardNumber, String ownerName, String CSV) {
        this.cardNumber = cardNumber;
        this.ownerName = ownerName;
        this.CSV = CSV;
    }

    protected CreditCard(Parcel in) {
        this.cardNumber = in.readString();
        this.ownerName = in.readString();
        this.CSV = in.readString();
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getCSV() {
        return this.CSV;
    }

    public void setCSV(String CSV) {
        this.CSV = CSV;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.cardNumber);
        dest.writeString(this.ownerName);
        dest.writeString(this.CSV);
    }
}
