package com.darojunav.practise.javaprograms.basicPrograms.upcasting;

class Mobile {
    public boolean canReceiveCall;
    public boolean canCallOtherNumber;
    public String networkType = " 4G ";
    public String lionResponse = "Lion in the Animal Class";

    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public String getLion() {
        return lionResponse;
    }
}
