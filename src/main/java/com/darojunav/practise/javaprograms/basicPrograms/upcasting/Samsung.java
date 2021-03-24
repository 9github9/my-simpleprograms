package com.darojunav.practise.javaprograms.basicPrograms.upcasting;

class Samsung extends Mobile {
    public boolean hasCamera;
    public boolean hasMusicPlayer;
    public String networkType = " 5G ";
    public String smsSize = "1000";
    public String lionResponse = "Lion in the Lion Class";

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
