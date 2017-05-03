package com.example.cantri.doctoronline;

import android.os.Parcel;
import android.os.Parcelable;

public class UserProfile implements Parcelable {
    public static final Parcelable.Creator<UserProfile> CREATOR = new Parcelable.Creator<UserProfile>() {
        @Override
        public UserProfile createFromParcel(Parcel source) {
            return new UserProfile(source);
        }

        @Override
        public UserProfile[] newArray(int size) {
            return new UserProfile[size];
        }
    };
    private String key;
    private String fullName;
    private String type;
    private int yearOfBirth;
    private CreditCard creditCard;

    public UserProfile() {
    }

    public UserProfile(String key, String fullName, String type, int yearOfBirth, CreditCard creditCard) {
        this.key = key;
        this.fullName = fullName;
        this.type = type;
        this.yearOfBirth = yearOfBirth;
        this.creditCard = creditCard;
    }

    protected UserProfile(Parcel in) {
        this.key = in.readString();
        this.fullName = in.readString();
        this.type = in.readString();
        this.yearOfBirth = in.readInt();
        this.creditCard = in.readParcelable(CreditCard.class.getClassLoader());
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getType() {
        return this.type;
    }

    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public CreditCard getCreditCard() {
        return this.creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.key);
        dest.writeString(this.fullName);
        dest.writeString(this.type);
        dest.writeInt(this.yearOfBirth);
        dest.writeParcelable(this.creditCard, flags);
    }
}
