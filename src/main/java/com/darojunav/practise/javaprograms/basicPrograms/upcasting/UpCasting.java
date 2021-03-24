package com.darojunav.practise.javaprograms.basicPrograms.upcasting;

public class UpCasting {
    public static void main(String[] args) {
        Mobile mobile = new Samsung();
        Samsung samsung = new Samsung();
        samsung.hasCamera = true;
        samsung.hasMusicPlayer = true;

        mobile.canCallOtherNumber = true;
        mobile.canReceiveCall = true;
        System.out.println(mobile.getNetworkType());
        System.out.println(mobile.networkType);
        System.out.println(mobile.getLion());
        System.out.println(mobile.lionResponse);

        //mobile.hasCamera = true; //not accessible
    }

}

